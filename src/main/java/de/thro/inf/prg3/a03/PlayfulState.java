package de.thro.inf.prg3.a03;

public class PlayfulState extends State {

    @Override
    public State succesor(Cat cat) {
        return new SleepingState(10);
    }

    public PlayfulState (int d){
        super(d);
    }
}
