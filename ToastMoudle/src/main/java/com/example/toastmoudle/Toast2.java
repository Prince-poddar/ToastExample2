package com.example.toastmoudle;

import android.content.Context;
import android.widget.Toast;

public class Toast2 {

    public static void  showToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
