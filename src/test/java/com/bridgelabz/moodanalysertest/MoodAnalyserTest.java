package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalyserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {


    @Test
    public void shouldReturnSadMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("SAD", result);
        }
        catch(MoodAnalyserException e){
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void shouldReturnHappyMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("HAPPY", result);
        }
        catch(MoodAnalyserException e){
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.NULL,e.type);

        }
    }
    @Test
    public void ShouldHandleNullMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("HAPPY", result);
        }
        catch(MoodAnalyserException e){
            Assertions.assertEquals("Message is Null",e.getMessage());
        }

    }
}
