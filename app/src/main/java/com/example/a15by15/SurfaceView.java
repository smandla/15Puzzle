package com.example.a15by15;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import java.util.Random;

public class SurfaceView extends android.view.SurfaceView {

    private static int column = 4;
    private static int grid = column * column;
    private static int numbers = grid - 1;
    private static final String[] tile = new String[grid];


    public SurfaceView(Context context, AttributeSet attrs){
        super(context, attrs);
        setWillNotDraw(false);
        //fillSolution();
        //reset();

    }


}
