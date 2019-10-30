package de.thro.inf.prg3.a03;

public class DeathState extends State {

    @Override
    public State succesor(Cat cat) {
        return new DeathState(0);
    }

    public DeathState(int d){
        super(d);
    }
}
