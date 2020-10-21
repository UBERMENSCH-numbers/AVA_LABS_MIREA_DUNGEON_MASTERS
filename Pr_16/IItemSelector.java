package Pr_16;


@FunctionalInterface
public interface IItemSelector<E> {

    boolean selectIt(E item);
}
