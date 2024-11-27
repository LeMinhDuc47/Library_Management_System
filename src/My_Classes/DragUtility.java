/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package My_Classes;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DragUtility {
    public static void addDragFunctionality(JFrame frame) {
        final int[] mouseX = {0};
        final int[] mouseY = {0};

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                mouseX[0] = evt.getX();
                mouseY[0] = evt.getY();
            }
        });

        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                int x = evt.getXOnScreen() - mouseX[0];
                int y = evt.getYOnScreen() - mouseY[0];
                frame.setLocation(x, y);
            }
        });
    }
}
