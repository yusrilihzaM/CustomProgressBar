package com.yusril.progressdialogbar;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.ChasingDots;
import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.FoldingCube;

public class MainActivity extends AppCompatActivity {
    //initilaize Variabel
    Button btn_dialogbar, btn_ChasingDots, btn_CubeGrid, btn_FoldingCube;
    ProgressDialog progressDialog;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // assign variable
        btn_dialogbar=findViewById(R.id.btn_dialogbar);
        btn_ChasingDots=findViewById(R.id.btn_progressbar_ChasingDots);
        btn_CubeGrid=findViewById(R.id.btn_progressbar_CubeGrid);
        btn_FoldingCube=findViewById(R.id.btn_progressbar_FoldingCube);
        progressBar=findViewById(R.id.progress_bar);
        progressBar.setVisibility(View.INVISIBLE);

        //onclick
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

        btn_ChasingDots=findViewById(R.id.btn_progressbar_ChasingDots);
        btn_ChasingDots.setOnClickListener(v -> {
            // initiliaze progress bar

            Sprite chasingDots=new ChasingDots();
            progressBar.setIndeterminateDrawable(chasingDots);
            progressBar.setVisibility(View.VISIBLE);
        });
        btn_CubeGrid.setOnClickListener(v -> {
            Sprite cubeGrid=new CubeGrid();
            progressBar.setIndeterminateDrawable(cubeGrid);
            progressBar.setVisibility(View.VISIBLE);
        });
        btn_FoldingCube.setOnClickListener(v -> {
            Sprite foldingCube=new FoldingCube();
            progressBar.setIndeterminateDrawable(foldingCube);
            progressBar.setVisibility(View.VISIBLE);
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //dissmis progressbdialog
        progressDialog.dismiss();
        progressBar.setVisibility(View.INVISIBLE);

    }
}