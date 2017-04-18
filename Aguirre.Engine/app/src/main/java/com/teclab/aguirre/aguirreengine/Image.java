package com.teclab.aguirre.aguirreengine;

import android.graphics.Bitmap;
import android.graphics.Canvas;


public class Image extends DisplayObject {

    private Bitmap bmp;
    int Source;
    String key;
    String _tag;


       public void Image(String key, int source, Resources res)
       {
           this.resources = res;
           this.key = key;
           this.resources.LoadTexture(this.key, res);

       }

 

       public void onDraw(Canvas c)
       {
           c.(resources.getTexture())
       }



}