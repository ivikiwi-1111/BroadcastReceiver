package com.example.brdcsttest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.net.ConnectivityManager;

public class AirPlaneActivated extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            Toast.makeText(context, "Test", Toast.LENGTH_LONG).show();
        }
    }
}