import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {



    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Test");
        frame.setSize(new Dimension(600,400));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


        GraphicsPanel graphicsPanel = new GraphicsPanel();

        frame.add(graphicsPanel, new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.BOTH,
                new Insets(2,2,2,2),0,0));

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE&&(!graphicsPanel.isMove)){
                    graphicsPanel.isMove = true;
                }
                else if(e.getKeyCode() == KeyEvent.VK_1&&!graphicsPanel.moveOnlyRects){
                    graphicsPanel.moveOnlyRects=true;
                }
                else if (e.getKeyCode()==KeyEvent.VK_2&&!graphicsPanel.moveOnlyOvals){
                    graphicsPanel.moveOnlyOvals=true;
                }
                else if (e.getKeyCode()==KeyEvent.VK_3&&!graphicsPanel.isChangeColor){
                    graphicsPanel.isChangeColor=true;
                }
                else if (e.getKeyCode()==KeyEvent.VK_4&&!graphicsPanel.changeDirection){
                    graphicsPanel.changeDirection=true;
                }
                else {
                    graphicsPanel.isMove = false;
                    graphicsPanel.moveOnlyRects=false;
                    graphicsPanel.moveOnlyOvals=false;
                    graphicsPanel.isChangeColor=false;
                    graphicsPanel.changeDirection=false;
                }
            }
        });

        frame.setVisible(true);
    }
}
