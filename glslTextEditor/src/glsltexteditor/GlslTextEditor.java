package glsltexteditor;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GlslTextEditor {

    public static void main(String[] args) {
        JFrame frame = createFrame();
        createJTA(frame);
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
    
}
