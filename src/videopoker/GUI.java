/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videopoker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author James
 */
public class GUI extends javax.swing.JFrame {

    String value, suit;
    ArrayList<Deck> deck = new ArrayList<>();
    ArrayList<VideoPoker> hand = new ArrayList<>();
    int c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
    boolean h1, h2, h3, h4, h5;
    boolean straightFlush, fours, fullHouse, flush, straight, threes, twoPair, pair;
    boolean help;
    int[] cards;

    public GUI() {
        initComponents();
        Cards();

    }

    public void Cards() {

        h1 = false;
        h2 = false;
        h3 = false;
        h4 = false;
        h5 = false;
        straightFlush = false;
        fours = false;
        fullHouse = false;
        flush = false;
        straight = false;
        threes = false;
        twoPair = false;
        pair = false;
        c1 = 0;
        c2 = 1;
        c3 = 2;
        c4 = 3;
        c5 = 4;
        c6 = 5;
        c7 = 6;
        c8 = 7;
        c9 = 8;
        c10 = 9;

        deck.add(new Deck(0, "heart", "/videopoker/images/cards/h1.png"));
        deck.add(new Deck(1, "heart", "/videopoker/images/cards/h2.png"));
        deck.add(new Deck(2, "heart", "/videopoker/images/cards/h3.png"));
        deck.add(new Deck(3, "heart", "/videopoker/images/cards/h4.png"));
        deck.add(new Deck(4, "heart", "/videopoker/images/cards/h5.png"));
        deck.add(new Deck(5, "heart", "/videopoker/images/cards/h6.png"));
        deck.add(new Deck(6, "heart", "/videopoker/images/cards/h7.png"));
        deck.add(new Deck(7, "heart", "/videopoker/images/cards/h8.png"));
        deck.add(new Deck(8, "heart", "/videopoker/images/cards/h9.png"));
        deck.add(new Deck(9, "heart", "/videopoker/images/cards/h10.png"));
        deck.add(new Deck(10, "heart", "/videopoker/images/cards/hj.png"));
        deck.add(new Deck(11, "heart", "/videopoker/images/cards/hq.png"));
        deck.add(new Deck(12, "heart", "/videopoker/images/cards/hk.png"));

        deck.add(new Deck(0, "spade", "/videopoker/images/cards/s1.png"));
        deck.add(new Deck(1, "spade", "/videopoker/images/cards/s2.png"));
        deck.add(new Deck(2, "spade", "/videopoker/images/cards/s3.png"));
        deck.add(new Deck(3, "spade", "/videopoker/images/cards/s4.png"));
        deck.add(new Deck(4, "spade", "/videopoker/images/cards/s5.png"));
        deck.add(new Deck(5, "spade", "/videopoker/images/cards/s6.png"));
        deck.add(new Deck(6, "spade", "/videopoker/images/cards/s7.png"));
        deck.add(new Deck(7, "spade", "/videopoker/images/cards/s8.png"));
        deck.add(new Deck(8, "spade", "/videopoker/images/cards/s9.png"));
        deck.add(new Deck(9, "spade", "/videopoker/images/cards/s10.png"));
        deck.add(new Deck(10, "spade", "/videopoker/images/cards/sj.png"));
        deck.add(new Deck(11, "spade", "/videopoker/images/cards/sq.png"));
        deck.add(new Deck(12, "spade", "/videopoker/images/cards/sk.png"));

        deck.add(new Deck(0, "club", "/videopoker/images/cards/c1.png"));
        deck.add(new Deck(1, "club", "/videopoker/images/cards/c2.png"));
        deck.add(new Deck(2, "club", "/videopoker/images/cards/c3.png"));
        deck.add(new Deck(3, "club", "/videopoker/images/cards/c4.png"));
        deck.add(new Deck(4, "club", "/videopoker/images/cards/c5.png"));
        deck.add(new Deck(5, "club", "/videopoker/images/cards/c6.png"));
        deck.add(new Deck(6, "club", "/videopoker/images/cards/c7.png"));
        deck.add(new Deck(7, "club", "/videopoker/images/cards/c8.png"));
        deck.add(new Deck(8, "club", "/videopoker/images/cards/c9.png"));
        deck.add(new Deck(9, "club", "/videopoker/images/cards/c10.png"));
        deck.add(new Deck(10, "club", "/videopoker/images/cards/cj.png"));
        deck.add(new Deck(11, "club", "/videopoker/images/cards/cq.png"));
        deck.add(new Deck(12, "club", "/videopoker/images/cards/ck.png"));

        deck.add(new Deck(0, "diamond", "/videopoker/images/cards/d1.png"));
        deck.add(new Deck(1, "diamond", "/videopoker/images/cards/d2.png"));
        deck.add(new Deck(2, "diamond", "/videopoker/images/cards/d3.png"));
        deck.add(new Deck(3, "diamond", "/videopoker/images/cards/d4.png"));
        deck.add(new Deck(4, "diamond", "/videopoker/images/cards/d5.png"));
        deck.add(new Deck(5, "diamond", "/videopoker/images/cards/d6.png"));
        deck.add(new Deck(6, "diamond", "/videopoker/images/cards/d7.png"));
        deck.add(new Deck(7, "diamond", "/videopoker/images/cards/d8.png"));
        deck.add(new Deck(8, "diamond", "/videopoker/images/cards/d9.png"));
        deck.add(new Deck(9, "diamond", "/videopoker/images/cards/d10.png"));
        deck.add(new Deck(10, "diamond", "/videopoker/images/cards/dj.png"));
        deck.add(new Deck(11, "diamond", "/videopoker/images/cards/dq.png"));
        deck.add(new Deck(12, "diamond", "/videopoker/images/cards/dk.png"));

        Collections.shuffle(deck);
    }

