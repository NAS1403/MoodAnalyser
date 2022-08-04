package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String happyMood = moodAnalyser.analyseMood("I am in Happy Mood");
        System.out.println("My mood is :"+happyMood);
        String sadMood = moodAnalyser.analyseMood("I am in Sad Mood");
        System.out.println("My Mood is :"+sadMood);
    }


    public String analyseMood (String message){
        if(message.toLowerCase().contains("sad"))
            return "SAD";
        else if (message.toLowerCase().contains("happy"))
            return "HAPPY";
        return message;
    }
}
