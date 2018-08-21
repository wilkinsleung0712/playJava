package list;

public interface List<T> {

    void insertListNode(T nodeToInsert, int postition);

    T deleteListNode(int postition);

    void print();

    int size();

}
