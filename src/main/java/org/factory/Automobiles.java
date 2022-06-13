package org.factory;

abstract class Automobiles implements Vehicles {
    public abstract void moveFront() throws InterruptedException;

    public abstract void moveLeft();

    public abstract void moveRight();

    public abstract void Reverse();
}