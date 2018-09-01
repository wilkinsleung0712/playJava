package list;

public class CircularLinkedList implements List<CLLNode> {

    private CLLNode headNode;

    public CircularLinkedList() {
    }

    public CLLNode getHeadNode() {
        return headNode;
    }

    
    public void insertListNode(CLLNode nodeToInsert, int postition) {
        int size = this.size();

        if(postition > size + 1 || postition < 1) {
            System.out.println("position is invalid");
        } else {
            if(postition == 1) {
                CLLNode current = getLastNode();
                // we should have our getLastNode node
                current.setNext(nodeToInsert);
                nodeToInsert.setNext(headNode);
                headNode = nodeToInsert;
            } else {
                int count = 1;
                CLLNode previous = headNode;
                while(count < postition - 1) {
                    previous = previous.getNext();
                    count++;
                }

                CLLNode currentNode = previous.getNext();

                previous.setNext(nodeToInsert);
                nodeToInsert.setNext(currentNode);
            }


        }
    }

    public CLLNode deleteListNode(int postition) {
        CLLNode current = headNode;

        if(postition == 1) {
            // remove from head
            CLLNode last = getLastNode();
            last.setNext(current.getNext());
            headNode = current.getNext();
        } else {

            int count = 1;

            while(count < postition -1) {
                current = current.getNext();
                count++;
            }

            CLLNode nodeToDel = current.getNext();
            current.setNext(nodeToDel.getNext());
            return nodeToDel;
        }


        return current;
    }

    public void print() {
        CLLNode current = headNode;

        while(current != null) {
            System.out.print(current.getData() + "->");
            current = current.getNext();
            if(current == headNode)
                break;
        }

        System.out.print("("+current.getData()+") headNode\n");
    }

    public int size() {
        int size = 0;
        CLLNode current = headNode;
        while(current != null) {
            size++;
            current = current.getNext();
            if(current == headNode)
                break;
        }

        return size;
    }

    public void push(CLLNode nodeToInsert) {
        if(headNode == null) {
            headNode = nodeToInsert;

        } else {
            CLLNode current = getLastNode();
            // we should have our getLastNode node
            current.setNext(nodeToInsert);
            nodeToInsert.setNext(headNode);
            headNode = nodeToInsert;
        }

    }

    public CLLNode getLastNode() {
        CLLNode current = headNode;
        while(current != null) {
            if(current.getNext() == headNode) {
                break;
            }
            current = current.getNext();
        }
        return current;
    }
}


class CLLNode<T> {

    private CLLNode next;

    private T data;

    public CLLNode(T data) {
        this.data = data;
        this.next = this;
    }

    public CLLNode getNext() {
        return next;
    }

    public void setNext(CLLNode next) {
        this.next = next;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
