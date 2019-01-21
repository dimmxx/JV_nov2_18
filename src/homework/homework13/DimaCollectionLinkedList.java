package homework.homework13;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DimaCollectionLinkedList implements List {


    private class Node {
        private DogClass element;
        protected Node nextN;
        private Node previousN;

        public Node(DogClass element){
            this.element = element;
        }
    }

    private Node firstNode;
    private Node lastNode;
    private int currentSize = 0;

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean add(DogClass element) {
        if (firstNode == null) {
            Node node = new Node(element);
            firstNode = node;
            lastNode = node;
            node.previousN = null;
            currentSize++;
            return true;
        } else if (firstNode != null) {
            Node node = new Node(element);
            lastNode.nextN = node;
            node.previousN = lastNode;
            lastNode = node;
            currentSize++;
            return true;
        }
        return false;
    }


    @Override
    public void add(int index, Object element) {
        Node node = new Node((DogClass) element);
        Node current = firstNode;
        for(int i = 0; i < index; i++){
            current = current.nextN;
        }
        node.nextN = current;
        current.previousN = node;
        node.previousN = current.previousN;
        node.previousN.nextN = node;
        //currentSize++;
    }



    public StringBuilder printOut(){
        StringBuilder sb = new StringBuilder();
        Node current = firstNode;
        for(int i = 0; i < currentSize; i++){
            sb.append(current.element.toString());
            current = current.nextN;

        }

        return sb;

    }














//    public Iterator iterator(){
//        return new Iterator() {
//            private int currentIndex = 0;
//            @Override
//            public boolean hasNext() {
//                return currentIndex < currentSize && array[currentIndex] != null;
//            }
//            @Override
//            public DogClass next() {
//                return ;
//            }
//        };
//    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }



    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }









}
