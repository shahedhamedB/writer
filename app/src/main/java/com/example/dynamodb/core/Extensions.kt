package com.example.dynamodb.core

import android.view.View


fun View.onClick(callback: (View) -> Unit) {
    setOnClickListener(callback)
}