    public void Flush() {

        if (fullHouse != true && hand.get(0).getSuit().equals(hand.get(1).getSuit()) && hand.get(1).getSuit().equals(hand.get(2).getSuit()) && hand.get(2).getSuit().equals(hand.get(3).getSuit()) && hand.get(3).getSuit().equals(hand.get(4).getSuit())) {
            displayLbl.setText("Flush");
            flush = true;
        }

    }

    public void Straight() {

        int[] cards = {hand.get(0).getValue(), hand.get(1).getValue(), hand.get(2).getValue(), hand.get(3).getValue(), hand.get(4).getValue()};
        Arrays.sort(cards);

        int i, nextCard;

        if (cards[0] == 0) {

            if ((cards[1] == 1 && cards[2] == 2 && cards[3] == 3 && cards[4] == 4) || (cards[1] == 9 && cards[2] == 10 && cards[3] == 11 && cards[4] == 12)) {
                displayLbl.setText("Straight with ace");
                straight = true;
            }

        } else if (cards[0] + 1 == cards[1] && cards[1] + 1 == cards[2] && cards[2] + 1 == cards[3] && cards[3] + 1 == cards[4]) {
            displayLbl.setText("Straight");
            straight = true;

        }

    }

    public void StraightFlush() {
        if (straight == true && flush == true) {
            displayLbl.setText("Straight Flush");
            straightFlush = true;
        }
    }

    public void Fours() {
        int[] cards = {hand.get(0).getValue(), hand.get(1).getValue(), hand.get(2).getValue(), hand.get(3).getValue(), hand.get(4).getValue()};
        Arrays.sort(cards);

        if ((straightFlush != true && cards[0] == cards[1] && cards[1] == cards[2] && cards[2] == cards[3]) || (cards[1] == cards[2] && cards[2] == cards[3] && cards[3] == cards[4])) {
            displayLbl.setText("four of a kind");
            fours = true;
        }
    }

    public void FullHouse() {

        int[] cards = {hand.get(0).getValue(), hand.get(1).getValue(), hand.get(2).getValue(), hand.get(3).getValue(), hand.get(4).getValue()};
        Arrays.sort(cards);

        if ((fours != true && cards[0] == cards[1] && cards[1] == cards[2] && cards[3] == cards[4]) || (cards[0] == cards[1] && cards[2] == cards[3] && cards[3] == cards[4])) {
            displayLbl.setText("Full house");
            fullHouse = true;
        }
    }

