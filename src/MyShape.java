import java.awt.*;


public class MyShape {
    private int x;
    private int y;
    private double width;
    private double height;
    private Graphics2D graphics2D;
    private int velocity;
    private Color color;
    private boolean isMoveByX;
    private boolean isRactangle;

    public MyShape(int x, int y, double frameWidth, double FrameHeight, int velocity,boolean isMoveByX, boolean isRactangle, Color color ) {
        this.x = x;
        this.y = y;
        this.width = frameWidth;
        this.height = frameWidth;
        this.velocity = velocity;
        this.isMoveByX = isMoveByX;
        this.isRactangle = isRactangle;
        this.color = color;
    }


    public void pain(Graphics g){
        if(isRactangle) {
            graphics2D = (Graphics2D) g;
            graphics2D.setColor(color);
            graphics2D.fillRect(x, y, 40, 40);
        }
        else {
            graphics2D = (Graphics2D)g;
            graphics2D.setColor(color);
            graphics2D.fillOval(x, y, 40, 40);
        }
    }

    public void move(){
        if(isMoveByX){
            x += velocity;
            if ( x >= width - 45 || x <= 0) {
                velocity = -velocity;
            }
        }
        else if(!isMoveByX()) {
            y += velocity;
            if (y >= height  || y <= 0) {
                velocity = -velocity;
            }
        }
    }

    public void cangeColor(){
        color = new Color((float) Math.random(),
                (float) Math.random(),
                (float) Math.random());
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public boolean isRactangle() {
        return isRactangle;
    }

    public void setRactangle(boolean ractangle) {
        isRactangle = ractangle;
    }

    public boolean isMoveByX() {
        return isMoveByX;
    }

    public void setMoveByX(boolean moveByX) {
        isMoveByX = moveByX;
    }
}
