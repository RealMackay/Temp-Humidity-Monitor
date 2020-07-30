package com.example.tempmonitorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Activity";
    // Controls
    private Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Hide android action header.
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnTest = (Button) findViewById(R.id.btnTestId);

        btnTest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "Displaying Toast");
                Toast toast = Toast.makeText(getApplicationContext(), "Testing", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
