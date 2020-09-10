package Pr_3;

public class MoveableRectangle implements Moveable {
    private MoveablePoint topLeft;
    private MoveablePoint BottomRight;


    public MoveableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        topLeft = new MoveablePoint(x1, y1, xSpeed, ySpeed);
        BottomRight = new MoveablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        BottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        BottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        BottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        BottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MoveableRectangle{" +
                "topLeft=" + topLeft +
                ", BottomRight=" + BottomRight +
                '}';
    }
}
