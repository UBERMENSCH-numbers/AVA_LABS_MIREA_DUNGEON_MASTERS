package Pr_9;


public class EntityInnChecker implements IInnChecker {

    @Override
    public boolean isCorrectInn(String inn) {
        if (inn.length() == 10) return true;
        else return false;
    }
}
