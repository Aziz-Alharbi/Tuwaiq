public class MovablePoint implements Movable{


    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x , int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
        System.out.println("Moving up to " + y);
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
        System.out.println("Moving down to " + y);
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
        System.out.println("Moving left to " + x);
    }

    @Override
    public void moveRight() {
        x += xSpeed;
        System.out.println("Moving right to " + x);
    }

}
