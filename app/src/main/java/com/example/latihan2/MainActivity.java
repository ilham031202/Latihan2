package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.inputtext);
        et2 = findViewById(R.id.inputtext2);
        result = findViewById(R.id.bt);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nb1 = Integer.parseInt(et1.getText().toString());
                int nb2 = Integer.pars2eInt(et2.getText().toString());

                int sum = nb1 +nb2;

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("key", sum);
                startActivity(intent);
            }
        });
    }
}