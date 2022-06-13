package org.factory;

abstract class Automobiles implements Vehicles {

    /**
     * Название бренда авто
     */
    public abstract String getBrandName();

    /**
     * Тексты
     */
    protected String movingText = "Едет";
    protected String finishText = "Приехал";

    /**
     * Константы
     */
    protected int a = 0;
    protected int b = 15;

    /**
     * Сколько секунд ждать между попытками
     */
    protected int sleepInSeconds = 200;


    /**
     * После завершения движения возвращает значение переменной p
     * @return
     * @throws InterruptedException
     */
    public abstract int moveFront() throws InterruptedException;

    public abstract void moveLeft();

    public abstract void moveRight();

    public abstract void Reverse();
}