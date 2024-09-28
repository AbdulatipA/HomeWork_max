package org.example.typeofClasses.localClass.filterListString;

public class StringProcessor {
    void filterStrings(String[] arr, int minLength){
        class StringFilter{
            void filterMinString(){
                for (String s : arr) {
                    if (s.length() > minLength) {
                        System.out.println(s);
                    }
                }
            }
        }
        StringFilter sf = new StringFilter();
        sf.filterMinString();
    }
}