    public void Threes() {

        int[] cards = {hand.get(0).getValue(), hand.get(1).getValue(), hand.get(2).getValue(), hand.get(3).getValue(), hand.get(4).getValue()};
        Arrays.sort(cards);

        if (flush != true && cards[0] == cards[1] && cards[1] == cards[2] && cards[3] != cards[0] && cards[4] != cards[0] && cards[3] != cards[4]) {
            displayLbl.setText("Three of a kind");
            threes = true;
        } else if (flush != true && cards[1] == cards[2] && cards[2] == cards[3] && cards[0] != cards[1] && cards[4] != cards[1] && cards[0] != cards[4]) {
            displayLbl.setText("Three of a kind");
            threes = true;
        } else if (flush != true && cards[2] == cards[3] && cards[3] == cards[4] && cards[0] != cards[2] && cards[1] != cards[2] && cards[0] != cards[1]) {
            displayLbl.setText("Three of a kind");
            threes = true;
        }
    }

    public void Twos() {

        int[] cards = {hand.get(0).getValue(), hand.get(1).getValue(), hand.get(2).getValue(), hand.get(3).getValue(), hand.get(4).getValue()};
        Arrays.sort(cards);

        if (fours != true && fullHouse != true && threes != true && cards[0] == cards[1] && cards[2] == cards[3]) {
            displayLbl.setText("Two pair");
            twoPair = true;
        } else if (fours != true && fullHouse != true && threes != true && cards[0] == cards[1] && cards[3] == cards[4]) {
            displayLbl.setText("Two Pair");
            twoPair = true;
        } else if (fours != true && fullHouse != true && threes != true && cards[1] == cards[2] && cards[3] == cards[4]) {
            displayLbl.setText("Two pair");
            twoPair = true;
        }
    }

    public void Pair() {
        int[] cards = {hand.get(0).getValue(), hand.get(1).getValue(), hand.get(2).getValue(), hand.get(3).getValue(), hand.get(4).getValue()};
        Arrays.sort(cards);

        if (fullHouse != true && threes != true && twoPair != true && cards[0] == cards[1] && (cards[0] >= 10 || cards[0] == 0)) {
            displayLbl.setText("Pair");
            pair = true;
        } else if (fullHouse != true && threes != true && twoPair != true && cards[1] == cards[2] && cards[1] >= 10) {
            displayLbl.setText("Pair");
            pair = true;
        } else if (fullHouse != true && threes != true && twoPair != true && cards[2] == cards[3] && cards[2] >= 10) {
            displayLbl.setText("Pair");
            pair = true;
        } else if (fullHouse != true && threes != true && twoPair != true && cards[3] == cards[4] && cards[3] >= 10) {
            displayLbl.setText("Pair");
            pair = true;
        }
    }

