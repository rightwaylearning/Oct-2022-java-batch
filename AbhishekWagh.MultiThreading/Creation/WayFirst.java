

public class WayFirst extends Thread {

    @Override
    public void run() {
        for(Integer i = 0; i <= 100; i++){

            System.out.println("Child Thread");

        }
    }

 public static void main(String[] args) {

    WayFirst w = new WayFirst();
    w.start();

    for(Integer i = 100; i >= 0;i--){
        System.out.println("Main Thread");
    }

 }   

}