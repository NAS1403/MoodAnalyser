package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalyserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {


    @Test
    public void shouldReturnSadMood() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("SAD", result);
        }
        catch(MoodAnalyserException e){
            throw new MoodAnalyserException(String.valueOf(MoodAnalyser.MoodAnalysr.NULL));
        }
    }

    @Test
    public void shouldReturnHappyMood() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("HAPPY", result);
        }
        catch(MoodAnalyserException e){
            throw new MoodAnalyserException(String.valueOf(MoodAnalyser.MoodAnalysr.NULL));

        }
    }
    @Test
    public void ShouldHandleNullMessage() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            String result = moodAnalyser.analyseMood();
            Assertions.assertSame("HAPPY", result);
        }
        catch(MoodAnalyserException e){
            Assertions.assertEquals("NULL",String.valueOf(MoodAnalyser.MoodAnalysr.NULL));
        }

    }
}
