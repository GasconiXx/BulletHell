package Interfaz;

import javax.swing.*;

public class GameFrame extends JFrame {
    public static void main(String[] args) {
        GameFrame juego = new GameFrame();
    }

    public GameFrame(){
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.pack();
    }
}
