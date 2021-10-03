package com.onlai.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxExample extends AppCompatActivity {

    CheckBox chkFilm, chkFPT, chkCLip;
    Button btnChon;
    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_example); //nạp giao diện
        linkViews();
        addEvent();

    }

    private void linkViews() {
        chkFilm=findViewById(R.id.chkFilm);
        chkFPT = findViewById(R.id.chkFpt);
        chkCLip = findViewById(R.id.chkClip);
        btnChon = findViewById(R.id.btnChon);
        txtResult = findViewById(R.id.txtResult);
    }

    private void addEvent() {
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "Bạn chọn ";

                if (chkCLip.isChecked()) {
                    s += chkCLip.getText().toString();
                }

                if (chkFilm.isChecked()) {
                    s += chkFilm.getText().toString();
                }

                if (chkFPT.isChecked()) {
                    s += chkFPT.getText().toString();
                }

                txtResult.setText(s);
            }

        });
    }
}