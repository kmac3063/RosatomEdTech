package com.example.rosatomedtech.data.model

import com.example.rosatomedtech.data.objects.CardStackInfo
import com.example.rosatomedtech.data.objects.Student
import java.util.*
import kotlin.collections.ArrayList

object DataModel : MVPDataModel {
    override fun doCreateNewStudent(student: Student) {
        TODO("Not yet implemented")
    }

    override fun getCardStackList(): List<CardStackInfo> {
        val imgList = ArrayList<String>()
        imgList.addAll(listOf(
            "https://im0-tub-ru.yandex.net/i?id=d5c38a7085dc351b7aef2ac916173a30-l&n=13",
            "https://im0-tub-ru.yandex.net/i?id=cc826c915346e40c865f9593b0d41d7b-l&n=13",
            "https://pbs.twimg.com/media/EesCYUEWsAAi9Za.png",
            "https://i05.fotocdn.net/s126/8da13787b5166283/public_pin_l/2874426642.jpg",
            "https://im0-tub-ru.yandex.net/i?id=d5c38a7085dc351b7aef2ac916173a30-l&n=13",
            "https://im0-tub-ru.yandex.net/i?id=cc826c915346e40c865f9593b0d41d7b-l&n=13",
            "https://pbs.twimg.com/media/EesCYUEWsAAi9Za.png",
            "https://i05.fotocdn.net/s126/8da13787b5166283/public_pin_l/2874426642.jpg",
        ))
        val list = ArrayList<CardStackInfo>()
        for (el in imgList) {
            list.add(CardStackInfo(el))
        }
        return list
    }
}