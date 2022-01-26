
package com.eon.Entities;

public abstract class Animal {
    
    protected int patas;

    protected Animal(int piernas) {
        this.patas = piernas;
    }
    
    public void caminar(){
        System.out.println("Yo camino con " + patas);
    }
    
    public abstract void comer();
}
