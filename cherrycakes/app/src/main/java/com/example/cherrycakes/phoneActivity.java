package com.example.cherrycakes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class phoneActivity extends AppCompatActivity {


    Spinner spin;
    Button generate;
    EditText phone_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        spin = findViewById(R.id.spin);
        generate = findViewById(R.id.generate);
        phone_no = findViewById(R.id.number);



        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobileNo = phone_no.getText().toString();

                Intent intent = new Intent(getApplicationContext(), OTPActivity.class);
                intent.putExtra("PhoneNo", mobileNo);
                startActivity(intent);
                finish();
            }
        });


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.country_code, android.R.layout.simple_spinner_item);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spin.setAdapter(adapter);

    }


}