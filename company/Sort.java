package com.company;


abstract class Sort {
    protected int[] data;
    protected String name;
    protected long startTime;
    protected long stopTime;

    public abstract void sortData();

    public void printData(){
        System.out.print("Printing the data set: ");
        System.out.println(name);
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        System.out.println("End of print");
    }

    public boolean isSorted(){
        boolean check = true;
        for(int i = 1; i < data.length; i++){
            if(data[i-1] > data[i]){
                check = false;
            }
        }
        return check;
    }

    public void swap(int first, int second){
        int temp;
        temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

    public long getRuntime(){
        return stopTime - startTime;
    }

    public void startTimer(){
        startTime = System.nanoTime();
    }

    public void stopTimer(){
        stopTime = System.nanoTime();
    }

    public int[] getData(){
        return data;
    }

    public String getName(){
        return name;
    }

    public void setData(int[] inData){
        data = inData;
    }
}
