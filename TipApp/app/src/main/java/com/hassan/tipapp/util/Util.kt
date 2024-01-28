package com.hassan.tipapp.util

import android.util.Log

fun calculateTotalTip(totalBill: String, tipPercentage: Int): Double {
    return if (totalBill.isNotEmpty())
        (totalBill.toDouble() * tipPercentage) / 100 else 0.0
}

fun calculateTotalBillPerPerson(
    totalBill: String,
    splitBy: Int,
    tipPercentage: Int): Double {

    val bill = calculateTotalTip(totalBill = totalBill,
        tipPercentage = tipPercentage) + totalBill.toDouble()

    return (bill / splitBy)
}