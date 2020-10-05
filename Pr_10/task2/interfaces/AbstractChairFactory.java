package Pr_10.task2.interfaces;


import Pr_10.task2.FunctionalChair;
import Pr_10.task2.MagicChair;
import Pr_10.task2.VictorianChair;

public interface AbstractChairFactory {

    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
