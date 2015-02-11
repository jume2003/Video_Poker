/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package videopoker;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author James
 */
public class Sound {
    
    public static final Sound deal = new Sound("/videopoker/sounds/deal.wav");
    public static final Sound place = new Sound("/videopoker/sounds/place.wav");
    
    private AudioClip clip;
    
    public Sound(String filename){
        try{
            
            clip = Applet.newAudioClip(Sound.class.getResource(filename));
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void play(){
        try{
            
            new Thread(){
                public void run(){
                    clip.play();
                }
            }.start();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}

