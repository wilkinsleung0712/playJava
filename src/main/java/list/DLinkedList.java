package list;

public class DLinkedList implements List<DLLNode> {

    private DLLNode headNode;

    public DLinkedList(DLLNode headNode) {
        this.headNode = headNode;
    }

    public DLLNode getHeadNode() {
        return headNode;
    }

    public void insertListNode(DLLNode nodeToInsert, int positition) {
        int size = size();
        if (positition > size + 1 || positition < 1) {
            System.out.println("position is invlaid" + positition);
            return;
        }

        if (positition == 1) {
            nodeToInsert.setPrevious(null);
            nodeToInsert.setNext(headNode);
            headNode.setPrevious(nodeToInsert);
            headNode = nodeToInsert;
        } else {
            int count = 1;
            DLLNode previous = headNode;
            while (count < positition - 1) {
                previous = previous.getNext();
                count++;
            }

            DLLNode currentNode = previous.getNext();
            previous.setNext(nodeToInsert);
            nodeToInsert.setPrevious(previous);
            if (currentNode == null) {
                nodeToInsert.setNext(null);
            } else {
                currentNode.setPrevious(nodeToInsert);
            }

        }
    }

    public DLLNode deleteListNode(int position) {
        DLLNode previous = headNode;
        DLLNode current = null;
        if (position == 1) {
            //remove from headnode
            current = headNode.getNext();
            current.setPrevious(null);
            headNode = current;
            return previous;
        }

        int count = 1;
        while (count < position - 1) {
            previous = previous.getNext();
            count++;
        }

        current = previous.getNext();

        previous.setNext(current.getNext());
        current.getNext().setPrevious(previous);
        return current;
    }

    public void print() {
        DLLNode currentNode = headNode.getNext();

        while (currentNode != null) {
            currentNode = currentNode.getNext();
            System.out.println();
        }
    }

    public int size() {
        int count = 0;
        DLLNode currentNode = headNode;
        while (currentNode != null) {
            currentNode = currentNode.getNext();
            count++;
        }

        return count;
    }

    public void push(DLLNode nodeToInsert) {

        DLLNode current = headNode;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(nodeToInsert);
        nodeToInsert.setPrevious(current);
        nodeToInsert.setNext(null);

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