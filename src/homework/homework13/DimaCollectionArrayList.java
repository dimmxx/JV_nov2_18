package homework.homework13;

//implementation of ArrayList

import java.util.ArrayList;

public class DimaCollectionArrayList {

    private DogClass[] array;
    private int counter = 0;

    public DimaCollectionArrayList(){
        array = new DogClass[3];
    }


    public void ensureCapacity(){
        if(counter == array.length - 1){
            DogClass temp[] = new DogClass[(array.length*3/2) + 1];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array = temp;
            temp = null;
        }
    }

    public void add(DogClass item){
        ensureCapacity();
        array[counter] = item;
        counter++;
    }

    public void add(int index, DogClass){

    }




    public DogClass get(int pos){
        return array[pos];
    }








}
