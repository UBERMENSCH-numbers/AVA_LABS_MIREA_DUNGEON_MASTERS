package Pr_10.task2;


import Pr_10.task2.interfaces.AbstractChairFactory;

public class ChairFactory implements AbstractChairFactory {

    private final MagicChair unicMagicChair = new MagicChair();


    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(228);
    }

    @Override
    public MagicChair createMagicChair() {
        return unicMagicChair;
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
