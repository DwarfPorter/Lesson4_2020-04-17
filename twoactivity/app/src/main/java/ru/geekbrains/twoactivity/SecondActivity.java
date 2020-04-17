package ru.geekbrains.twoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity implements Constants {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Parcel parcel = (Parcel) getIntent().getSerializableExtra(TEXT);
        TextView textView = findViewById(R.id.textView);
        textView.setText(parcel.id);
        TextView nameView = findViewById(R.id.textView2);
        nameView.setText(parcel.name);

        Button retToMain = findViewById(R.id.button2);
        retToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
