package com.example.sclock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ScreenOnService {

    private long startTimer, endTimer, screenOnTime;
    BroadcastReceiver mybroadcast = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i("[BroadcastReceiver]", "MyReceiver");

            if(intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
                startTimer = System.currentTimeMillis();
                Log.i("ekran", startTimer + "");
            }
        }
    };

}
