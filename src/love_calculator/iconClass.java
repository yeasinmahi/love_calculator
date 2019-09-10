package love_calculator;

import java.awt.Frame;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author SAMI
 */
public class iconClass {
    public iconClass(String loc,Frame frame){
        try{
            URL iconURL = getClass().getResource(loc);
            // iconURL is null when not found
            ImageIcon icon = new ImageIcon(iconURL);
            frame.setIconImage(icon.getImage());
        }catch(Exception ex){
            
        }
    }
}
