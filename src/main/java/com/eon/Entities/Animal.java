
package com.eon.Entities;

public abstract class Animal {
    
    protected int piernas;

    protected Animal(int piernas) {
        this.piernas = piernas;
    }
    
    public void caminar(){
        
    }
    
    public abstract void comer();
}
