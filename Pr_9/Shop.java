package Pr_9;


public class Shop {

    public void checkout(String inn) throws InvalidInnException {
        IInnChecker checker = new EntityInnChecker();
        if (checker.isCorrectInn(inn)) {
            System.out.println("ИНН для юридического лица корректно.");
            return;
        }
        throw new InvalidInnException();
    }
}
