package com.a_ches.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
/*
1. Создайте класс данных со структурой заметок: название заметки, описание заметки, дата создания и т. п.
2. Создайте фрагмент для вывода этих данных.
3. Встройте этот фрагмент в активити. У вас должен получиться экран с заметками, который мы будем улучшать с каждым новым уроком.
4. Добавьте фрагмент, в котором открывается заметка. По аналогии с примером из урока: если нажать на элемент списка в портретной ориентации — открывается новое окно, если нажать в ландшафтной — окно открывается рядом.
5. * Разберитесь, как можно сделать, и сделайте корректировку даты создания при помощи DatePicker.
 */

public class MainActivity extends AppCompatActivity {

    private final  String LOG_TAG = "myLogs";
    Fragment frag1;
    Fragment frag2;
    FragmentTransaction fragmentTransaction;
    CheckBox chbStack;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d(LOG_TAG, "MainActivity onCreate");

        frag1 = new Fragment_1();
        frag2 = new Fragment_2();

       chbStack = findViewById(R.id.btnStack);


    }

    public void onClick(View view) {
        //fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()) {
            case R.id.btnAdd:
                fragmentTransaction.add(R.id.frgmCont, frag1, "1");
                break;
            case R.id.btnRemove:
                fragmentTransaction.remove(frag1);
                break;
            case R.id.btnReplace:
                fragmentTransaction.replace(R.id.frgmCont, frag2);
                break;
        }
        if (chbStack.isChecked())
            fragmentTransaction.addToBackStack(null); // сохранение
            fragmentTransaction.commit();

    }


    /*
    public void onStart () {
        super.onStart();
        Log.d(LOG_TAG, "MainActivity onStart");
    }

    public void onResume () {
        super.onResume();
        Log.d(LOG_TAG, "MainActivity onResume");
    }
    public void onPause () {
        super.onPause();
        Log.d(LOG_TAG, "MainActivity onPause");
    }

    public void onStop () {
        super.onStop();
        Log.d(LOG_TAG, "MainActivity onStop");
    }


    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "MainActivity onDestroy");
    }


     */

}