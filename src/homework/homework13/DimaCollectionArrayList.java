package homework.homework13;

//implementation of ArrayList

import java.util.*;

public class DimaCollectionArrayList  {

    private DogClass[] array;
    private int currentSize = 0;

    public DimaCollectionArrayList(){
        array = new DogClass[3];
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int size(){
        return array.length;
    }

    public void ensureCapacity(){
        if(currentSize == array.length){
            DogClass temp[] = new DogClass[(array.length*3/2) + 1];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array = temp;
            temp = null;
        }
    }

    public void remove(int index){
        for (int i = index; i < currentSize - 1; i++){
            array[i] = array[i + 1];
        }
        array[currentSize - 1] = null;
        currentSize--;
    }

    public void add(DogClass item){
        ensureCapacity();
        array[currentSize] = item;
        currentSize++;
    }

    public void add(int index, DogClass dog){
        ensureCapacity();
        if(index > currentSize){
            index = currentSize;
        }
        for(int i = currentSize - 1; i >= index; i--){
            array[i + 1] = array[i];
        }
        array[index] = dog;
        currentSize++;
    }

    public DogClass get(int pos){
        return array[pos];
    }


    public void printOut(){
        for(int i = 0; i < currentSize; i++){
            System.out.println("Cell# " + i + " " + array[i].toString());
        }
    }


    public Object set(int i, Object o) {
        return null;
    }

    public void sort(Comparator comparator){
        for(int i = 0; i < currentSize - 1; i++){
            for (int k = 0; k < currentSize - 1 - i ; k++){
                if(comparator.compare(array[k], array[k + 1]) == 1){
                    DogClass temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }

    }

    public void clear() {

    }

    public Iterator iterator() {
        return new Iterator() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && array[currentIndex] != null;
            }
            @Override
            public DogClass next() {
                return array[currentIndex++];
            }
        };
    }

    public boolean isEmpty() {
        return false;
    }


    public boolean contains(Object o) {
        return false;
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }


    public boolean addAll(Collection collection) {
        return false;
    }


    public boolean addAll(int i, Collection collection) {
        return false;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }



}
