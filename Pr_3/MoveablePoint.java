package Pr_3;

public class MoveablePoint implements Moveable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint: x:" + this.x + " y:" + this.y + " xSp:" + this.xSpeed + " ySp:" + this.ySpeed;
    }


    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
