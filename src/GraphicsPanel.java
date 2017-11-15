import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GraphicsPanel extends JComponent implements Runnable {

    private List<MyShape> myShapeList;
    private ShapeList shapeList = new ShapeList();
    public boolean isMove;
    public boolean moveOnlyRects;
    public boolean moveOnlyOvals;
    public boolean isChangeColor;
    public boolean changeDirection;
    public boolean back;



    public GraphicsPanel() {
        myShapeList = shapeList.getMyShapes();
        (new Thread(this)).start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyShape shape:myShapeList
             ) {
            if(isMove) {
                shape.move();
            }else if(moveOnlyRects){
                if(shape.isRactangle()){
                    shape.move();
                }
            }else if(moveOnlyOvals){
                if(!shape.isRactangle()){
                    shape.move();
                }
            }else if (isChangeColor){
                shape.cangeColor();
                shape.move();
            }else if(changeDirection){
                if(shape.isMoveByX()) {
                    shape.setMoveByX(false);
                }else {
                    shape.setMoveByX(true);
                }
            }

            shape.pain(g);

        }

    }

    @Override
    public void run() {
        while (true){
            try {
                super.repaint();
                Thread.sleep(100);

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
