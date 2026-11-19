package com.bootcampexcercise.module7.activity;

// 1 - This class extends the Exception class (custom checked exception)
public class CustomExceptionActivity extends Exception {

    // 2 - Override getMessage() and provide the message
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}
