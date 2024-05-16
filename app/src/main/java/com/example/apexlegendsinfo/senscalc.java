package com.example.apexlegendsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class senscalc extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senscalc);
        editText = (EditText)findViewById(R.id.sens);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = editText.getText().toString();
                Double n = Double.parseDouble(number);
                result = "Чувствительность мыши для прицелов:\n\n";
                for (double i=0.248;i<=1;i++){

                    result+="1x: "+n*i+"\n";
                    textView.setText(result);
                }
                for (double i=0.59;i<=1;i++){
                    result+="2x: "+n*i+"\n";
                    textView.setText(result);
                }
                for (double i=0.735;i<=1;i++){
                    result+="3x: "+n*i+"\n";
                    textView.setText(result);
                }
                for (double i=0.804;i<=1;i++){
                    result+="4x: "+n*i+"\n";
                    textView.setText(result);
                }
            }
        });
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}