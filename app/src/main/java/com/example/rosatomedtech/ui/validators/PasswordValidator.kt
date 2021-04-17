package com.example.rosatomedtech.ui.validators

import com.example.rosatomedtech.R

class PasswordValidator : BaseValidator<String> {
    override fun isValid(value: String): Boolean {
        return value.length > 5
    }

    override val errorCode: Int?
        get() = R.string.small_password_error
}