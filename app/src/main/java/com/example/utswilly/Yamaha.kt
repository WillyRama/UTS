package com.example.utswilly

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize

data class Yamaha(
    val imgYamaha: Int,
    val nameYamaha: String,
    val descriptionYamaha: String,
) : Parcelable

