package com.example.rauliyrjana.harjoitus4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void onaddClick(View a) {
        if(a.getId() == R.id.Badd){
            EditText a1 = (EditText)findViewById(R.id.number1);
            EditText a2 = (EditText)findViewById(R.id.number2);

            double num1, num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double ans = num1 +num2;

            TextView t = (TextView)findViewById((R.id.result));
            t.setText("" + ans);
        }
        if(a.getId() == R.id.Bsub) {
            EditText a1 = (EditText) findViewById(R.id.number3);
            EditText a2 = (EditText) findViewById(R.id.number4);

            double num1, num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double ans = num1 - num2;

            TextView t = (TextView) findViewById((R.id.result2));
            t.setText("" + ans);

        }
        if(a.getId() == R.id.Bmul) {
            EditText a1 = (EditText) findViewById(R.id.number5);
            EditText a2 = (EditText) findViewById(R.id.number6);

            double num1, num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double ans = num1 * num2;

            TextView t = (TextView) findViewById((R.id.result3));
            t.setText("" + ans);

        }
        if(a.getId() == R.id.Bdiv) {
            EditText a1 = (EditText) findViewById(R.id.number7);
            EditText a2 = (EditText) findViewById(R.id.number8);

            double num1, num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double ans = num1 * num2;

            TextView t = (TextView) findViewById((R.id.result4));
            t.setText("" + ans);

        }
    }
}
