package hw7;

public class LinkedCustom<E> implements Linked<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    // Конструктор
    public LinkedCustom() {
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }

    // імплемент методу, додавання першого елементу
    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<E>(null, null, next);
        next.setPrevElement(firstNode);
        size++;
    }
    // імплемент методу, додавання останнього елементу
    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<E>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }
    // Розмір колекції
    @Override
    public int size() {
        return size;
    }
    // вивід у консоль по індексу
    @Override
    public E getIndex(int index) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);

        }
        return target.getCurrentElement();
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }
    // Клас CustomLinkedList
    private static class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }

}
