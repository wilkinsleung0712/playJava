package list;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LinkedListNodeTest {

    private LinkedList linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList(new ListNode(1));
        linkedList.push(new ListNode<Integer>(2));
        linkedList.push(new ListNode<Integer>(3));
        linkedList.push(new ListNode<Integer>(4));
        linkedList.push(new ListNode<Integer>(5));
        linkedList.push(new ListNode<Integer>(6));
        linkedList.push(new ListNode<Integer>(7));
        linkedList.push(new ListNode<Integer>(8));
        linkedList.push(new ListNode<Integer>(9));
        linkedList.push(new ListNode<Integer>(10));
    }

    @Test
    public void testLinkedListNode() {
        assertEquals(10, linkedList.size());
    }

    @Test
    public void testRemoveListNode(){
        linkedList.deleteListNode(1);
        assertEquals(2, linkedList.getHeadNode().getData());
        assertEquals(9, linkedList.size());
//        LinkedListNode.print(node);
    }

    @Test
    public void testPushListNode() {
        assertEquals(10, linkedList.last().getData());
    }
}