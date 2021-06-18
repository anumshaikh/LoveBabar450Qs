package DataStructure;

import java.util.Arrays;

public class MinHeap implements MinHeapInterface {

    public int capacity = 10, size = 0;
    int item[] = new int[capacity];

    @Override
    public int getLeftChildIndex(int parentindex) {
        return 2 * parentindex + 1;
    }

    @Override
    public int getRightChildIndex(int parentindex) {
        return 2 * parentindex + 2;
    }

    @Override
    public int getParentIndex(int childindex) {
        return (childindex - 1) / 2;
    }

    @Override
    public boolean hasLeftChild(int index) {
        boolean value = getLeftChildIndex(index) < size;
        return value;
    }

    @Override
    public boolean hasRightChild(int index) {
        boolean value = getRightChildIndex(index) < size;
        return value;
    }

    @Override
    public boolean hasParent(int index) {
        boolean value = getParentIndex(index) >= 0;
        return value;
    }

    @Override
    public int leftChild(int index) {
        return item[getLeftChildIndex(index)];
    }

    @Override
    public int rightChild(int index) {
        return item[getRightChildIndex(index)];
    }

    @Override
    public int parent(int index) {
        return item[getParentIndex(index)];
    }

    @Override
    public void swap(int i1, int i2) {
        int temp = item[i1];
        item[i1] = item[i2];
        item[i2] = temp;

    }

    @Override
    public void ensureExtraCapacity() {
        if (size == capacity) {
            item = Arrays.copyOf(item, capacity * 2);
            capacity *= 2;
        }
    }

    @Override
    public int peek() {
        if (size == 0)
            throw new IllegalStateException("0 items in heap");

        return item[0];
    }

    @Override
    public int poll() {
        if (size == 0)
            throw new IllegalStateException("0 items in heap");
        int ele = item[0];
        item[0] = item[size - 1];
        size--;
        heapifyDown();
        return ele;
    }

    @Override
    public void add(int ele) {
        ensureExtraCapacity();
        item[size] = ele;
        size++;
        heapifyUp();

    }

    @Override
    public void heapifyUp() {
        int index = size - 1;

        while (hasParent(index) && (parent(index) > item[index])) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }

    }

    @Override
    public void heapifyDown() {
        int index = 0;

        while (hasLeftChild(index)) {
            int smallchildindex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index))
                smallchildindex = getRightChildIndex(index);
            if (item[index] < item[smallchildindex])
                break;
            swap(index, smallchildindex);
            index = smallchildindex;
        }
    }

    @Override
    public String toString() {
        return "MinHeap [capacity=" + capacity + ", item=" + Arrays.toString(item) + ", size=" + size + "]";
    }

    public static void main(String[] args) {
        int arr[] = { 100, 60, -100, 1, 55, 10, 9, 8, 7, -1 };
        MinHeap minheap = new MinHeap();
        for (int a : arr)
            minheap.add(a);
        System.out.println("Printing heap");
        for (int a : minheap.item)
            System.out.print(a + "\t");
        int ele = minheap.poll();
        ele = minheap.poll();
        ele = minheap.poll();
        System.out.println("\n  smallest number " + ele);

    }
}
