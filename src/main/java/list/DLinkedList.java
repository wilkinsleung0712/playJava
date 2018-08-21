package list;

public class DLinkedList implements List<DLLNode>{

    private DLLNode headNode;

    public DLinkedList(DLLNode headNode) {
        this.headNode = headNode;
    }

    public DLLNode getHeadNode() {
        return headNode;
    }

    public void insertListNode(DLLNode nodeToInsert, int postition) {

    }

    public DLLNode deleteListNode(int postition) {
        return null;
    }

    public void print() {
        DLLNode currentNode = headNode.getNext();

        while(currentNode != null) {
            currentNode = currentNode.getNext();
            System.out.println();
        }
    }

    public int size() {
        return 0;
    }
}

class DLLNode<T> {
    private DLLNode next;
    private DLLNode previous;
    private T data;

    public DLLNode(T data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public DLLNode getPrevious() {
        return previous;
    }

    public void setPrevious(DLLNode previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override public String toString() {
        return "DLLNode{" +
                "next=" + next +
                ", previous=" + previous +
                ", data=" + data +
                '}';
    }
}