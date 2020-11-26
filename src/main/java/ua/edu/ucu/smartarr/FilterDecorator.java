package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.HashSet;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private MyPredicate predicate;

    public FilterDecorator(SmartArray smartArray, MyPredicate predicate) {
        super(smartArray);
        this.predicate = predicate;
    }

    @Override
    public Object[] toArray() {
        return filter(smartArray.toArray(), predicate);
    }

    @Override
    public String operationDescription() {
        return "Test every element and remove it if it doesn't satisfy " +
                "MyPredicate";
    }

    @Override
    public int size() {
        return findNumSat(smartArray.toArray(), predicate);
    }

    /* Find the number of the elements in the array that satisfy MyPredicate */
    private static int findNumSat(Object[] array, MyPredicate predicate) {
        int numSat = 0;
        for (Object elem : array) {
            if (predicate.test(elem)) {
                numSat++;
            }
        }
        return numSat;
    }

    /* Remove ... */
    private static Object[] filter(Object[] array, MyPredicate predicate) {
        Object[] newArray = new Object[findNumSat(array, predicate)];
        int i = 0;
        for (Object elem : array) {
            if (predicate.test(elem)) {
                newArray[i++] = elem;
            }
        }
        return newArray;
    }
}
