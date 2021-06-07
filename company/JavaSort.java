package com.company;

import java.util.Arrays;

public class JavaSort extends Sort{
    public JavaSort(){
        this.name = "JavaSort";
    }

    @Override
    public void sortData() {
        startTimer();
        Arrays.sort(this.getData());
        stopTimer();
    }
}
