package com.example.expresstoast;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RawRes;

public class MyToast {

    private static View mainLayout;
    private static LinearLayout baselayout;
    private static TextView toastMessage;
    private static MediaPlayer sound;
    private static LayoutInflater li;

    public static void success(Context context, String message, float duration){
        li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mainLayout = li.inflate(R.layout.customtoast,null);

        baselayout = mainLayout.findViewById(R.id.backlay);
        baselayout.setBackgroundColor(Color.parseColor("#6E8A52"));
        toastMessage = mainLayout.findViewById(R.id.custom_toast_message);
        toastMessage.setText(message);
        sound = MediaPlayer.create(context, R.raw.success);

        final Toast toast = new Toast(context);
        toast.setDuration((int) duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 700);
        toast.setView(mainLayout);

        toast.show();
        sound.start();
    }

    public static void failure(Context context, String message, float duration){
        li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mainLayout = li.inflate(R.layout.customtoast,null);

        baselayout = mainLayout.findViewById(R.id.backlay);
        baselayout.setBackgroundColor(Color.parseColor("#CC0202"));
        toastMessage = mainLayout.findViewById(R.id.custom_toast_message);
        toastMessage.setText(message);
        sound = MediaPlayer.create(context, R.raw.failed);

        final Toast toast = new Toast(context);
        toast.setDuration((int) duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 700);
        toast.setView(mainLayout);

        toast.show();
        sound.start();
    }

    public static void warning(Context context, String message, float duration){
        li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mainLayout = li.inflate(R.layout.customtoast,null);

        baselayout = mainLayout.findViewById(R.id.backlay);
        baselayout.setBackgroundColor(Color.parseColor("#9AB3E7"));
        toastMessage = mainLayout.findViewById(R.id.custom_toast_message);
        toastMessage.setText(message);
        sound = MediaPlayer.create(context, R.raw.warnings);

        final Toast toast = new Toast(context);
        toast.setDuration((int) duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 700);
        toast.setView(mainLayout);

        toast.show();
        sound.start();
    }

    public static void restricted(Context context, String message, float duration){
        li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mainLayout = li.inflate(R.layout.customtoast,null);

        baselayout = mainLayout.findViewById(R.id.backlay);
        baselayout.setBackgroundColor(Color.parseColor("#A55680"));
        toastMessage = mainLayout.findViewById(R.id.custom_toast_message);
        toastMessage.setText(message);
        sound = MediaPlayer.create(context, R.raw.notallow);

        final Toast toast = new Toast(context);
        toast.setDuration((int) duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 700);
        toast.setView(mainLayout);

        toast.show();
        sound.start();
    }

    public static void applause(Context context, String message, float duration){
        li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mainLayout = li.inflate(R.layout.customtoast,null);

        baselayout = mainLayout.findViewById(R.id.backlay);
        baselayout.setBackgroundColor(Color.parseColor("#9C88A2"));
        toastMessage = mainLayout.findViewById(R.id.custom_toast_message);
        toastMessage.setText(message);
        sound = MediaPlayer.create(context, R.raw.applause);

        final Toast toast = new Toast(context);
        toast.setDuration((int) duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 700);
        toast.setView(mainLayout);

        toast.show();
        sound.start();
    }

    public static void customToast(Context context, String message, String hexColor, float duration){
        li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mainLayout = li.inflate(R.layout.customtoast,null);

        baselayout = mainLayout.findViewById(R.id.backlay);
        baselayout.setBackgroundColor(Color.parseColor(hexColor));
        toastMessage = mainLayout.findViewById(R.id.custom_toast_message);
        toastMessage.setText(message);
        sound = MediaPlayer.create(context, R.raw.twirk);

        final Toast toast = new Toast(context);
        toast.setDuration((int) duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 700);
        toast.setView(mainLayout);

        toast.show();
        sound.start();
    }

    public static void customToast(Context context, String message, String hexColor, @RawRes int resId, float duration){
        li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mainLayout = li.inflate(R.layout.customtoast,null);

        baselayout = mainLayout.findViewById(R.id.backlay);
        baselayout.setBackgroundColor(Color.parseColor(hexColor));
        toastMessage = mainLayout.findViewById(R.id.custom_toast_message);
        toastMessage.setText(message);
        sound = MediaPlayer.create(context, resId);

        final Toast toast = new Toast(context);
        toast.setDuration((int) duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 700);
        toast.setView(mainLayout);

        toast.show();
        sound.start();
    }
}
