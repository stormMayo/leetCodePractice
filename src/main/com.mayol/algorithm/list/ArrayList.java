package algorithm.list;

import org.omg.CORBA.Object;

import java.text.DecimalFormat;

/**
 * TODO
 *
 * @author chaoliu5008
 * @version 1.0
 * @date 2020/8/6 13:48
 */
public class ArrayList<E> extends AbstractList<E> {

    private E[] elements;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList(int capacity) {
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
        elements = (E[])new Object[capacity];
    }


    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void clear() {
        for (int i = 0 ; i < size ; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public E get(int index) {
        rangeCheck(index);
        return elements[index];
    }

    public E set(int index, E element) {
        rangeCheck(index);
        E old = elements[index];
        elements[index] = element;
        return old;
    }

    public void add(int index, E element) {
        rangeCheckForAdd(index);
        ensureCapacity(size + 1);
        for (int i = size; i > index ; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;
    }



    public E remove(int index) {
        rangeCheck(index);
        E old = elements[index];
        for (int i = index + 1; i < size ; i++) {
            elements[i - 1] = elements[i];
        }
        elements[--size] = null;
        return old;
    }

    public int indexOf(E element) {
        if(element == null){
            for (int i = 0; i < size; i++) {
                if(elements[i] == null){
                    return i;
                }
            }
        }else{
            for (int i = 0; i < size; i++) {
                if(element.equals(elements[i])){
                    return i;
                }
            }
        }
        return ELEMENT_NOT_FOUND;
    }


    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if(oldCapacity >= capacity) return;
        //扩容
        int newCapacity = oldCapacity + (oldCapacity >> 2);
        E[] newElements = (E[])new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
        System.out.println(oldCapacity + "扩容为" + newCapacity);
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
