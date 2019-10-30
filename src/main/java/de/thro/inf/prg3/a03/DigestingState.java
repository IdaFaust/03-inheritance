package de.thro.inf.prg3.a03;

public class DigestingState extends State {
    @Override
    public State succesor(Cat cat) {
        return new PlayfulState(5);
    }

    public DigestingState(int d){
        super(d);
    }
}
