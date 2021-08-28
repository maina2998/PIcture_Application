package com.example.pictureapplication

object ApiClient {
    var retrofit = Retrofit.builder()
        .baseUrl("<your base url goes here>")
        .addConverterFactory(GsonConverterFactory.create.())
        .build()
}