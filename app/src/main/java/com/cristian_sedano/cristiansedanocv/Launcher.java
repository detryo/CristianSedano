package com.cristian_sedano.cristiansedanocv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class Launcher extends AppCompatActivity {
    private static final int TIMER_RUNTIMER = 5000;
    private boolean launcher;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        Timer t = new Timer();
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),Cristian.class);
                startActivity(intent);
                finish();
            }
        },5000);
        final Thread timerThread = new Thread() {
            @Override
            public void run() {
                launcher = true;
                try {
                    int walted = 0;
                    while (launcher && (walted < TIMER_RUNTIMER)) {
                        sleep(200);
                        if (launcher) {
                            walted += 200;
                            updateProgress(walted);
                        }
                    }
                } catch (InterruptedException ignored) {

                } finally {
                    onContinue();
                }
            }
        };
        timerThread.start();
    }
    public void updateProgress(final int timePassed) {
        if (null != progressBar) {

            final int progress = progressBar.getMax() * timePassed / TIMER_RUNTIMER;
            progressBar.setProgress(progress);
        }
    }
    public void onContinue() {
    }
    
}