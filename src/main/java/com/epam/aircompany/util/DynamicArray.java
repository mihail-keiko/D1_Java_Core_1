package com.epam.aircompany.util;

public class DynamicArray {

    private Integer length = 5;
    private Double [] array;
    private Integer count = 0;

    public DynamicArray() {
        array = new Double[length];
    }

    public void add(Double item){
        if (count > array.length){
            Double [] tmp = array;
            array = new Double[array.length * 2];
            for(int i = 0; i <= tmp.length; i++){
                array[i] = tmp[i];
            }
        }
        array[count] = item;
        count++;
    }

    public Double get(Integer index){
        if (index > count){
            throw  new ArrayIndexOutOfBoundsException();
        }
        return array[index - 1];
    }

    public void  remove (Integer index){
        if (index > count){
            throw  new ArrayIndexOutOfBoundsException();
        }

        Double [] tmp = array;
        array = new Double[count];
        Integer ind = 0;

        for(int i = 0; i < count; i++ ){
            if (i == (index -1)){
                continue;
            }
            array[ind] = tmp[i];
            ind++;
        }
        count--;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < count;i++){
            result+= String.format("array[%s]: %s;",i,array[i].toString());
        }
        return result;
    }
}
