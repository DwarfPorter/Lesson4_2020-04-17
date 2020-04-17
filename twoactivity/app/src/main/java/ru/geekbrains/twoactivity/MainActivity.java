package ru.geekbrains.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Constants {

    private EditText idEdit;
    private EditText nameEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idEdit = findViewById(R.id.editText);
        nameEdit = findViewById(R.id.editText2);

        Button startAct = findViewById(R.id.button);
        startAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra(TEXT, createParcel());
                startActivity(intent);
            }
        });
    }

    private Parcel createParcel(){
        Parcel parcel = new Parcel();
        parcel.id = idEdit.getText().toString();
        parcel.name = nameEdit.getText().toString();
        return parcel;
    }
}
