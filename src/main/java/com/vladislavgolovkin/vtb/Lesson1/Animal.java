package com.vladislavgolovkin.vtb.Lesson1;

public abstract class Animal {
    static int countAnimal;

    public Animal() {
        countAnimal++;
    }

    abstract void run(int lengthObstacle);
    abstract void swim(int lengthObstacle);
}
