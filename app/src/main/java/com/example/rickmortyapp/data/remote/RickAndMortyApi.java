package com.example.rickmortyapp.data.remote;

import com.example.rickmortyapp.data.models.characters.CharacterPageResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RickAndMortyApi {
    @GET("character")
    Call<CharacterPageResponse> searchCharacter(
            @Query("page") int page,
            @Query("name") String name
        );
}
