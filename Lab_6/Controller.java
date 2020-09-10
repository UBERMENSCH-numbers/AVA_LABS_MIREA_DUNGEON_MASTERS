package Lab_6;


import java.util.Random;

public class Controller {
    private int number;
    private int tries;
    private Graphics graphics;

    public Controller() {
        number = (int) (Math.random() * 20);
        tries = 0;
    }

    public void try_(int number) {
        if (number == this.number) graphics.gameOver("Win");
        if (number > this.number) graphics.setMsg("real is <");
        if (number < this.number) graphics.setMsg("real is >");
        tries ++;
        if (tries == 3) graphics.gameOver("Lose");
    }

    public void setGraphics(Graphics graphics){
        this.graphics = graphics;
    }
}
