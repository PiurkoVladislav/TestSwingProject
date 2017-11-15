import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Влад on 15.11.2017.
 */
public class ShapeList {
    private boolean isChangeColor;
    private List<MyShape> myShapes;

    public ShapeList(){
        myShapes = new ArrayList<>();
        for (int i = 2; i <12 ; i++) {
            MyShape myShape;
            if(i%2 == 0) {
                 myShape = new MyShape(0,i*30,600,400,
                        i*10,true,true, new Color((float) Math.random(),
                        (float) Math.random(),
                        (float) Math.random()));
            }
            else {
                 myShape = new MyShape(i*40,0,600,400,
                        i*10,false,false,new Color((float) Math.random(),
                        (float) Math.random(),
                        (float) Math.random()));
            }
            myShapes.add(myShape);
        }
    }

//    public boolean isChangeColor() {
//        return isChangeColor;
//    }

//    public void setChangeColor(boolean changeColor) {
//        for (MyShape shape: myShapes
//             ) {
//            shape.setColor(new Color((float) Math.random(),
//                    (float) Math.random(),
//                    (float) Math.random()));
//        }
//    }

    public List<MyShape> getMyShapes() {
        return myShapes;
    }

    public void setMyShapes(List<MyShape> myShapes) {
        this.myShapes = myShapes;
    }
}
