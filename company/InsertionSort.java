package com.company;

public class InsertionSort extends Sort{
    public InsertionSort(){
        this.name = "InsertionSort";
    }
    @Override
    public void sortData() {
        startTimer();
        int[] set = this.getData();
        int length = set.length;
        int value, location;
        for(int i = 1; i < length; i++){
            value = set[i];
            location = i-1;
            while(location >= 0 && set[location] > value){
                set[location+1] = set[location];
                location -= 1;
            }
            set[location+1] = value;
        }
        stopTimer();
    }
}
