package org.Solvd.Thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args){
        int n = 4; // Number of threads
        LOGGER.info("class that extends Thread and class that implements Runnable starting");
        for (int i = 0; i < n; i++) {
            thread thread1 = new thread();
            //Thread thread2 = new Thread(thread1);
            Thread thread2 = new Thread(new runnable());
            thread1.start();
            thread2.start();
            //try { si quiero que un thread espere a que termine otro pero no tiene mucho sentido en mi multithreading en este caso
            //    thread2.join();
            //} catch (InterruptedException e) {
            //    e.printStackTrace();
            //}
        }
    }
}

