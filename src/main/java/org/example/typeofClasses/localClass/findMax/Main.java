package org.example.typeofClasses.localClass.findMax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayProcessor arrayProcessor = new ArrayProcessor();
//        arrayProcessor.findMax(new int[]{1,2,3,4,5,6,7,8,9,10});
        int[] arr = {10, 2, 1};
        arrayProcessor.findMax(arr);
        System.out.println(Arrays.toString(arr));
    }
}
