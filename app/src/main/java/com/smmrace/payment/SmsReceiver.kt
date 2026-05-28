package com.smmrace.payment

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony

class SmsReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        val messages = Telephony.Sms.Intents.getMessagesFromIntent(intent)

        for (sms in messages) {

            val body = sms.messageBody

            if (body.contains("تم استلام مبلغ")) {

                println(body)

            }
        }
    }
}
