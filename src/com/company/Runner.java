package com.company;

public class Runner extends Thread  {
    public Runner(String name) {
        super(name);
    }

    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public void run() {
        try {
            if (this.getA() <= 0) {
                if (this.getB() == 6) {
                    System.out.println(this.getName() + " Берет палочку ");
                    System.out.println(this.getName() + " бежит к финишу");
                } else {
                    System.out.println(this.getName() + " берет палочку ");
                    System.out.println(this.getName() + "  бежит к " + " Runner " + getB());
                }


            } else{





                if (getB() != 4) {
                    System.out.println(this.getName() + " берет палочку ");



                } else {
                    System.out.println(this.getName() + " бежит к " + " Runner " + getB());

                }


                if (getB() != 3) {




                } else {
                    System.out.println(this.getName() + " бежит к " + " Runner " + getB());

                }
                if (getB() != 2) {




                } else {
                    System.out.println(this.getName() + " бежит к " + " Runner " + getB());

                }

                if (getB() != 1) {




                } else {
                    System.out.println(this.getName() + " бежит к " + " Runner " + getB());

                }

            }


            sleep(001);
        } catch(InterruptedException idk){
        }
        finally{
            System.out.println(" ");
        }

    }
}
