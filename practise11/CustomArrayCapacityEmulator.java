package semestr1.practise11;

public class CustomArrayCapacityEmulator<E>{
        private static final int DEFAULT_CAPACITY = 10;
        private Object[] elementData;
        private int size = 0;
        private int resizeCount = 0;
        private int totalElementsCopied = 0;
    public CustomArrayCapacityEmulator() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacityInternal(){
        if (size == elementData.length){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        Object[] newBuffer = new Object[newCapacity];
        System.arraycopy(elementData,0,newBuffer,0,size);
        elementData = newBuffer;
        resizeCount++;
        totalElementsCopied += size;
        }
    }
    public void add(E element){
        ensureCapacityInternal();
        elementData[size++] = element;
    }
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacityInternal();
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E old = (E) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return old;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E old = (E) elementData[index];
        elementData[index] = element;
        return old;
    }

    public int size(){
    return size;
    }

    public int getCapacity(){
     return elementData.length;
    }

    public int getResizeCount() {
        return resizeCount;
    }

    public void trimToSize() {
        if (size < elementData.length) {
            Object[] newBuffer = new Object[size];
            System.arraycopy(elementData, 0, newBuffer, 0, size);
            elementData = newBuffer;
        }
    }
}
