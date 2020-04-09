package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {


            Runner run = new Runner(" Runner " + i);
            run.setB(i + 1);
            run.setA(0);
            run.start();





            try {
                run.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        //for (int i = 5; i > 1; i--)
        int x=5;
        while (x!=0){
            Runner runner = new Runner("Runner " + x);
            runner.setB(x - 1);


            runner.setA(1);
            runner.start();
            x--;

            try {
                runner.join();
            } catch (InterruptedException e) {
                e.printStackTrace();


            }
        }


    }}