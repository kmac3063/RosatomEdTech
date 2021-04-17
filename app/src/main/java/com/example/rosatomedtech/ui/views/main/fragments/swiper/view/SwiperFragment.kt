package com.example.rosatomedtech.ui.views.main.fragments.swiper.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.objects.CardStackInfo
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.base.view.BaseFragment
import com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor.SwiperInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.interactor.SwiperMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.swiper.presenter.SwiperPresenter
import com.yuyakaido.android.cardstackview.CardStackLayoutManager
import com.yuyakaido.android.cardstackview.CardStackView

class SwiperFragment : BaseFragment(), SwiperMVPView {
    lateinit var presenter: SwiperPresenter<SwiperMVPView, SwiperMVPInteractor>
    lateinit var cardStack: CardStackView

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
        return inflater.inflate(R.layout.fragment_swiper,container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = SwiperPresenter(
            SwiperInteractor(AppPreferenceHelper(requireContext()))
        )

        presenter.onAttach(this)

        cardStack = requireActivity().findViewById(R.id.card_stack)
        cardStack.layoutManager = CardStackLayoutManager(requireContext())
        cardStack.adapter = CardStackAdapter(presenter.getCardStackList())
    }

    inner class CardStackAdapter(var itemList: List<CardStackInfo>): RecyclerView.Adapter<CardStackViewHolder>() {
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

        fun bind(item: CardStackInfo) {

        }
    }
}
