package com.example.spencermassey.test;

public class Word {

    //private variables
    int word_id;
    String word_name;
    String word_phrase;
    int word_set;

    // Empty constructor
    public Word(){

    }
    // constructor
    public Word(int word_id, String word_name, String word_phrase, int word_set){
        this.word_id = word_id;
        this.word_name = word_name;
        this.word_phrase = word_phrase;
        this.word_set = word_set;
    }

    // constructor
    public Word(String word_name, String word_phrase, int word_set){
        this.word_name = word_name;
        this.word_phrase = word_phrase;
        this.word_set = word_set;
    }
    // getting ID
    public int getID(){
        return this.word_id;
    }

    // setting id
    public void setID(int id){
        this.word_id = word_id;
    }

    // getting word
    public String getWord(){
        return this.word_name;
    }

    // setting word
    public void setWord(String word){
        this.word_name = word_name;
    }

    // getting phrase
    public String getPhrase(){
        return this.word_phrase;
    }

    // setting phrase
    public void setPhrase(String phrase){
        this.word_phrase = word_phrase;
    }

    // getting Set
    public int getSet(){
        return this.word_set;
    }

    // setting set
    public void setSet(int set){
        this.word_set = word_set;
    }
}