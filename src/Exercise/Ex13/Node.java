package Exercise.Ex13;

public class Node<E> {
    private Node next;
    private Object data;

    public Node(Object data) {
        this.next = null;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

}
