package com.example.rosatomedtech.data.model

import com.example.rosatomedtech.data.objects.Card
import com.example.rosatomedtech.data.objects.Student
import kotlin.collections.ArrayList


object DataModel: MVPDataModel {

    override fun doCreateNewStudent(student: Student) {
        TODO("Not yet implemented")
    }

    override fun getCardStackList(): List<Card> {
        val imgList = ArrayList<String>()
        imgList.addAll(listOf(
            "https://sun9-47.userapi.com/impg/NIwFKD2WE2HT1ho85T9C2ptwFuv6lpnIQNjRSA/QQ3qdxxpKlE.jpg?size=1195x1450&quality=96&sign=56dcc0c6960235926a3c3400a8608c56&type=album",
            "https://sun9-23.userapi.com/impg/zEHR4tBUS1FdzWrLmSHEB5x0RoWJFGcpNgYNzw/f8WP8kBuac0.jpg?size=1154x1429&quality=96&sign=c798588b10dda4c6432ff9c822c18ce3&type=album",
            "https://sun9-38.userapi.com/impg/RsJieJTb07rczWESvSCkGFRiT_8qj95gGYW7uQ/5Mg3q6yOCjw.jpg?size=1164x1442&quality=96&sign=0bd9a548a99fd0f064da84f8c6a7b23b&type=album"
        ))
        val list = ArrayList<Card>()
        for (i in imgList.indices) {
            list.add(Card(i+1, imgList[i]))
        }
        return list
    }
}