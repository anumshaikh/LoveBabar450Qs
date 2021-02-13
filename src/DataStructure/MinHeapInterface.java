package DataStructure;

public interface MinHeapInterface {
    int getLeftChildIndex(int parentindex);

    int getRightChildIndex(int parentindex);

    int getParentIndex(int childindex);

    boolean hasLeftChild(int index);

    boolean hasRightChild(int index);

    boolean hasParent(int index);

    int leftChild(int index);

    int rightChild(int index);

    int parent(int index);

    void swap(int i1, int i2);
    void ensureExtraCapacity();
    int peek();
    int poll();
    void add(int ele);
    void heapifyUp();
    void heapifyDown();


}
