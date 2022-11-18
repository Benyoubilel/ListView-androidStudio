package com.example.list;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Ajouter extends AppCompatActivity {
    EditText txt;
    Button btnAjout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajouter_items);
/*
        btnAjout=(Button) findViewById(R.id.buttonAdd);
        btnAjout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt=findViewById(R.id.edit_text);
                String info=txt.getText().toString() ;
            }
        });*/
        }


}
