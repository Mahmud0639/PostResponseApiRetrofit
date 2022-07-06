package com.manuni.postrequestwithretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyTag";
    private LastLoginObjectData lastLoginObjectData;
    private LoginObjectData loginObjectData;
    private MainObjectData mainObjectData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lastLoginObjectData = new LastLoginObjectData("dateTime|UNIX","internetIP4");
        loginObjectData = new LoginObjectData("personNickname","internetEmail","personGender",lastLoginObjectData);
        mainObjectData = new MainObjectData(Utils.API_TOKEN,loginObjectData);

        Retrofit retrofit = ApiClient.getRetrofit();
        ApiData apiData = retrofit.create(ApiData.class);
        Call<MainResponseObjectData> responseObjectDataCall = apiData.getAllData(mainObjectData);
        responseObjectDataCall.enqueue(new Callback<MainResponseObjectData>() {
            @Override
            public void onResponse(Call<MainResponseObjectData> call, Response<MainResponseObjectData> response) {
                if (response.isSuccessful()){
                    MainResponseObjectData data = response.body();
                    Log.d(TAG, "onResponse: Email "+data.getEmail());
                    Log.d(TAG, "onResponse: Gender "+data.getGender());
                    Log.d(TAG, "onResponse: Id "+data.getId());
                   LastLoginObjectData objectData = data.getLast_login();
                    Log.d(TAG, "onResponse: Date_time "+objectData.getDate_time());
                    Log.d(TAG, "onResponse: Ip4 "+objectData.getIp4());
                }
            }

            @Override
            public void onFailure(Call<MainResponseObjectData> call, Throwable t) {
                Log.d(TAG, "onFailure: error "+t.getMessage());

            }
        });
    }
}