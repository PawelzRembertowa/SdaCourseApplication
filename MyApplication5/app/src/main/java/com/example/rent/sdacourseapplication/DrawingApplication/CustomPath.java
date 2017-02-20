package com.example.rent.sdacourseapplication.DrawingApplication;

import android.graphics.Path;
import android.graphics.Point;
import android.support.annotation.ColorInt;


public class CustomPath {
    @ColorInt
    private int color;
    private Path path;
    private Point point;

    public CustomPath(int color, Point point) {
        this.color=color;
        this.path=new Path();
        this.path.moveTo(point.x, point.y);
        this.point=point;
    }

    public int getColor() {
        return color;
    }

    public Path getPath() {
        return path;
    }
}
