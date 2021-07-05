package com.example.cherrycakes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class OTPActivity extends AppCompatActivity {

    String verificationCodeBySystem;
    Button verify_no;
    TextView go_to_phone,header,t4;
    EditText otp;
    String codeBySystem;
    ProgressBar progressBar;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);

        verify_no = findViewById(R.id.verify_no);
        go_to_phone = findViewById(R.id.go_to_phone);
        otp = findViewById(R.id.otp);
        header = findViewById(R.id.header);
        progressBar = findViewById(R.id.progress_bar);
        firebaseAuth = FirebaseAuth.getInstance();

        Intent intent = getIntent();
        String mobileNo = intent.getStringExtra("PhoneNo");

    }


}