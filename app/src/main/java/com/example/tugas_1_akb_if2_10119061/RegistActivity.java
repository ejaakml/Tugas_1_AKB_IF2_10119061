package com.example.tugas_1_akb_if2_10119061;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegistActivity extends AppCompatActivity {

    private Button btnLogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        btnLogin2 = findViewById(R.id.btn_login2);

        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //action
                Intent intent = new Intent(RegistActivity.this, com.example.tugas_1_akb_if2_10119061.LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}