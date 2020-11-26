package ua.edu.ucu.smartarr;

import java.util.HashSet;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        return removeDuplicates(smartArray.toArray());
    }

    @Override
    public String operationDescription() {
        return "Remove the duplicates from the SmartArray";
    }

    @Override
    public int size() {
        return findNumDist(smartArray.toArray());
    }

    /* Find the number of the distinct elements in the array */
    private static int findNumDist(Object [] array) {
        HashSet<Object> set = new HashSet<>();
        int numDist = 0;
        for (Object elem : array) {
            if (!set.contains(elem)) {
                set.add(elem);
                numDist++;
            }
        }
        return numDist;
    }

    /* Remove the duplicates from the array */
    private static Object[] removeDuplicates(Object[] array) {
        Object[] newArray = new Object[findNumDist(array)];
        HashSet<Object> set = new HashSet<>();
        int i = 0;
        for (Object elem : array) {
            System.out.println(elem.hashCode());
            System.out.println(set.contains(elem));
            if (!set.contains(elem)) {
                set.add(elem);
                newArray[i++] = elem;
            }
        }
        return newArray;
    }
}
