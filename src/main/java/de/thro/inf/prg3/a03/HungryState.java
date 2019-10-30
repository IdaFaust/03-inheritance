package de.thro.inf.prg3.a03;

public class HungryState extends State {
    @Override
    public State succesor(Cat cat) {

            return new DeathState(5);

    }

    public HungryState (int d){
        super(d);
    }
}
