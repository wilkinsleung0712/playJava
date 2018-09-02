package list;

public class LinkedList implements List<ListNode> {

    private ListNode headNode;

    public ListNode getHeadNode() {
        return headNode;
    }

    public LinkedList(ListNode headNode) {
        this.headNode = headNode;
    }

    public int size() {

        ListNode currentNode = this.headNode;
        int count = 0;

        while (currentNode != null) {
            currentNode = currentNode.getNext();
            count++;
        }

        return count;
    }

    public void push(ListNode nodeToInsert) {
        ListNode last = this.last();
        last.setNext(nodeToInsert);
        nodeToInsert.setNext(null);
    }

    public void insertListNode(ListNode nodeToInsert, int position) {

        int size = this.size();

        if (position > size + 1 || position < 1) {
            System.out.println("position is invalid");
        } else {
            // we should handle insert from head
            if (position == 1) {
                nodeToInsert.setNext(headNode);
                // changing headnode we should reset our head
                headNode = nodeToInsert;
            } else {

                int count = 1;

                ListNode previousNode = headNode;

                while (count < position - 1) {
                    previousNode = previousNode.getNext();
                    count++;
                }

                // we should handle insert from mid
                // we should handle insert from end
                ListNode currentNode = previousNode.getNext();
                nodeToInsert.setNext(currentNode);
                previousNode.setNext(nodeToInsert);
            }
        }

    }

    public ListNode deleteListNode(int position) {

        int size = size();
        ListNode nodeToDelete = null;

        if (position > size - 1 && position < 1) {
            System.out.println("position is invalid");
            return null;
        } else {

            if (position == 1) {
                // delete from head
                nodeToDelete = headNode;
                this.headNode = nodeToDelete.getNext();
                return nodeToDelete;
            }

            int count = 1;

            ListNode previousNode = headNode;

            while (count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }

            nodeToDelete = previousNode.getNext();
            previousNode.setNext(nodeToDelete.getNext());
            return nodeToDelete;
        }
    }

    public void print() {
        ListNode previousNode = headNode;
        // we want to keep printing current node when is not null
        while (previousNode != null) {
            System.out.println(previousNode.getData());
            previousNode = previousNode.getNext();
        }
    }

    public ListNode last() {
        if (headNode.getNext() == null) {
            return headNode;
        }
        ListNode previousNode = headNode;
        while (previousNode.getNext() != null) {
            previousNode = previousNode.getNext();
        }

        return previousNode;
    }

    public ListNode deleteFromLast(int positionFromLast) {
        int count = 1;
        ListNode pTemp = headNode, pNthNode = null;

        // use for loop to get to the position where we need to do the delete
        // then use two pointer as they are gap is in the R-L=positionFromLast
        // so we can delete the position
        for (int i = 1; i < positionFromLast; count++) {
            if (pTemp != null) {
                pTemp = pTemp.getNext();
            }
        }

        // position is not the last one
        while (pTemp != null) {
            if (pNthNode == null) {
                pNthNode = headNode;
            } else {
                pNthNode = headNode.getNext();
            }

            pTemp = pTemp.getNext();
        }

        if (pNthNode != null) {
            return pNthNode;
        }

        return null;
    }
}

class ListNode<T> {

    private ListNode next;

    private T data;

    public ListNode(T data) {
        this.data = data;
        this.next = null;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    @Override public String toString() {
        return "ListNode{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}

