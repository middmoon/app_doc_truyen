package vn.edu.dlu.ctk45.appdoctruyen;

import android.os.AsyncTask;

import android.os.AsyncTask;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TestAPI extends AsyncTask<String, String, String>   {

    @Override
    protected String doInBackground(String... strings) {
        String url = strings[0];
        OkHttpClient client = new OkHttpClient();
        String jsonData = null;
        try {
            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();

            if (response.isSuccessful()) {
                jsonData = response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonData;
    }
    @Override
    protected void onPostExecute(String jsonData) {
        super.onPostExecute(jsonData);
        if (jsonData != null) {
            System.out.println("Lay du lieu thanh cong");
            System.out.println(jsonData);
        }
    }

}
