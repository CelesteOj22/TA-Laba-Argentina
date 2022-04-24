package org.Solvd.Thread;

public class thread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
        try {
            thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class runnable implements Runnable {
    public void run()
    {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        try {
            thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

