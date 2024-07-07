package com;

import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            
//            try {
//                
//                
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }
    
}

public class Test {
    public static void main(String[] args) {
        

       MyThread mt = new MyThread();
        mt.start();
        try {
            mt.join(2000);
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

//Thread.currentThread().join();
//        } catch (InterruptedException ex) {
//        ex.printStackTrace(); 
//        }

    }
}
