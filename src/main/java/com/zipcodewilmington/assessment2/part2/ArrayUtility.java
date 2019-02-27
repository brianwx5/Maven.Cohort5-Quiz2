package com.zipcodewilmington.assessment2.part2;



public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] merger = new Integer[array1.length + array2.length];
        for (int i =0; i< array1.length;i++) {
            merger[i] = array1[i];
        }
        for (int j = 0; j< array2.length; j++) {
            merger[(array1.length)+j] = array2[j];
        } return merger;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        //Will get back to


        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        int counter2 = 0;

        for (int i = 0;i < array1.length; i++) {
            if(array1[i].equals(valueToEvaluate)) {
                counter++;
            }
        }

        for (int i = 0;i < array2.length; i++) {
            if(array2[i].equals(valueToEvaluate)) {
                counter2++;
            }
        }

        return (counter+counter2);

    }

    public Integer mostCommon(Integer[] array) {
        Integer count = 1;
        Integer counterForCommon;
        Integer starter = array[0];
        Integer f = 0;


        for(int i =0;i < array.length ; i++) {
            f = array[i];
            counterForCommon=0;
            for(int j = 1; j<=array.length-1;j++) {
                if(f == array[j]) {
                    counterForCommon++;
                } if(counterForCommon > count) {
                    starter = f;
                    count = counterForCommon;
                }

            }
        } return f;
    }
}
