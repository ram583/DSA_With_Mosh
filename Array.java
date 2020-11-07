package DSA;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int entry =0;
    private int[] tempArray ;

    public Array(int length){
        items = new int[length];
    }
    public void print(){
        for (int i=0;i<entry;i++)
            System.out.println(items[i]);
    }
    public void insert(int element){

        // if array size is full resize to twice of actual size
        if(entry==items.length){
            tempArray = new int[2*entry];
            //copy elements to new array
            for(int i=0;i<entry;i++){
                tempArray[i]=items[i];
            }
            //set values bck to items
            //temparray size may be large but its items are set to items bcz in above steps values already in items
            //are copied bck
            items=tempArray;
        }
        //find the empty slot int the array box
        /*have a count variable in insert method & it ll increase only when values are added*/
        items[entry++]=element;
    }
}
