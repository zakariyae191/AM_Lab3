package com.example.lab2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView txtRecap = findViewById(R.id.txtRecap);

        Bundle res = getIntent().getExtras();
        if (res != null) {
            String affichage = "Nom : " + res.getString("nom") + "\n" +
                    "Email : " + res.getString("email") + "\n" +
                    "Phone : " + res.getString("phone") + "\n" +
                    "Adresse : " + res.getString("adresse") + "\n" +
                    "Ville : " + res.getString("ville");
            txtRecap.setText(affichage);
        }
    }
}