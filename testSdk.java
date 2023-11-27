package com.test.mysdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.TelephonyManager;

public class testSdk {
    private TelephonyManager mTelephonyManager;

    @SuppressLint("ServiceCast")
    public  void getTelephonyInfo(Context context){
        if(mTelephonyManager ==null){

            mTelephonyManager = (TelephonyManager) context.getSystemService(Context.TELECOM_SERVICE);
            String deviceId= mTelephonyManager.getDeviceId();
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                String imei =mTelephonyManager.getImei();
            }
        }
    }
}
