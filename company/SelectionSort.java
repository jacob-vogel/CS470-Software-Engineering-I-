package com.company;

public class SelectionSort extends Sort{
    public SelectionSort(){
        this.name = "SelectionSort";
    }
    @Override
    public void sortData() {
        startTimer();
        //int[] set = this.getData();
        int length = data.length;
        int smallest;
        for(int i = 0; i < length; i++) {
            smallest = i;
            for (int j = (i + 1); j < length; j++) {
                if (data[j] < data[smallest]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                swap(smallest, i);
            }
        }
        stopTimer();
    }
}
