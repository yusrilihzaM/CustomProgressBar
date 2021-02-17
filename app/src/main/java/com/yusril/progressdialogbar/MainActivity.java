package com.yusril.progressdialogbar;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //initilaize Variabel
    Button btn_dialogbar;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // assign variable
        btn_dialogbar=findViewById(R.id.btn_dialogbar);
        btn_dialogbar.setOnClickListener(v -> {
            //initilaize progress dialog
            progressDialog=new ProgressDialog(MainActivity.this);
            //show dialog
            progressDialog.show();
            //set content view
            progressDialog.setContentView(R.layout.progress_dialog);
            //set Transparent
            progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //dissmis progressbdialog
        progressDialog.dismiss();
    }
}