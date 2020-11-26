package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    Object [] elems;

    public BaseArray(Object[] elems) {
        this.elems = elems;
    }

    @Override
    public Object[] toArray() {
        return elems;
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return elems.length;
    }
}
