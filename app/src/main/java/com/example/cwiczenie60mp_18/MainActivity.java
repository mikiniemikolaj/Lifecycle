package com.example.cwiczenie60mp_18;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cwiczenie60mp_18.R;

public class MainActivity extends AppCompatActivity {

    private int licznik;

    private void log(String m) { Log.i("LC", "--> " + m + "()"); }

    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        if (b == null) licznik = 5;
        log("onCreate, licznik=" + licznik);
    }

    @Override protected void onStart() { super.onStart(); log("onStart"); }
    @Override protected void onResume() { super.onResume(); log("onResume"); }
    @Override protected void onPause() { super.onPause(); log("onPause"); }
    @Override protected void onStop() { super.onStop(); log("onStop"); }
    @Override protected void onRestart() { super.onRestart(); log("onRestart"); }
    @Override protected void onDestroy() { super.onDestroy(); log("onDestroy"); }

    @Override protected void onSaveInstanceState(Bundle b) {
        super.onSaveInstanceState(b);
        b.putInt("licznik", licznik);
        log("onSaveInstanceState, zapisano licznik=" + licznik);
    }

    @Override protected void onRestoreInstanceState(Bundle b) {
        super.onRestoreInstanceState(b);
        licznik = b.getInt("licznik");
        log("onRestoreInstanceState, odtworzono licznik=" + licznik);
    }
}