package org.example.GenericsHomeWorks.Task2;

public class AnyType<T> {

     public void printArray(T[] anyType) {
        for (T t : anyType) {
            System.out.println(t);
        }
    }
}