    public void logic() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        hold1Btn = new javax.swing.JButton();
        hold2Btn = new javax.swing.JButton();
        hold3Btn = new javax.swing.JButton();
        hold4Btn = new javax.swing.JButton();
        hold5Btn = new javax.swing.JButton();
        dealBtn = new javax.swing.JButton();
        drawBtn = new javax.swing.JButton();
        displayLbl = new javax.swing.JLabel();
        helpBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(417, 260));
        setMinimumSize(new java.awt.Dimension(417, 260));
        setPreferredSize(new java.awt.Dimension(417, 260));
        setResizable(false);
        getContentPane().setLayout(null);

        card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videopoker/images/cards/back.png"))); // NOI18N
        getContentPane().add(card1);
        card1.setBounds(10, 50, 71, 96);

        card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videopoker/images/cards/back.png"))); // NOI18N
        getContentPane().add(card2);
        card2.setBounds(90, 50, 71, 96);

        card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videopoker/images/cards/back.png"))); // NOI18N
        getContentPane().add(card3);
        card3.setBounds(170, 50, 71, 96);

        card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videopoker/images/cards/back.png"))); // NOI18N
        getContentPane().add(card4);
        card4.setBounds(250, 50, 71, 96);

        card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videopoker/images/cards/back.png"))); // NOI18N
        getContentPane().add(card5);
        card5.setBounds(330, 50, 71, 96);

        hold1Btn.setText("HOLD");
        hold1Btn.setEnabled(false);
        hold1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hold1BtnActionPerformed(evt);
            }
        });
        getContentPane().add(hold1Btn);
        hold1Btn.setBounds(10, 160, 71, 23);

        hold2Btn.setText("HOLD");
        hold2Btn.setEnabled(false);
        hold2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hold2BtnActionPerformed(evt);
            }
        });
        getContentPane().add(hold2Btn);
        hold2Btn.setBounds(90, 160, 71, 23);

        hold3Btn.setText("HOLD");
        hold3Btn.setEnabled(false);
        hold3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hold3BtnActionPerformed(evt);
            }
        });
        getContentPane().add(hold3Btn);
        hold3Btn.setBounds(170, 160, 71, 23);

        hold4Btn.setText("HOLD");
        hold4Btn.setEnabled(false);
        hold4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hold4BtnActionPerformed(evt);
            }
        });
        getContentPane().add(hold4Btn);
        hold4Btn.setBounds(250, 160, 71, 23);

        hold5Btn.setText("HOLD");
        hold5Btn.setEnabled(false);
        hold5Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hold5BtnActionPerformed(evt);
            }
        });
        getContentPane().add(hold5Btn);
        hold5Btn.setBounds(330, 160, 71, 23);

        dealBtn.setText("DEAL");
        dealBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dealBtn);
        dealBtn.setBounds(330, 190, 71, 23);

        drawBtn.setText("DRAW");
        drawBtn.setEnabled(false);
        drawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawBtnActionPerformed(evt);
            }
        });
        getContentPane().add(drawBtn);
        drawBtn.setBounds(250, 190, 71, 23);

        displayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        displayLbl.setForeground(new java.awt.Color(255, 255, 0));
        displayLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayLbl.setText("JACKS OR BETTER");
        displayLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        getContentPane().add(displayLbl);
        displayLbl.setBounds(10, 10, 390, 30);

        helpBtn.setText("HELP");
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(helpBtn);
        helpBtn.setBounds(10, 190, 70, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videopoker/images/help.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 231, 390, 290);

        bg.setBackground(new java.awt.Color(0, 102, 255));
        bg.setOpaque(true);
        getContentPane().add(bg);
        bg.setBounds(0, 0, 420, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dealBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealBtnActionPerformed
        Sound.deal.play();
        displayLbl.setText("");
        card1.setIcon(new javax.swing.ImageIcon(getClass().getResource(deck.get(c1).getImage())));

        card2.setIcon(new javax.swing.ImageIcon(getClass().getResource(deck.get(c2).getImage())));

        card3.setIcon(new javax.swing.ImageIcon(getClass().getResource(deck.get(c3).getImage())));

        card4.setIcon(new javax.swing.ImageIcon(getClass().getResource(deck.get(c4).getImage())));

        card5.setIcon(new javax.swing.ImageIcon(getClass().getResource(deck.get(c5).getImage())));

        dealBtn.setEnabled(false);
        hold1Btn.setEnabled(true);
        hold2Btn.setEnabled(true);
        hold3Btn.setEnabled(true);
        hold4Btn.setEnabled(true);
        hold5Btn.setEnabled(true);
        drawBtn.setEnabled(true);
    }//GEN-LAST:event_dealBtnActionPerformed

    private void hold1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hold1BtnActionPerformed
        if (h1 == false) {
            h1 = true;
            hold1Btn.setForeground(new java.awt.Color(255, 0, 0));
        } else if (h1 == true) {
            h1 = false;
            hold1Btn.setForeground(new java.awt.Color(0, 0, 0));
        }

    }//GEN-LAST:event_hold1BtnActionPerformed

    private void hold2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hold2BtnActionPerformed
        if (h2 == false) {
            h2 = true;
            hold2Btn.setForeground(new java.awt.Color(255, 0, 0));
        } else if (h2 == true) {
            h2 = false;
            hold2Btn.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_hold2BtnActionPerformed

    private void hold3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hold3BtnActionPerformed
        if (h3 == false) {
            h3 = true;
            hold3Btn.setForeground(new java.awt.Color(255, 0, 0));
        } else if (h3 == true) {
            h3 = false;
            hold3Btn.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_hold3BtnActionPerformed

    private void hold4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hold4BtnActionPerformed
        if (h4 == false) {
            h4 = true;
            hold4Btn.setForeground(new java.awt.Color(255, 0, 0));
        } else if (h4 == true) {
            h4 = false;
            hold4Btn.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_hold4BtnActionPerformed

    private void hold5BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hold5BtnActionPerformed
        if (h5 == false) {
            h5 = true;
            hold5Btn.setForeground(new java.awt.Color(255, 0, 0));
        } else if (h5 == true) {
            h5 = false;
            hold5Btn.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_hold5BtnActionPerformed

    private void drawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawBtnActionPerformed
        Sound.place.play();
        if (h1 == false) {
            c1 = c6;
            card1.setIcon(new javax.swing.ImageIcon(getClass().getResource(deck.get(c1).getImage())));
        }
        if (h2 == false) {
            c2 = c7;
            card2.setIcon(new javax.swing.ImageIcon(getClass().getResource(deck.get(c2).getImage())));
        }
        if (h3 == false) {
            c3 = c8;
            card3.setIcon(new javax.swing.ImageIcon(getClass().getResource(deck.get(c3).getImage())));
        }
        if (h4 == false) {
            c4 = c9;
            card4.setIcon(new javax.swing.ImageIcon(getClass().getResource(deck.get(c4).getImage())));
        }
        if (h5 == false) {
            c5 = c10;
            card5.setIcon(new javax.swing.ImageIcon(getClass().getResource(deck.get(c5).getImage())));
        }

        hand.add(new VideoPoker(deck.get(c1).getValue(), deck.get(c1).getSuit()));
        hand.add(new VideoPoker(deck.get(c2).getValue(), deck.get(c2).getSuit()));
        hand.add(new VideoPoker(deck.get(c3).getValue(), deck.get(c3).getSuit()));
        hand.add(new VideoPoker(deck.get(c4).getValue(), deck.get(c4).getSuit()));
        hand.add(new VideoPoker(deck.get(c5).getValue(), deck.get(c5).getSuit()));

        int[] cards = {hand.get(0).getValue(), hand.get(1).getValue(), hand.get(2).getValue(), hand.get(3).getValue(), hand.get(4).getValue()};
        Arrays.sort(cards);
        System.out.println(Arrays.toString(cards));
        Flush();
        Straight();
        StraightFlush();
        Fours();
        FullHouse();
        Threes();
        Twos();
        Pair();

        hold1Btn.setForeground(new java.awt.Color(0, 0, 0));
        hold2Btn.setForeground(new java.awt.Color(0, 0, 0));
        hold3Btn.setForeground(new java.awt.Color(0, 0, 0));
        hold4Btn.setForeground(new java.awt.Color(0, 0, 0));
        hold5Btn.setForeground(new java.awt.Color(0, 0, 0));
        hold1Btn.setEnabled(false);
        hold2Btn.setEnabled(false);
        hold3Btn.setEnabled(false);
        hold4Btn.setEnabled(false);
        hold5Btn.setEnabled(false);
        drawBtn.setEnabled(false);
        dealBtn.setEnabled(true);
        hand.clear();
        deck.clear();
        Cards();
    }//GEN-LAST:event_drawBtnActionPerformed

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
        if (help == false) {
            setMinimumSize(new java.awt.Dimension(417, 560));
            help = true;
        } else if (help == true) {
            setMinimumSize(new java.awt.Dimension(417, 260));
            help = false;
        }
        pack();
    }//GEN-LAST:event_helpBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JButton dealBtn;
    private javax.swing.JLabel displayLbl;
    private javax.swing.JButton drawBtn;
    private javax.swing.JButton helpBtn;
    private javax.swing.JButton hold1Btn;
    private javax.swing.JButton hold2Btn;
    private javax.swing.JButton hold3Btn;
    private javax.swing.JButton hold4Btn;
    private javax.swing.JButton hold5Btn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
