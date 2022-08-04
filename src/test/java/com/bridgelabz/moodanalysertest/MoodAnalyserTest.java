package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {


    @Test
    public void shouldReturnSadMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
       String result =  moodAnalyser.analyseMood();
        Assertions.assertSame("SAD",result);
    }

    @Test
    public void shouldReturnHappyMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        String result =  moodAnalyser.analyseMood();
        Assertions.assertSame("HAPPY",result);
    }


}
