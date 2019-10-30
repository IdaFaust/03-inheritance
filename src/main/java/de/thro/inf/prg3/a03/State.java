package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.Logger;

public abstract class State {

    protected Logger logger;
    private int t;
    private int duration;

    public State (int duration){
        this.t = 0;
        this.duration = duration;
    }

    public State tick(Cat cat){
        t = t + 1;
        if (duration > t){
            return this;
        }
        return succesor(cat);
    }

    public abstract State succesor(Cat cat);
}
