package com.example.adityasingh.mymusicplayer;

import android.content.Context;
import android.widget.MediaController;

/**
 * Created by adityasingh on 15/07/17.
 */

public class MusicController extends MediaController {
    Context c;
    public MusicController(Context c){
        super(c);
        this.c=c;
    }

    public void hide(){}

//    @Override
//    public boolean dispatchKeyEvent(KeyEvent event) {
//        int keyCode = event.getKeyCode();
//        if(keyCode == KeyEvent.KEYCODE_BACK){
//            ((MainActivity)c).onBackPressed();
//            return true;
//        }
//        return super.dispatchKeyEvent(event);
//    }

}
