package com.company;

public class BubbleSort extends Sort{
    public BubbleSort(){
        this.name = "BubbleSort";
    }
    @Override
    public void sortData() {
        startTimer();
        int[] set;
        set = this.getData();
        int size = set.length;
        boolean compare = true;
        while(compare){
            compare = false;
            for(int i = 0; i < size-1; i++){
                if(set[i] > set[i+1]){
                    swap(i, (i+1));
                    compare = true;
                }
            }
        }
        stopTimer();
    }
}
