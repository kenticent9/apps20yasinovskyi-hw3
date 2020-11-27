package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object [] elems;

    public BaseArray(Object[] elems) {
        /* Accept the reference, not copy */
        this.elems = elems;
    }

    @Override
    public Object[] toArray() {
        /* Once again, return the reference, not copy */
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
