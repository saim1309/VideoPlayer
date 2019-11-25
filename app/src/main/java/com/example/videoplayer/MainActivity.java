package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    //coment
    VideoView videoView;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding the VideoView by it id
        videoView =findViewById(R.id.videoView);
        //creating the media controller object and passing the current context
        mediaController =new MediaController(this);
        //setting path of the mp4 that was placed in the raw folder under res directory
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.coldplay);
        //Set the view that acts as the anchor for the control view.
        mediaController.setAnchorView(videoView);
        //setting the video player controls like play,pause, rewind and fast forward.
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
