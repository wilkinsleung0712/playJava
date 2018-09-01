package list;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CircularLinkedListTest {

    private CircularLinkedList cLinkedList;

    @Before
    public void setUp() throws Exception {

        cLinkedList = new CircularLinkedList();
        cLinkedList.push(new CLLNode(1));
        cLinkedList.push(new CLLNode(2));
        cLinkedList.push(new CLLNode(3));
        cLinkedList.push(new CLLNode(4));
        cLinkedList.push(new CLLNode(5));
        cLinkedList.push(new CLLNode(6));
        cLinkedList.push(new CLLNode(7));
        cLinkedList.push(new CLLNode(8));
        cLinkedList.push(new CLLNode(9));
        cLinkedList.push(new CLLNode(10));

        cLinkedList.print();
    }

    @Test
    public void testSize() {
        assertEquals(10, cLinkedList.size());
    }


    @Test
    public void testInsertAtBegin() {
        cLinkedList.insertListNode(new CLLNode(0), 1);
        assertEquals(0, cLinkedList.getHeadNode().getData());
        assertEquals(11, cLinkedList.size());
        cLinkedList.print();
    }

    @Test
    public void testInsertAtMiddle() {
        cLinkedList.insertListNode(new CLLNode(0), 4);
        assertEquals(10, cLinkedList.getHeadNode().getData());
        assertEquals(11, cLinkedList.size());
        cLinkedList.print();
    }

    @Test
    public void testInsertAtEnd() {
        cLinkedList.insertListNode(new CLLNode(0), 11);
        assertEquals(10, cLinkedList.getHeadNode().getData());
        assertEquals(11, cLinkedList.size());
        cLinkedList.print();
    }

    @Test
    public void deleteFromBegin(){
        cLinkedList.deleteListNode(1);
        assertEquals(9, cLinkedList.getHeadNode().getData());
        assertEquals(9, cLinkedList.size());
        cLinkedList.print();
    }

}