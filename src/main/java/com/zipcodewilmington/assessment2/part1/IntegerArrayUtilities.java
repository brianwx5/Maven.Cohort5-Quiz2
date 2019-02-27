package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        int arraySize = array.length;
        if(arraySize % 2 ==0) {return true;}
        else {return  false;}
    }

    public Integer[] range(int start, int stop) {
        Integer[] roger = new Integer[stop];
        return roger;

        //Work on this when you get time
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return (Integer)(array[0] + array[1]);
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return (Integer)(array[0] * array[1]);
    }
}
