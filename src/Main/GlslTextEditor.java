package Main;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class GlslTextEditor {
    

    public static void main(String[] args) {
        JFrame frame = createFrame();
        createJTA(frame);
        createMenuBar(frame);
        frame.setVisible(true);
    }
    
    public static JFrame createFrame(){
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        return frame;
    }
    
    public static JTextArea createJTA(JFrame frame){
        JTextArea textArea = new JTextArea();
        textArea.setSize(frame.getSize());
        frame.add(textArea);
        textArea.setVisible(true);
        return textArea;
    }
    
    public static JMenuBar createMenuBar(JFrame frame){
        JMenuBar menuBar = new JMenuBar();
        JMenu barItem = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("A menu item!");
        barItem.add(menuItem);
        menuBar.setSize(frame.getWidth(), frame.getHeight()/12);
        frame.setJMenuBar(menuBar);
        
        menuBar.add(barItem);
        return menuBar;
    }
    
}
