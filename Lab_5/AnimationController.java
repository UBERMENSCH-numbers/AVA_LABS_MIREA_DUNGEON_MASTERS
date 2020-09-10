package Lab_5;

public class AnimationController {
    int n = 3;
    String path =  "/home/user/Рабочий стол/";

     void startAnim() {
            for (int i = 0;; i++) {
                try {
                    Thread.sleep(200);
                    System.out.println(path + "" + (i % n + 1) + ".png");
                    MainGraphics.setPicture(path + "" + (i % n + 1) + ".png");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
