package list;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DLinkedListTest {
    
    private DLinkedList dLinkedList;

    @Before
    public void setUp() throws Exception {

        dLinkedList = new DLinkedList(new DLLNode(1));
        dLinkedList.push(new DLLNode(2));
        dLinkedList.push(new DLLNode(3));
        dLinkedList.push(new DLLNode(4));
        dLinkedList.push(new DLLNode(5));
        dLinkedList.push(new DLLNode(6));
        dLinkedList.push(new DLLNode(7));
        dLinkedList.push(new DLLNode(8));
        dLinkedList.push(new DLLNode(9));
        dLinkedList.push(new DLLNode(10));
    }


    @Test
    public void testLinkedListNode() {

        assertEquals(10, dLinkedList.size());
    }

    @Test
    public void testRemoveListNode(){
        dLinkedList.deleteListNode(1);
        assertEquals(2, dLinkedList.getHeadNode().getData());
        assertEquals(9, dLinkedList.size());

        DLLNode deleteListNode = dLinkedList.deleteListNode(5);
        assertEquals(6, deleteListNode.getData());
        //        LinkedListNode.print(node);
    }

//    @Test
//    public void testPushListNode() {
//        assertEquals(10, dLinkedList.getLastNode().getData());
//    }

}