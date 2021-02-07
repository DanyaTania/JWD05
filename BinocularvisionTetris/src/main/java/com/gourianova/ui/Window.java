package com.gourianova.ui;

import com.gourianova.model.Coord;
import com.gourianova.model.Figure;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends JFrame implements Runnable{
    private Box[][]boxes;
    Figure figure;
    Coord coord;

    public Window() {
    boxes=new Box[Config.WIDTH][Config.HEIGHT];
        initForm();
        initBoxes();
        addKeyListener(new KeyAdapter() ) ;
        }

        public void initForm() {
            setSize(Config.WIDTH * Config.SIZE + 15, Config.HEIGHT * Config.SIZE + 30);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(null);
            setTitle("BinocularVisionTetris");
            setVisible(true);

        }

        public void initBoxes() {
            for (int x = 0; x < Config.WIDTH; x++) {
                for (int y = 0; y < Config.HEIGHT; y++) {
                    boxes[x][y] = new Box(x, y);
                    add(boxes[x][y]);
                }
            }
        }
        public void run() {

             repaint();

             }
        private boolean canMoveFigure(int sx,int sy){
        int left=coord.x+sx+figure.top.x;
        if (left<0)return false;
        int right =coord.x+sx+figure.bottom.x;
        if (right>=Config.WIDTH) return false;
        int doun=coord.y+sy+figure.top.y;
        if (doun<0)return false;
        int up =coord.y+sy+figure.bottom.y;
        if (up>=Config.HEIGHT) return false;
        return true;}

        private void moveFigure(int sx,int sy){
        if (canMoveFigure(sx,sy)){
            coord=coord.plus(sx,sy);
            }
        }
        private void turnFigure(){
        figure=figure.turnRight();
        }

        public void addFigure(){
        figure=Figure.getRandom();
        coord=new Coord( 1,1);
        showFigure();
        }
        private void showFigure(){
        showFigure(figure,coord,1);
        }
        private void hideFigure(){
           showFigure(figure, coord,0);
        }
        public void showFigure(Figure figure, Coord at, int color){
        for(Coord dot: figure.dots) {
            setBoxColor(at.x+dot.x,at.y+dot.y,color);
        }
        }
        public void setBoxColor(int x, int y, int color){
        if (x<0||x>=Config.WIDTH) return;
            if (y<0||y>=Config.HEIGHT) return;
            boxes[x][y].setColor(color);
        }
class KeyAdapter implements KeyListener{
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        hideFigure();
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT: moveFigure(-1,0);break;
            case KeyEvent.VK_RIGHT:moveFigure(+1,0);break;//coord=new Coord(coord.x+1,coord.y);break;
            case KeyEvent.VK_DOWN:moveFigure(0,+1);break;//
            case KeyEvent.VK_UP:moveFigure(0,-1);break;//
            case KeyEvent.VK_SPACE:turnFigure();
            //     figure.turnLeft();break;
       //     case KeyEvent.VK_3:figure.turnRight();break;
        }
       showFigure();
    }

    public void keyReleased(KeyEvent e) {

    }

}

}