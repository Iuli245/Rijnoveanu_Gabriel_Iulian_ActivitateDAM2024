package com.example.seminar_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("activitate", " A aparut eorare la onStart");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.w("Activitate", "Atentionare la onResume");
        Toast.makeText(this, R.string.mesaj,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("Activitate", "Atentionare debug");
    }

    @Override
    protected void onDestroy() //in momentul inchiderii aplicatiei sau inchis de catre sistemul de operare
    {
        super.onDestroy();
    }

}