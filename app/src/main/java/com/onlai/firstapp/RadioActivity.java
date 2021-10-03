package com.onlai.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity {

    RadioGroup radGroup;
    RadioButton radTuongDoi, radTot, radRatTot, radPerfect;
    Button btnVote;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        linkView();
        addEvents();
    }

    private void linkView() {
        radTuongDoi = findViewById(R.id.radTuongDoi);
        radTot = findViewById(R.id.radTot);
        radRatTot = findViewById(R.id.radRatTot);
        radPerfect = findViewById(R.id.radPerfect);
        btnVote = findViewById(R.id.bntVote);
        txtKetQua = findViewById(R.id.txtKetQua);
        radGroup = findViewById(R.id.radGroup);
    }

    private void addEvents() {
        btnVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "Bạn chọn: ";

                int id = radGroup.getCheckedRadioButtonId();
                if (id>0) {
                    RadioButton checkedRadio = findViewById(id);
                    s += checkedRadio.getText().toString();
                }
                txtKetQua.setText(s);
            }
        });
    }



}