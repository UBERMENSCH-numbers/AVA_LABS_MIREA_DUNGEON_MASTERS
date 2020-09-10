package Pr_8;

public class Test {
    public void test() {
        BoundedWaitList<Integer> list = new BoundedWaitList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        UnfairWaitList<Integer> list_ = new UnfairWaitList<>();
        list_.add(1);
        list_.add(2);
        list_.add(3);
        list_.add(4);
        list_.add(5);
        list_.add(6);
        System.out.println(list_);
        list_.moveToBack(1);
        System.out.println(list_);

    }
}
