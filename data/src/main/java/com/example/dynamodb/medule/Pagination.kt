package com.example.dynamodb.medule

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pagination(
    val key: Int
): Parcelable