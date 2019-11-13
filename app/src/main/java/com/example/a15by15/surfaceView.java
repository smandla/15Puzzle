package com.example.a15by15;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

import java.util.Random;

public class surfaceView extends SurfaceView implements View.OnTouchListener {

    /**
     * implemented the Bitmaps same way SurfaceView was implemented in
     * StrategoSurfaceView class
     */
    Bitmap button1 = BitmapFactory.decodeResource(getResources(), R.drawable.button1);
    Bitmap button2 = BitmapFactory.decodeResource(getResources(), R.drawable.button2);
    Bitmap scaledButton2;
    Bitmap button3 = BitmapFactory.decodeResource(getResources(), R.drawable.button3);
    Bitmap scaledButton3;
    Bitmap button4 = BitmapFactory.decodeResource(getResources(), R.drawable.button4);
    Bitmap scaledButton4;
    Bitmap button5 = BitmapFactory.decodeResource(getResources(), R.drawable.button5);
    Bitmap scaledButton5;
    Bitmap button6 = BitmapFactory.decodeResource(getResources(), R.drawable.button6);
    Bitmap scaledButton6;
    Bitmap button7 = BitmapFactory.decodeResource(getResources(), R.drawable.button7);
    Bitmap scaledButton7;
    Bitmap button8 = BitmapFactory.decodeResource(getResources(), R.drawable.button8);
    Bitmap scaledButton8;
    Bitmap button9 = BitmapFactory.decodeResource(getResources(), R.drawable.button9);
    Bitmap scaledButton9;
    Bitmap button10 = BitmapFactory.decodeResource(getResources(), R.drawable.button10);
    Bitmap scaledButton10;
    Bitmap button11 = BitmapFactory.decodeResource(getResources(), R.drawable.button11);
    Bitmap scaledButton11;
    Bitmap button12 = BitmapFactory.decodeResource(getResources(), R.drawable.button12);
    Bitmap scaledButton12;
    Bitmap button13 = BitmapFactory.decodeResource(getResources(), R.drawable.button13);
    Bitmap scaledButton13;
    Bitmap button14 = BitmapFactory.decodeResource(getResources(), R.drawable.button14);
    Bitmap scaledButton14;
    Bitmap button15 = BitmapFactory.decodeResource(getResources(), R.drawable.button15);
    Bitmap scaledButton15;
    Bitmap blankButton = BitmapFactory.decodeResource(getResources(), R.drawable.blank);
    Bitmap scaledBlankButton;
    Bitmap scaledButton1;

    //grid variables
    private int[][] grid = new int[4][4];
    int width;
    int height;


    public surfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
    }


    @Override
    public void onDraw(Canvas canvas) {

        width = canvas.getWidth();
        height = canvas.getHeight();

        scaledButton1 =
                Bitmap.createScaledBitmap(button1, width / 4, height / 4, false);
        scaledButton2 =
                Bitmap.createScaledBitmap(button2, width / 4, height / 4, false);
        scaledButton3 =
                Bitmap.createScaledBitmap(button3, width / 4, height / 4, false);
        scaledButton4 =
                Bitmap.createScaledBitmap(button4, width / 4, height / 4, false);
        scaledButton5 =
                Bitmap.createScaledBitmap(button5, width / 4, height / 4, false);
        scaledButton6 =
                Bitmap.createScaledBitmap(button6, width / 4, height / 4, false);
        scaledButton7 =
                Bitmap.createScaledBitmap(button7, width / 4, height / 4, false);
        scaledButton8 =
                Bitmap.createScaledBitmap(button8, width / 4, height / 4, false);
        scaledButton9 =
                Bitmap.createScaledBitmap(button9, width / 4, height / 4, false);
        scaledButton10 =
                Bitmap.createScaledBitmap(button10, width / 4, height / 4, false);
        scaledButton11 =
                Bitmap.createScaledBitmap(button11, width / 4, height / 4, false);
        scaledButton12 =
                Bitmap.createScaledBitmap(button12, width / 4, height / 4, false);
        scaledButton13 =
                Bitmap.createScaledBitmap(button13, width / 4, height / 4, false);
        scaledButton14 =
                Bitmap.createScaledBitmap(button14, width / 4, height / 4, false);
        scaledButton15 =
                Bitmap.createScaledBitmap(button15, width / 4, height / 4, false);
        scaledBlankButton =
                Bitmap.createScaledBitmap(blankButton, width / 4, height, false);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Bitmap drawOn;
                switch (grid[i][j]) {
                    case 1:
                        drawOn = scaledButton1;
                        break;
                    case 2:
                        drawOn = scaledButton2;
                        break;
                    case 3:
                        drawOn = scaledButton3;
                        break;
                    case 4:
                        drawOn = scaledButton4;
                        break;
                    case 5:
                        drawOn = scaledButton5;
                        break;
                    case 6:
                        drawOn = scaledButton6;
                        break;
                    case 7:
                        drawOn = scaledButton7;
                        break;
                    case 8:
                        drawOn = scaledButton8;
                        break;
                    case 9:
                        drawOn = scaledButton9;
                        break;
                    case 10:
                        drawOn = scaledButton10;
                        break;
                    case 11:
                        drawOn = scaledButton11;
                        break;
                    case 12:
                        drawOn = scaledButton12;
                        break;
                    case 13:
                        drawOn = scaledButton13;
                        break;
                    case 14:
                        drawOn = scaledButton14;
                        break;
                    case 15:
                        drawOn = scaledButton15;
                        break;
                    default:
                        drawOn = scaledBlankButton;
                        break;

                }
                canvas.drawBitmap(drawOn, (j * height) / 4 + (width - height) / 4, (i * height) / 4, null);

            }
        }


    }

    //if it is not empty then button contains a value.
    public boolean buttonFull(int row, int col) {
        return grid[row][col] != -1;
    }

    public void randomizeGrid() {

        //erases board
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                grid[i][j] = -1;
            }
        }
        /**
         * External Citation
         * Date: November 12, 2019
         * Problem: forgot how to cast to an int
         *
         * Resource: https://alvinalexander.com/java/how-to-round-float-double-to-int-integer-in-java
         * Solution: followed code to cast to an int
         */

        int randomize = (int)(Math.random() * 4);
        //randomizes numbers within buttons
        for (int i = 1; i < 17; i++) {

            int x = randomize;
            int y = randomize;

            if (buttonFull(x, y)) {
                i--;
            } else {
                grid[x][y] = i;

            }

        }
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int tap = (int) motionEvent.getX();
        return true;
    }

}