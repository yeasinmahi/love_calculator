package love_calculator;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

/**
 *
 * @author SAMI
 */
public class middleScreen {
    public void screen(Frame frame){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
    }
}
