package org.example.typeofClasses.nestedClass.factorial;

public class MathUtils {
    static public class Factorial{
        void calculate(int n){
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
    }
    Factorial factorial = new Factorial();
}
