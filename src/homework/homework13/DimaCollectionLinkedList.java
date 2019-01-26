package homework.homework13;

import java.util.*;

public class DimaCollectionLinkedList implements List {

    private class Node {
        private DogClass element;
        protected Node nextN;
        private Node previousN;

        public Node(DogClass element) {
            this.element = element;
        }


        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    '}';


        }
    }

    private Node head;
    private Node tail;
    private int currentSize = 0;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    public boolean add(DogClass element) {
        if (head == null) {
            Node node = new Node(element);
            head = node;
            tail = node;
            node.previousN = null;
            currentSize++;
            return true;
        } else if (head != null) {
            Node node = new Node(element);
            tail.nextN = node;
            node.previousN = tail;
            tail = node;
            currentSize++;
            return true;
        }
        return false;
    }

    @Override
    public void add(int index, Object element) {
        Node node = new Node((DogClass) element);
        Node current;
        if (index >= currentSize) {
            current = tail;
            node.previousN = current;
            current.nextN = node;
            tail = node;
            currentSize++;
        } else if (index == 0) {
            head.previousN = node;
            node.nextN = head;
            node.previousN = null;
            head = node;
            currentSize++;
        } else {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.nextN;
            }
            node.previousN = current.previousN;
            node.nextN = current;
            node.previousN.nextN = node;
            current.previousN = node;
            currentSize++;
        }
    }

    @Override
    public Object remove(int index) {
        Node current = head;
        if (index == 0) {
            head = head.nextN;
            head.previousN = null;
            currentSize--;
            return current;
        } else if (index == currentSize - 1) {
            current = tail;
            tail = tail.previousN;
            tail.nextN = null;
            currentSize--;
            return current;
        } else if (index >= currentSize) {
            return null;
        } else {
            for (int i = 0; i < index; i++) {
                current = current.nextN;
            }
            current.previousN.nextN = current.nextN;
            current.nextN.previousN = current.previousN;
            currentSize--;
            return current;
        }
    }

    public StringBuilder printOut() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        for (int i = 0; i < currentSize; i++) {
            sb.append(current.element);
            sb.append(" Node#" + i);
            current = current.nextN;
        }
        return sb;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        if (currentSize == 0)
            return true;
        else return false;
    }

    @Override
    public void clear() {
        tail = null;
        head = null;
        currentSize = 0;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public Object[] toArray() {
        DogClass[] array = new DogClass[currentSize];
        Node current = head;
        for (int i = 0; i < currentSize; i++) {
            array[i] = current.element;
            current = current.nextN;
        }
        return array;
    }

    @Override
    public Object get(int index) {
        Node current = head;
        if (index >= 0 & index < currentSize) {
            for (int i = 0; i < index; i++) {
                current = current.nextN;
            }
            return current;
        } else return null;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private Node current = head;
            private Node temp;
            private int counter = 0;
            @Override
            public boolean hasNext() {
                if (counter < currentSize) {
                    return true;
                } else return false;
            }
            @Override
            public DogClass next() {
                temp = current;
                current = current.nextN;
                counter++;
                return temp.element;
            }
        };
    }

    @Override
    public boolean contains(Object o) {
        Node current = head;
        do {
            if (current.element.equals(o)) {
                return true;
            }
            if (current != tail) current = current.nextN;
        } while (current != tail);
        return current.element.equals(o);
    }

    @Override
    public boolean addAll(Collection c) {
        Iterator it = c.iterator();
        for (int i = 0; i < c.size(); i++) {
            while ((it.hasNext())) {
                this.add(it.next());
            }

        }
        return false;
    }

//==================================================================================









    @Override
    public boolean remove(Object o) {
        return false;
    }


    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }


    @Override
    public Object set(int index, Object element) {
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


}


