package com.manuni.postrequestwithretrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiData {
    @POST("q")
    Call<MainResponseObjectData> getAllData(@Body MainObjectData mainObjectData);
}
