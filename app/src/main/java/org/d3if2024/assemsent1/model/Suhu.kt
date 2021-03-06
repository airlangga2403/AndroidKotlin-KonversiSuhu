package org.d3if2024.assemsent1.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Suhu(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)