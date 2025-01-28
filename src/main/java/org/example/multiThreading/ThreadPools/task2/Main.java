package org.example.multiThreading.ThreadPools.task2;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int numberLimit = 5;
                int result = 0;
                for (int i = 0; i <= numberLimit; i++) {
                    result += i;
                }

                if(numberLimit < 0) {
                    throw new IllegalArgumentException("Вы ввели отрицательное значение");
                }

                numberLimit = result;
                return numberLimit;
            }
        };

        Future<Integer> future = singleExecutor.submit(callable);

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            singleExecutor.shutdown();
        }
    }
}


