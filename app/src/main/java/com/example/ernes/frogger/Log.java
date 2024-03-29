package com.example.ernes.frogger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/**
 *  Logs that move in the river
 *  @author Ernest Kwan (u6381103)
 */

public class Log extends Sprite {

    private static final float VELOCITY = 0.01f;
    float v;

    public Log(float x, float y){
        this.v = VELOCITY;
        this.pos = new Pos(x, y);
    }

    @Override
    public void step() {
        pos.x += v;
    }
}
