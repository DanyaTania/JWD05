package com.gourianova;

import com.gourianova.model.Coord;
import com.gourianova.model.Figure;
import com.gourianova.ui.Window;

public class BVTetris {
    public static void main(String[] args){
        Window window=new Window();
        window.run();
        javax.swing.SwingUtilities.invokeLater(window);
       // window.showFigure(Figure.Z2, new Coord(5,5),1);
        window.addFigure();
 //       window.showFigure(Figure.Z2, new Coord(4,5),1);
    }
}
