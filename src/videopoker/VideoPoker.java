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
public class VideoPoker {

    private int value;
    private String suit;

    public VideoPoker(int value, String suit) {

        this.value = value;
        this.suit = suit;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

}
