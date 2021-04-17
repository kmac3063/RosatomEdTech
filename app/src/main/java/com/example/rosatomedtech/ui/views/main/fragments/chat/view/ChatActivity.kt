package com.example.rosatomedtech.ui.views.main.fragments.chat.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.main.fragments.chat.interactor.ChatInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.interactor.ChatMVPInteractor
import com.example.rosatomedtech.ui.views.main.fragments.chat.presenter.ChatPresenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class ChatActivity : BaseActivity(), ChatMVPView {
    lateinit var presenter: ChatPresenter<ChatMVPView, ChatMVPInteractor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = ChatPresenter(
            ChatInteractor(AppPreferenceHelper(this))
        )
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        openChatActivity()
    }

    override fun openChatActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
