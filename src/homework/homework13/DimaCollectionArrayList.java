package homework.homework13;

//implementation of ArrayList

import java.util.ArrayList;
import java.util.Comparator;

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

    public void add(int index, DogClass dog){
        ensureCapacity();
        if(index > counter + 1) index = counter + 1;
        for(int i = counter; i >= index; i--){
            array[i + 1] = array[i];
        }
        array[index] = dog;
    }

    public DogClass get(int pos){
        return array[pos];
    }

    public void printOut(){
        for(int i = 0; i <= counter; i++){
            System.out.println(array[i].toString());
        }
    }

    public void sort(DogClassComparator comparator){

        for(int i = 0; i <= counter; i++){


        }

        comparator.compare(array[0], array[1]);



    }








}
