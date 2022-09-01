package com.example.whatsappsemcontato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout inputLayoutPhone;
    private TextInputLayout inputLayoutText;


    private TextInputEditText inputTextPhone;
    private TextInputEditText inputTextText;


    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLayoutPhone = findViewById(R.id.EditLayoutPhone);
        inputLayoutText = findViewById(R.id.EditLayoutMessage);

        inputTextPhone = findViewById(R.id.EditTextPhone);
        inputTextText = findViewById(R.id.EditTextMessage);

        enviar = findViewById(R.id.enviar);

        enviar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openWebPage();
                    }

                });

    }



    public void openWebPage(){


        String Phone = inputTextPhone.getText().toString();
        String Message = inputTextText.getText().toString();


        Uri webPage = Uri.parse("https://wa.me/"+Phone+"?text="+Message);
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);


            startActivity(intent);

    }
}



