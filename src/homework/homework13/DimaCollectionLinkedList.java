package homework.homework13;

import java.util.Iterator;

public class DimaCollectionLinkedList {

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
    private Node current;
    private int currentSize = 0;

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean add(DogClass element) {
        if (firstNode == null) {
            Node node = new Node(element);
            firstNode = node;
            lastNode = node;
            current = node;
            node.previousN = null;
            currentSize++;
            return true;
        } else if (firstNode != null) {
            Node node = new Node(element);
            current.nextN = node;
            node.previousN = current;
            current = node;
            lastNode = node;
            currentSize++;
            return true;
        }
        return false;
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







}
