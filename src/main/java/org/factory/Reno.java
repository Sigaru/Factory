package org.factory;

public class Reno extends Automobiles {

    /**
     * Реализация абстрактного метода
     * @return
     */
    @Override
    public String getBrandName() {
        return "Reno";
    }

    @Override
    public int moveFront() throws InterruptedException {
        int p = 1;
        System.out.print(getBrandName() + " ");

        while (p < 20) {
            p++;
            int f = a + (int) (Math.random() * b);
            Thread.sleep(sleepInSeconds);

            if (f < 10) {
                System.out.print(movingText + ", ");
            }

            if (f > 10) {
                System.out.println(finishText + "." + p);
                break;
            }
        }
        return p;
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
