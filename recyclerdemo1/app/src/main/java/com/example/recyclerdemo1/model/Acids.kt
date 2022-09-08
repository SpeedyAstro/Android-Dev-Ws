package com.example.recyclerdemo1.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Acids(@StringRes val stringResourceId: Int,
                 @StringRes val stringResourceId1: Int,
                 @DrawableRes val imageResourceId: Int)
