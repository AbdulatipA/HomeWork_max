package org.example.GenericsHomeWorks.Task1;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
   private List<T> boxArray = new ArrayList<>();

   void addElement(T element) {
       this.boxArray.add(element);
   }

   void getElement(T element) {
       T result = this.boxArray.get(this.boxArray.indexOf(element));
       System.out.println(result + ", этот тип равен -> " + result.getClass().getSimpleName());
   }


    @Override
    public String toString() {
        return "Box: " + "boxArray = " + boxArray;
    }
}


