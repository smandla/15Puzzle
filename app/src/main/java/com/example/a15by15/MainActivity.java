package com.example.a15by15;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;

/**
 * @author Kavya Mandla
 * @version November 2019
 */
public class MainActivity extends AppCompatActivity {

    private Controller controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surfaceView board  = (surfaceView)findViewById(R.id.surfaceView3);
        board.setOnTouchListener(board);



    }
}
