package com.cliquet.gautier.randomnumber;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView mRandomNumberText;
    private Button mButton;

    int generatedRandomNumber = 0;

    public int generateRandomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        return randomNumber;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRandomNumberText = this.findViewById(R.id.activity_main_displayNumber);
        mButton = findViewById(R.id.activity_main_button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generatedRandomNumber = generateRandomNumber();
                mRandomNumberText.setText("" + generatedRandomNumber);
            }
        });
    }
}
