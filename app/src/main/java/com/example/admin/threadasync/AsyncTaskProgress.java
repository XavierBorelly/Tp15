package com.example.admin.threadasync;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by admin on 15/06/2017.
 */

public class AsyncTaskProgress extends AsyncTask<String, Integer, String> {

    private ProgressBar progress;

    public AsyncTaskProgress(ProgressBar progressBar) {
        this.progress = progressBar;
    }


    @Override
    protected String doInBackground(String... strings) {

        int progret;
        for(progret =0; progret <= 100; progret ++){
            try {
                Thread.sleep(100);
                publishProgress(progret);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        progress.setProgress(values[0].intValue());
    }
}
