package Definition;

public class LinkedListDefinitionClass<E> implements LinkedListADTInterface<E> {
    private Node<E> head = null;
    @Override
    public void add(E item) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void print() {

    }
    private static class Node<E> {
        private E data;
        private Node<E> next;
        private Node(E data) {
            this.data = data;
        }
        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
        private E getData() {
            return data;
        }
        private Node<E> getNext() {
            return next;
        }
    }

    }
