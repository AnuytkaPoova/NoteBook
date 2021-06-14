package com.a_ches.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment_1 extends Fragment {
    // private final  String LOG_TAG = "myLogs";
    private EditText mEditText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Log.d(LOG_TAG, "Fragment1 onCreateView");

        //return inflater.inflate(R.layout.fragment_1, container, false);
        return inflater.inflate(R.layout.fragment_1, null);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Log.d(LOG_TAG, "Fragment1 onCreate");

        //find editText
        mEditText = (EditText) mEditText.findViewById(R.id.editTextNameNot);
        //listen button
        button.findViewById(R.id.btnSave).setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View view) {
        String theString = mEditText.getText().toString();
        // с сохранением текста пока не разобралась
        //Intent intent = new Intent(this, OtherActivity.class);
        //intent.putExtra("key", theString);
        //startActivity(intent);
    }


/*
    public void onStart () {
        super.onStart();
        Log.d(LOG_TAG, "Fragment1 onStart");
    }

    public void onResume () {
        super.onResume();
        Log.d(LOG_TAG, "Fragment1 onResume");
    }
    public void onPause () {
        super.onPause();
        Log.d(LOG_TAG, "Fragment1 onPause");
    }

    public void onStop () {
        super.onStop();
        Log.d(LOG_TAG, "Fragment1 onStop");
    }

    public void onDestroyView () {
        super.onDestroyView();
        Log.d(LOG_TAG, "Fragment1 onDestroyView");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "Fragment1 onDestroy");
    }

    public void onDetach() {
        super.onDetach();
        Log.d(LOG_TAG, "Fragment1 onDetach");
    }

 */


}