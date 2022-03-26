package com.tutorial.navigation.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataModel(
    var name: String,
    var amount: String
) : Parcelable