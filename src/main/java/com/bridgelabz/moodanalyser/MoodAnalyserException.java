package com.bridgelabz.moodanalyser;

public class MoodAnalyserException extends Exception {
    public enum ExceptionType{
        NULL
    }

    public ExceptionType type;

    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;

    }

}
