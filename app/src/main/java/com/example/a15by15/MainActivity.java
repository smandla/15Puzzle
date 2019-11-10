package com.example.a15by15;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

import android.os.Bundle;

/**
 * @author Kavya Mandla
 * @version November 2019
 */
public class MainActivity extends AppCompatActivity {

    private static MainActivity mainActivity;

    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;
    public Button button11;
    public Button button12;
    public Button button13;
    public Button button14;
    public Button button15;
    public Button button16;

    public SurfaceView surfaceView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surfaceView = (SurfaceView)findViewById(R.id.surfaceView3);


    }
}
