package com.example.learntree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Weekdays extends AppCompatActivity {
    int current_img;
    int current_aud;
    MediaPlayer mp;
    ImageView img_view;
    int[] audio = {R.raw.mon, R.raw.tue, R.raw.wed, R.raw.thu, R.raw.fri, R.raw.sat, R.raw.sun};
    int[] images = {R.drawable.mon, R.drawable.tue, R.drawable.wed, R.drawable.thu, R.drawable.fri, R.drawable.sat,
            R.drawable.sun};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekdays);

        Button nxt_btn= findViewById(R.id.next_btn);
        Button back_btn= findViewById(R.id.back_btn);
        img_view =(ImageView)findViewById(R.id.square_img);
        ImageView btn_play= findViewById(R.id.play_btn);
        mp=new MediaPlayer();
        Button home_btn = findViewById(R.id.home_btn);
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Home.class);
                startActivity(i);
                overridePendingTransition(0, R.anim.anim_slide_out_right);
            }
        });

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        nxt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back_btn.setEnabled(true);
                if (current_img == 7) {
                    nxt_btn.setEnabled(false);
                } else {
                    if (current_img == images[images.length - 1]) {
                        current_img = 0;
                        current_img++;
                        current_aud = 0;
                        current_aud++;
                    }
                    current_img = current_img % images.length;
                    img_view.setImageResource(images[current_img]);
                    current_img++;
                    try {
                        if (mp != null) {
                            if (mp.isPlaying()) {
                                mp.stop();
                            }
                        }

//                    mp.reset();
                        mp = MediaPlayer.create(Weekdays.this, audio[current_aud]);
                        mp.start();
                        current_aud++;


                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }

        });

        back_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                nxt_btn.setEnabled(true);
                if (current_img == 0) {
                    back_btn.setEnabled(false);
                } else {

                    //current_img = (current_img + images.length) % images.length;
                    --current_img;
                    img_view.setImageResource(images[current_img]);
                    try {
                        // if(mp != null){
                        if (mp.isPlaying()) {
                            //mp.stop();
                            mp.reset();
                        }
                        //}
                        // current_aud = (current_aud + audio.length)% audio.length;
                        // mp.reset();
                        --current_aud;
                        mp = MediaPlayer.create(Weekdays.this, audio[current_aud]);
                        mp.start();

                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        });
    }
}








