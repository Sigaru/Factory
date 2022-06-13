package org.factory;

public class Ford extends Automobiles {

    public void moveFront() throws InterruptedException {

        int a = 0;
        int b = 15;
        int p = 1;

        String c = "Едет Ford";
        String x = "Приехал Ford";
        while (p < 20) {
            ++p;
            int f = a + (int) (Math.random() * b);
            Thread.sleep(1000);
            if (f < 10) {
                System.out.print(c + ", ");
            }
            if (f > 10) {
                System.out.println(x + "." + p);
                break;
            }

        }
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void Reverse() {

    }
}