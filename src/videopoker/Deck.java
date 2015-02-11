/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package videopoker;

/**
 *
 * @author James
 */
public class Deck extends VideoPoker{
    
    private String image;
    
    public Deck(int value, String suit, String image){
        super(value,suit);
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
