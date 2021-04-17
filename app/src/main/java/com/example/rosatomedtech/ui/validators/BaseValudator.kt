package com.example.rosatomedtech.ui.validators

interface BaseValidator<T> {
    fun isValid(value: T): Boolean
    val errorCode: Int?
}