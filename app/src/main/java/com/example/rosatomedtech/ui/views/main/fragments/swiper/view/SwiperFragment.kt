package com.example.rosatomedtech.ui.views.main.fragments.swiper.view

import android.media.Image
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.objects.Card
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseFragment
import com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor.SwiperInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor.SwiperMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.presenter.SwiperPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity
import com.squareup.picasso.Picasso
import com.yuyakaido.android.cardstackview.*


class SwiperFragment : BaseFragment(), SwiperMVPView {
    lateinit var presenter: SwiperPresenter<SwiperMVPView, SwiperMVPInteractor>
    lateinit var cardStack: CardStackView
    lateinit var likedImageView: ImageView

    companion object {
        fun newInstance(): SwiperFragment {
            val fragment = SwiperFragment()

//        val args = Bundle()
//        fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_swiper, container, false)
        cardStack = view.findViewById(R.id.card_stack)
        val manager = CardStackLayoutManager(requireContext(), object: CardStackListener {
            override fun onCardDragging(direction: Direction?, ratio: Float) {

            }

            override fun onCardSwiped(direction: Direction?) {
                if (direction == Direction.Left) {
                    (getBaseActivity() as MainActivity).cardSwiped()
                }
            }

            override fun onCardRewound() {
            }

            override fun onCardCanceled() {
            }

            override fun onCardAppeared(view: View?, position: Int) {
            }

            override fun onCardDisappeared(view: View?, position: Int) {
            }

        })
        val setting = SwipeAnimationSetting.Builder()
            .setDirection(Direction.Right)
            .setDuration(200)
            .setInterpolator(AccelerateInterpolator())
            .build()
        manager.setSwipeAnimationSetting(setting)
        cardStack.layoutManager = manager
        cardStack.adapter = CardStackAdapter(presenter.getCardStackList())
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = SwiperPresenter(
            SwiperInteractor(AppPreferenceHelper(requireContext()))
        )

        presenter.onAttach(this)

    }

    inner class CardStackAdapter(var itemList: List<Card>): RecyclerView.Adapter<CardStackViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardStackViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.card_stack_view_holder, parent, false)
            return CardStackViewHolder(view)
        }

        override fun getItemCount() = itemList.size

        override fun onBindViewHolder(holder: CardStackViewHolder, position: Int) {
            holder.bind(itemList[position])
        }

    }

    inner class CardStackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.iw_card_stack)

        fun bind(item: Card) {
            Log.d("swiper", "img: ${item.imgUrl}")
            Picasso.get().load(item.imgUrl).error(R.drawable.ic_baseline_thumb_up_24).fit().into(
                imageView,
                object : com.squareup.picasso.Callback {
                    override fun onSuccess() {

                    }

                    override fun onError(e: Exception?) {
                        Log.d("swiper", e.toString())
                    }

                })
        }
    }
}
