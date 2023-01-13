package com.example.dynamodb.medule

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DynamodbResponse(
    val pagination: Pagination,
    val results: MutableList<DynamodbModual>
): Parcelable