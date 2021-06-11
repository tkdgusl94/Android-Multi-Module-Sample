package com.leveloper.common.ext

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String, isLongToast: Boolean = false) {
    Toast.makeText(
        this,
        message,
        if (isLongToast) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
    ).show()
}

fun Context.showToast(resourceId: Int, isLongToast: Boolean = false) {
    showToast(getString(resourceId), isLongToast)
}