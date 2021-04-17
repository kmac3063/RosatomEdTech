#!/bin/bash
# shellcheck disable=SC2164
# shellcheck disable=SC1068

# $1 - path in views folder
# $2 - name

path="$1"
dotpath="${path//[\/]/.}"
name="$2"
lower="${name,,}"

# entering folder
cd "../ui/views/"
mkdir -p "$path"
cd "$path"


# making interactor
mkdir "interactor"
cd "interactor"

file1="${name}Interactor.kt"
file2="${name}MVPInteractor.kt"

touch "$file1"
echo "package com.example.rosatomedtech.ui.views.${dotpath}.interactor

import com.example.rosatomedtech.data.preferences.PreferenceHelper
import com.example.rosatomedtech.ui.base.interactor.BaseInteractor

class ${name}Interactor(preferenceHelper: PreferenceHelper) :
BaseInteractor(preferenceHelper), ${name}MVPInteractor {

}
" >> "$file1"

touch "$file2"
echo "package com.example.rosatomedtech.ui.views.${dotpath}.interactor

import com.example.rosatomedtech.ui.base.interactor.MVPInteractor

interface ${name}MVPInteractor : MVPInteractor{

}
" >> "$file2"


# making presenter
cd "../"
mkdir "presenter"
cd "presenter"
file1="${name}Presenter.kt"
file2="${name}MVPPresenter.kt"

touch "$file1"
echo "package com.example.rosatomedtech.ui.views.${dotpath}.presenter

import com.example.rosatomedtech.ui.base.presenter.BasePresenter
import com.example.rosatomedtech.ui.views.${dotpath}.interactor.${name}MVPInteractor
import com.example.rosatomedtech.ui.views.${dotpath}.view.${name}MVPView

class ${name}Presenter<V : ${name}MVPView, I : ${name}MVPInteractor>(interactor: I) :
    BasePresenter<V, I>(
        interactor
    ), ${name}MVPPresenter<V, I> {

}
" >> "$file1"

touch "$file2"
echo "package com.example.rosatomedtech.ui.views.${dotpath}.presenter

import com.example.rosatomedtech.ui.base.presenter.MVPPresenter
import com.example.rosatomedtech.ui.views.${dotpath}.interactor.${name}MVPInteractor
import com.example.rosatomedtech.ui.views.${dotpath}.view.${name}MVPView

interface ${name}MVPPresenter<V : ${name}MVPView, I : ${name}MVPInteractor> : MVPPresenter<V, I> {

}
" >> "$file2"


# making view
cd "../"
mkdir "view"
cd "view"
file1="${name}Activity.kt"
file2="${name}MVPActivity.kt"

touch "$file1"
echo "package com.example.rosatomedtech.ui.views.${dotpath}.view

import android.content.Intent
import android.os.Bundle
import com.example.rosatomedtech.R
import com.example.rosatomedtech.data.preferences.AppPreferenceHelper
import com.example.rosatomedtech.ui.base.view.BaseActivity
import com.example.rosatomedtech.ui.views.${dotpath}.interactor.${name}Interactor
import com.example.rosatomedtech.ui.views.${dotpath}.interactor.${name}MVPInteractor
import com.example.rosatomedtech.ui.views.${dotpath}.presenter.${name}Presenter
import com.example.rosatomedtech.ui.views.main.view.MainActivity

class ${name}Activity : BaseActivity(), ${name}MVPView {
    var presenter = ${name}Presenter<${name}MVPView, ${name}MVPInteractor>(
        ${name}Interactor(AppPreferenceHelper(this))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start);

        presenter.onAttach(this)

        open${name}Activity()
    }

    override fun open${name}Activity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}" >> "$file1"

touch "$file2"
echo "package com.example.rosatomedtech.ui.views.${dotpath}.view

import com.example.rosatomedtech.ui.base.view.MVPView

interface ${name}MVPView : MVPView {
    fun open${name}Activity()

    fun openMainActivity()
}" >> "$file2"
