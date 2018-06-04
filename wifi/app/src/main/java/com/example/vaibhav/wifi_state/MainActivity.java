package com.example.vaibhav.wifi_state;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        if (wifiManager != null) {
            wifiManager.setWifiEnabled(true);
        }
        String ip = String.valueOf(wifiManager.getConnectionInfo().getIpAddress());
        String ssid = wifiManager.getConnectionInfo().getSSID();
        Toast.makeText(getApplicationContext(),ip,Toast.LENGTH_SHORT).show();
    }
}
