package com.test.utilTools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Telephony;
import android.telephony.TelephonyManager;
import android.text.method.TextKeyListener;

import kotlin.jvm.internal.PropertyReference0Impl;

public class utils {
    private  Context mContext;
    private TelephonyManager mTelephonyManager;

    public utils(Context context) {
        mContext = context;
    }
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
