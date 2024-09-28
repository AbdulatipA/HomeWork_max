package org.example.typeofClasses.localClass.findMax;

public class ArrayProcessor {

    public void findMax(int[] arr){

         class MaxFinder{
             int maxCount;

             int getMaxCount(){
                for (int i : arr) {
                    if (i > maxCount) {
                        maxCount = i;
                    }
                }
                return maxCount;
            }

        }
        MaxFinder maxFinder = new MaxFinder();
        int result = maxFinder.getMaxCount();
        System.out.println(result);
    }
}
