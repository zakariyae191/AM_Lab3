package com.example.am_lab3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editNom, editEmail, editPhone, editAdresse;
    private Spinner spinnerVille;
    private Button btnEnvoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison des composants XML
        editNom = findViewById(R.id.editNom);
        editEmail = findViewById(R.id.editEmail);
        editPhone = findViewById(R.id.editPhone);
        editAdresse = findViewById(R.id.editAdresse);
        spinnerVille = findViewById(R.id.spinnerVille);
        btnEnvoyer = findViewById(R.id.btnEnvoyer);

        // Remplissage du Spinner avec des villes
        String[] villes = {"Agadir", "Casablanca", "Rabat", "Marrakech", "Tanger"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, villes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerVille.setAdapter(adapter);

        btnEnvoyer.setOnClickListener(v -> {
            String email = editEmail.getText().toString();

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Email invalide.", Toast.LENGTH_SHORT).show();
                return;
            }

            // Étape 3 : Création de l'Intent explicite
            Intent intent = new Intent(MainActivity.this, Screen2Activity.class);

            // Passage des données avec putExtra
            intent.putExtra("nom", editNom.getText().toString());
            intent.putExtra("email", email);
            intent.putExtra("phone", editPhone.getText().toString());
            intent.putExtra("adresse", editAdresse.getText().toString());
            intent.putExtra("ville", spinnerVille.getSelectedItem().toString());

            startActivity(intent);
        });
    }
}