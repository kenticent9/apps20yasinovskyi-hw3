package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    private MyComparator comparator;

    public SortDecorator(SmartArray smartArray, MyComparator comparator) {
        super(smartArray);
        this.comparator = comparator;
    }

    @Override
    public Object[] toArray() {
        return sort(smartArray.toArray(), comparator);
    }

    @Override
    public String operationDescription() {
        return "Sort elements using MyComparator to compare them";
    }

    @Override
    public int size() {
        return smartArray.toArray().length;
    }

    private static Object[] sort(Object[] array, MyComparator comparator) {
        Object[] newArray = array.clone();
        Arrays.sort(newArray, comparator);
        return newArray;
    }
}
