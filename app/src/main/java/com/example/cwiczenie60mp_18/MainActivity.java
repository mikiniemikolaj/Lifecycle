package com.example.cwiczenie60mp_18;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int licznik = 0;
    private TextView tv;

    private void log(String m) { Log.i("LC", "--> " + m + "()"); }

    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        log("onCreate");
        tv = findViewById(R.id.tvLicznik);
        findViewById(R.id.btnDodaj).setOnClickListener(v -> tv.setText(String.valueOf(++licznik)));
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
        log("onSaveInstanceState");
    }

    @Override protected void onRestoreInstanceState(Bundle b) {
        super.onRestoreInstanceState(b);
        licznik = b.getInt("licznik");
        tv.setText(String.valueOf(licznik));
        log("onRestoreInstanceState");
    }
}