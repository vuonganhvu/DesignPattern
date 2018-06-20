package com.higgsup.designpattern;

import com.higgsup.designpattern.singleton.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    private void demoSingleThread(){
        for (int i = 0 ; i < 10; i++) {
            String singleName = Singleton.getInstance().getName();
            String singleLazyName = SingletonLazy.getInstance().getName();
            String singleLazyDoubleCheckName = SingletonLazyDoubleCheck.getInstance().getName();
            String singleLazyMultithreadedName = SingletonLazyMultithreaded.getInstance().getName();
            if(i == 5){
                //change name and not in
                System.out.println("-------Change name---------");
                System.out.println(String.format("Loop %d", i));
                System.out.println(String.format("new name ", i));
                System.out.println("-------End---------");

            }
            System.out.println(String.format("Loop %d", i));
            System.out.println(String.format("singleName %s", singleName));
            System.out.println(String.format("singleLazyName %s", singleLazyName));
            System.out.println(String.format("singleLazyDoubleCheckName %s", singleLazyDoubleCheckName));
            System.out.println(String.format("singleLazyMultithreadedName %s", singleLazyMultithreadedName));
        }
    }

    private void multithreaded(){
        for (int i = 0 ; i < 10; i++) {
            Runnable runnable = new RunnableTask();
            Thread t = new Thread(runnable);
            t.start();
        }
    }
}

class RunnableTask implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String singleName = Singleton.getInstance().getName();
        String singleLazyName = SingletonLazy.getInstance().getName();
        String singleLazyDoubleCheckName = SingletonLazyDoubleCheck.getInstance().getName();
        String singleLazyMultithreadedName = SingletonLazyMultithreaded.getInstance().getName();
        System.out.println(String.format("Thread %s ...", threadName));
        System.out.println(String.format("singleName %s", singleName));
        System.out.println(String.format("singleLazyName %s", singleLazyName));
        System.out.println(String.format("singleLazyDoubleCheckName %s", singleLazyDoubleCheckName));
        System.out.println(String.format("singleLazyMultithreadedName %s", singleLazyMultithreadedName));
    }
}