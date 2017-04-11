package com.teclab.aguirre.aguirreengine;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.HashMap;

/**
 * Created by Heat on 02/11/2016.
 */
public class Resources {

    private HashMap texturePool;
    public SoundManager sounds;
    public Context mContext;
    public int fps;
    public Canvas canvas;
    public PointF aspact;
    private String hashKey;

    public Resources(Context _context)
    {
        fps = 32;
        hashKey = "";
        mContext = _context;
        texturePool = new HashMap();
        sounds = new SoundManager(_context);
    }

    public void loadTexture(String key, int resource)
    {
        if(!texturePool.containsKey(key))
        {
            Bitmap bmp = null;
            bmp = BitmapFactory.decodeResource(mContext.getResources(), resources);
            texturePool.put(key, bmp);
        }
    }

    public void unloadTexture(String key)
    {
        ((Bitmap)texturePool.get(key)).recycle();
        texturePool.remove(key);
    }

}
