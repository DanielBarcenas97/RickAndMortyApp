package com.example.rickmortyapp.data.models.characters;


import com.example.rickmortyapp.data.models.Info;

import java.util.ArrayList;

public class CharacterPageResponse {
    private Info info;
    private ArrayList<Character> results;

    public Info getInfo() {
        return info;
    }

    public ArrayList<Character> getResults() {
        return results;
    }
}
