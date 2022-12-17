package com.example.core.util

import android.app.Activity
import android.content.Context
import android.os.Build
import android.text.Html
import android.text.Spanned
import android.view.inputmethod.InputMethodManager
import com.example.core.BuildConfig

const val key = "9ef694173a0f4d1790749b6401a8ff88"
const val APIMOVIE = "https://api.rawg.io/api/"
const val ITEM_PAGE_ADD_WATCHLIST = 10
const val WATCHLIST_STARTING_PAGE_INDEX = 1
const val INTENT_DATA = "INTENT_DATA"


@Suppress("DEPRECATION")
fun fromHtml(string: String?): Spanned? {
    return if (string != null){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(string, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(string)
        }
    } else {
        return string
    }
}

@Suppress("DEPRECATION")
fun Context.hideKeyboard() {
    val imm = this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.toggleSoftInput(0, InputMethodManager.HIDE_IMPLICIT_ONLY)
}


