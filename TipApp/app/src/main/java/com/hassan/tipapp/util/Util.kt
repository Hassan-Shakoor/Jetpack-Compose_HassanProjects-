package com.hassan.tipapp.util

import android.util.Log

fun calculateTotalTip(totalBill: String, tipPercentage: Int): Double {
    Log.d("Slider", "totalBill: $totalBill")
    return if (totalBill.isNotEmpty())
        (totalBill.toDouble() * tipPercentage) / 100 else 0.0
}
