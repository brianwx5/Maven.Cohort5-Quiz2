package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    List<Integer> newList = new ArrayList<>();

    public ListUtility() {

    }

    public Boolean add(int i) {
        boolean result = true;
        newList.add(i);
        if(newList.contains(i)) { return true;}
        else {return false;}

    }

    public Integer size() {
        return newList.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> uniqueSet = new HashSet<>(newList);
        List<Integer> returnList = new ArrayList<>(uniqueSet);
        return returnList;
    }

    public String join() {
        String arrayToString = newList.toString();
        String addSpace = arrayToString.replace(", ",", ").replace("[","").replace("]","");
        return addSpace;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
