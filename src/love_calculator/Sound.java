package love_calculator;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author SAMI
 */
class Sound {
    private AudioClip clip;
    
    public Sound(String file){
        try{
            clip=Applet.newAudioClip(Sound.class.getResource(file));
        }catch(Exception ex){
        }
    }
    public void playLoop(){
        clip.loop();
    }
    public void stop(){
        clip.stop();
    }
    public void play(){
        clip.play();
    }
    
}
