package com.example.rosatomedtech.ui.validators

import com.example.rosatomedtech.R

class PhoneValidator : BaseValidator<String> {
    override fun isValid(value: String): Boolean {
        return (value.length == 18)
    }

    override val errorCode: Int?
        get() = R.string.phone_error
}