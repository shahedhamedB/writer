package com.example.dynamodb.medule

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DynamodbModual(
    val created_at: String,
    val image_ids: List<String>,
    val image_urls: List<String>,
    val image_urls_thumbnails: List<String>,
    val name: String,
    val price: String,
    val uid: String
):Parcelable