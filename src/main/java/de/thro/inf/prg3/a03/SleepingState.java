package de.thro.inf.prg3.a03;

public class SleepingState extends State {

    @Override
    public State succesor(Cat cat) {
        return new HungryState(5);
    }

    public SleepingState(int d){
        super(d);
    }
}
