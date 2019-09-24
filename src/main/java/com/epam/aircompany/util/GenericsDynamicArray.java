package com.epam.aircompany.util;

public class GenericsDynamicArray <T> {

    private Integer length = 5;
    private Object [] array = new Object[length];
    private Integer count = 0;

    public GenericsDynamicArray() {
    }

    public GenericsDynamicArray(Integer length) {
        this.length = length;
        array = new Object[length];
    }

    public void add(T item) {
        if (count > array.length){
            Object [] tmp = array;
            array = new Object[array.length * 2];
            for(int i = 0; i <= tmp.length; i++){
                array[i] = tmp[i];
            }
        }
        array[count] = item;
        count++;
    }

    public T get(Integer index) {
        if (index > count){
            throw  new ArrayIndexOutOfBoundsException();
        }
        return (T)array[index - 1];
    }

    public void remove(Integer index) {
        if (index > count){
            throw  new ArrayIndexOutOfBoundsException();
        }

        Object [] tmp = array;
        array = new Object[count];
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
