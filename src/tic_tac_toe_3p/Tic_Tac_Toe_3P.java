package tic_tac_toe_3p;

import java.awt.Color;
import javax.swing.*;

public class Tic_Tac_Toe_3P extends javax.swing.JFrame
{    
     private int startGameX=1, startGameO=0 , startGameZ=0, c=1;
     private String startGame = "X";
    private int xcount = 0;
    private int ocount = 0;
   private int zcount = 0;
   
    public Tic_Tac_Toe_3P() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
private void gameScore()
{
    jlblPlayerX.setText(String.valueOf(xcount));
    jlblPlayerO.setText(String.valueOf(ocount));
    jlblPlayerZ.setText(String.valueOf(zcount));
}

private void choose_a_Player()
{
    if(c!=1)
    {    
    if(startGameX==1 && startGameO==0 && startGameZ==0  )
    {
        startGame="X";
        startGameO=1;
        startGameX=0;
    }
    else if(startGameX==0 && startGameO==1 && startGameZ==0  )
    {
        startGame="O";
        startGameO=0;
        startGameZ=1;
    }
    else if(startGameX==0 && startGameO==0 && startGameZ==1  )
    {
        startGame="Z";
        startGameZ=0;
        startGameX=1;
    }
    } 
}

private  void winningGame()
{
    String b1= jButton1.getText();
    String b2= jButton2.getText();
    String b3= jButton3.getText();
    String b10=jButton10.getText();
    
    String b4= jButton4.getText();
    String b5= jButton5.getText();
    String b6= jButton6.getText();
    String b11= jButton11.getText();
    
    String b7= jButton7.getText();
    String b8= jButton8.getText();
    String b9= jButton9.getText();
    String b12= jButton12.getText();
    
    String b16= jButton16.getText();
    String b13= jButton13.getText();
    String b14= jButton14.getText();
    String b15= jButton15.getText();
    
    if((b1==("X") || b1==("O")) && (b2==("X") || b2==("O")) && (b3==("X") || b3==("O")) && (b10==("X") || b10==("O")))
    {    
    if(b1==("O")&& b2==("O") && b3==("O") && b10==("O")  )
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton1.setBackground(Color.ORANGE);
        jButton2.setBackground(Color.ORANGE);
        jButton3.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton1.setBackground(Color.YELLOW);
        jButton2.setBackground(Color.YELLOW);
        jButton3.setBackground(Color.YELLOW);
        jButton10.setBackground(Color.YELLOW);
        return;
    }    
    }
    
    if((b1==("Z") || b1==("O")) && (b2==("Z") || b2==("O")) && (b3==("Z") || b3==("O")) && (b10==("Z") || b10==("O")))
    {    
    if(b1==("Z")&& b2==("Z") && b3==("Z") && b10==("Z")  )
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
        jButton1.setBackground(Color.CYAN);
        jButton2.setBackground(Color.CYAN);
        jButton3.setBackground(Color.CYAN);
        jButton10.setBackground(Color.CYAN);
        return;
    }
     else
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton1.setBackground(Color.ORANGE);
        jButton2.setBackground(Color.ORANGE);
        jButton3.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        return;
    }    
    }
    
    if((b1==("Z") || b1==("X")) && (b2==("Z") || b2==("X")) && (b3==("Z") || b3==("X")) && (b10==("Z") || b10==("X")))
    {    
    if(b1==("X")&& b2==("X") && b3==("X") && b10==("X")  )
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton1.setBackground(Color.YELLOW);
        jButton2.setBackground(Color.YELLOW);
        jButton3.setBackground(Color.YELLOW);
        jButton10.setBackground(Color.YELLOW);
       return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
       jButton1.setBackground(Color.CYAN);
        jButton2.setBackground(Color.CYAN);
        jButton3.setBackground(Color.CYAN);
        jButton10.setBackground(Color.CYAN);
        return;
    }    
    }
    
    //------------------------------------------------------------------------------------------------------------------//
     if((b4==("X") || b4==("O")) && (b5==("X") || b5==("O")) && (b6==("X") || b6==("O")) && (b11==("X") || b11==("O")))
    {    
    if(b4==("O")&& b5==("O") && b6==("O") && b11==("O")  )
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton4.setBackground(Color.ORANGE);
        jButton5.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton4.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton6.setBackground(Color.YELLOW);
        jButton11.setBackground(Color.YELLOW);
        return;
    }    
    }
    
    if((b4==("Z") || b4==("O")) && (b5==("Z") || b5==("O")) && (b6==("Z") || b6==("O")) && (b11==("Z") || b11==("O")))
    {    
    if(b4==("Z")&& b5==("Z") && b6==("Z") && b11==("Z")  )
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
        jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton11.setBackground(Color.CYAN);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton4.setBackground(Color.ORANGE);
        jButton5.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        return;
    }    
    }
    
    if((b4==("Z") || b4==("X")) && (b5==("Z") || b5==("X")) && (b6==("Z") || b6==("X")) && (b11==("Z") || b11==("X")))
    {    
    if(b4==("X")&& b5==("X") && b6==("X") && b11==("X")  )
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton4.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton6.setBackground(Color.YELLOW);
        jButton11.setBackground(Color.YELLOW);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
       jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton11.setBackground(Color.CYAN);
        return;
    }    
    }
    
    //-----------------------------------------------------------------------------------------------------------------//
     if((b7==("X") || b7==("O")) && (b8==("X") || b8==("O")) && (b9==("X") || b9==("O")) && (b12==("X") || b12==("O")))
    {    
    if(b7==("O")&& b8==("O") && b9==("O") && b12==("O")  )
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton7.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton7.setBackground(Color.YELLOW);
        jButton8.setBackground(Color.YELLOW);
        jButton9.setBackground(Color.YELLOW);
        jButton12.setBackground(Color.YELLOW);
        return;
    }    
    }
    
    if((b7==("Z") || b7==("O")) && (b8==("Z") || b8==("O")) && (b9==("Z") || b9==("O")) && (b12==("Z") || b12==("O")))
    {    
    if(b7==("Z")&& b8==("Z") && b9==("Z") && b12==("Z")  )
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
        jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
        jButton12.setBackground(Color.CYAN);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton7.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        return;
    }    
    }
    
    if((b7==("Z") || b7==("X")) && (b8==("Z") || b8==("X")) && (b9==("Z") || b9==("X")) && (b12==("Z") || b12==("X")))
    {    
    if(b7==("X")&& b8==("X") && b9==("X") && b12==("X")  )
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton7.setBackground(Color.YELLOW);
        jButton8.setBackground(Color.YELLOW);
        jButton9.setBackground(Color.YELLOW);
        jButton12.setBackground(Color.YELLOW);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
       jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
        jButton12.setBackground(Color.CYAN);
        return;
    }    
    }
     
    //-----------------------------------------------------------------------------------------------------------------//
       if((b13==("X") || b13==("O")) && (b14==("X") || b14==("O")) && (b15==("X") || b15==("O")) && (b16==("X") || b16==("O")))
    {    
    if(b13==("O")&& b14==("O") && b15==("O") && b16==("O")  )
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton13.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton13.setBackground(Color.YELLOW);
        jButton14.setBackground(Color.YELLOW);
        jButton15.setBackground(Color.YELLOW);
        jButton16.setBackground(Color.YELLOW);
        return;
    }    
    }
    
    if((b13==("Z") || b13==("O")) && (b14==("Z") || b14==("O")) && (b15==("Z") || b15==("O")) && (b16==("Z") || b16==("O")))
    {    
    if(b13==("Z")&& b14==("Z") && b15==("Z") && b16==("Z")  )
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
        jButton13.setBackground(Color.CYAN);
        jButton14.setBackground(Color.CYAN);
        jButton15.setBackground(Color.CYAN);
        jButton16.setBackground(Color.CYAN);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton13.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        return;
    }    
    }
    
    if((b13==("Z") || b13==("X")) && (b14==("Z") || b14==("X")) && (b15==("Z") || b15==("X")) && (b16==("Z") || b16==("X")))
    {    
    if(b13==("X")&& b14==("X") && b15==("X") && b16==("X")  )
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton13.setBackground(Color.YELLOW);
        jButton14.setBackground(Color.YELLOW);
        jButton15.setBackground(Color.YELLOW);
        jButton16.setBackground(Color.YELLOW);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
       jButton13.setBackground(Color.CYAN);
        jButton14.setBackground(Color.CYAN);
        jButton15.setBackground(Color.CYAN);
        jButton16.setBackground(Color.CYAN);
        return;
    }    
    }
    
    //-----------------------------------------------------------------------------------------------------------------//

    //-----------------------------------------------------------------------------------------------------------------//
    
    if((b1==("X") || b1==("O")) && (b4==("X") || b4==("O")) && (b7==("X") || b7==("O")) && (b13==("X") || b13==("O")))
    {    
    if(b1==("O")&& b4==("O") && b7==("O") && b13==("O")  )
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton1.setBackground(Color.ORANGE);
        jButton4.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton1.setBackground(Color.YELLOW);
        jButton4.setBackground(Color.YELLOW);
        jButton7.setBackground(Color.YELLOW);
        jButton13.setBackground(Color.YELLOW);
        return;
    }    
    }
    
    if((b1==("Z") || b1==("O")) && (b4==("Z") || b4==("O")) && (b7==("Z") || b7==("O")) && (b13==("Z") || b13==("O")))
    {    
    if(b1==("Z")&& b4==("Z") && b7==("Z") && b13==("Z")  )
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
        jButton1.setBackground(Color.CYAN);
        jButton4.setBackground(Color.CYAN);
        jButton7.setBackground(Color.CYAN);
        jButton13.setBackground(Color.CYAN);
        return;
    }
     else
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton1.setBackground(Color.ORANGE);
        jButton4.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        return;
    }    
    }
    
    if((b1==("Z") || b1==("X")) && (b4==("Z") || b4==("X")) && (b7==("Z") || b7==("X")) && (b13==("Z") || b13==("X")))
    {    
    if(b1==("X")&& b4==("X") && b7==("X") && b13==("X")  )
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton1.setBackground(Color.YELLOW);
        jButton4.setBackground(Color.YELLOW);
        jButton7.setBackground(Color.YELLOW);
        jButton13.setBackground(Color.YELLOW);
       return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
       jButton1.setBackground(Color.CYAN);
        jButton4.setBackground(Color.CYAN);
        jButton7.setBackground(Color.CYAN);
        jButton13.setBackground(Color.CYAN);
        return;
    }    
    }
    
    //------------------------------------------------------------------------------------------------------------------//
     if((b2==("X") || b2==("O")) && (b5==("X") || b5==("O")) && (b8==("X") || b8==("O")) && (b14==("X") || b14==("O")))
    {    
    if(b2==("O")&& b5==("O") && b8==("O") && b14==("O")  )
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton2.setBackground(Color.ORANGE);
        jButton5.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton2.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton8.setBackground(Color.YELLOW);
        jButton14.setBackground(Color.YELLOW);
        return;
    }    
    }
    
    if((b2==("Z") || b2==("O")) && (b5==("Z") || b5==("O")) && (b8==("Z") || b8==("O")) && (b14==("Z") || b14==("O")))
    {    
    if(b2==("Z")&& b5==("Z") && b8==("Z") && b14==("Z")  )
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
        jButton2.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton14.setBackground(Color.CYAN);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton2.setBackground(Color.ORANGE);
        jButton5.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        return;
    }    
    }
    
    if((b2==("Z") || b2==("X")) && (b5==("Z") || b5==("X")) && (b8==("Z") || b8==("X")) && (b14==("Z") || b14==("X")))
    {    
    if(b2==("X")&& b5==("X") && b8==("X") && b14==("X")  )
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton2.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton8.setBackground(Color.YELLOW);
        jButton14.setBackground(Color.YELLOW);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
       jButton2.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton14.setBackground(Color.CYAN);
        return;
    }    
    }
    
    //-----------------------------------------------------------------------------------------------------------------//
     if((b3==("X") || b3==("O")) && (b6==("X") || b6==("O")) && (b9==("X") || b9==("O")) && (b15==("X") || b15==("O")))
    {    
    if(b3==("O")&& b6==("O") && b9==("O") && b15==("O")  )
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton3.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton3.setBackground(Color.YELLOW);
        jButton6.setBackground(Color.YELLOW);
        jButton9.setBackground(Color.YELLOW);
        jButton15.setBackground(Color.YELLOW);
        return;
    }    
    }
    
    if((b3==("Z") || b3==("O")) && (b6==("Z") || b6==("O")) && (b9==("Z") || b9==("O")) && (b15==("Z") || b15==("O")))
    {    
    if(b3==("Z")&& b6==("Z") && b9==("Z") && b15==("Z")  )
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
        jButton3.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
        jButton15.setBackground(Color.CYAN);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton3.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        return;
    }    
    }
    
    if((b3==("Z") || b3==("X")) && (b6==("Z") || b6==("X")) && (b9==("Z") || b9==("X")) && (b15==("Z") || b15==("X")))
    {    
    if(b3==("X")&& b6==("X") && b9==("X") && b15==("X")  )
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton3.setBackground(Color.YELLOW);
        jButton6.setBackground(Color.YELLOW);
        jButton9.setBackground(Color.YELLOW);
        jButton15.setBackground(Color.YELLOW);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
       jButton3.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
        jButton15.setBackground(Color.CYAN);
        return;
    }    
    }
     
    //-----------------------------------------------------------------------------------------------------------------//
    if((b10==("X") || b10==("O")) && (b11==("X") || b11==("O")) && (b12==("X") || b12==("O")) && (b16==("X") || b16==("O")))
    {    
    if(b10==("O")&& b11==("O") && b12==("O") && b16==("O")  )
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton10.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton10.setBackground(Color.YELLOW);
        jButton11.setBackground(Color.YELLOW);
        jButton12.setBackground(Color.YELLOW);
        jButton16.setBackground(Color.YELLOW);
        return;
    }    
    }
    
    if((b10==("Z") || b11==("O")) && (b11==("Z") || b11==("O")) && (b12==("Z") || b12==("O")) && (b16==("Z") || b16==("O")))
    {    
    if(b10==("Z")&& b11==("Z") && b12==("Z") && b16==("Z")  )
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
        jButton10.setBackground(Color.CYAN);
        jButton11.setBackground(Color.CYAN);
        jButton12.setBackground(Color.CYAN);
        jButton16.setBackground(Color.CYAN);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton10.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        return;
    }    
    }
    
    if((b10==("Z") || b10==("X")) && (b11==("Z") || b11==("X")) && (b12==("Z") || b12==("X")) && (b16==("Z") || b16==("X")))
    {    
    if(b10==("X")&& b11==("X") && b12==("X") && b16==("X")  )
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton10.setBackground(Color.YELLOW);
        jButton11.setBackground(Color.YELLOW);
        jButton12.setBackground(Color.YELLOW);
        jButton16.setBackground(Color.YELLOW);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
       jButton10.setBackground(Color.CYAN);
        jButton11.setBackground(Color.CYAN);
        jButton12.setBackground(Color.CYAN);
        jButton16.setBackground(Color.CYAN);
        return;
    }    
    }
    
    //-------------------------------------------------------------------------------------------------------------------//
    //-------------------------------------------------------------------------------------------------------------------//
    
    if((b1==("X") || b1==("O")) && (b5==("X") || b5==("O")) && (b9==("X") || b9==("O")) && (b16==("X") || b16==("O")))
    {    
    if(b1==("O")&& b5==("O") && b9==("O") && b16==("O")  )
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton1.setBackground(Color.ORANGE);
        jButton5.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton1.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton9.setBackground(Color.YELLOW);
        jButton16.setBackground(Color.YELLOW);
        return;
    }    
    }
    
    if((b1==("Z") || b1==("O")) && (b5==("Z") || b5==("O")) && (b9==("Z") || b9==("O")) && (b16==("Z") || b16==("O")))
    {    
    if(b1==("Z")&& b5==("Z") && b9==("Z") && b16==("Z")  )
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
        jButton1.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
        jButton16.setBackground(Color.CYAN);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton1.setBackground(Color.ORANGE);
        jButton5.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        return;
    }    
    }
    
    if((b1==("Z") || b1==("X")) && (b5==("Z") || b5==("X")) && (b9==("Z") || b9==("X")) && (b16==("Z") || b16==("X")))
    {    
    if(b1==("X")&& b5==("X") && b9==("X") && b16==("X")  )
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton1.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton9.setBackground(Color.YELLOW);
        jButton16.setBackground(Color.YELLOW);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
       jButton1.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
        jButton16.setBackground(Color.CYAN);
        return;

    }    
    }
    //-----------------------------------------------------------------------------------------------------------------//
    
    if((b10==("X") || b10==("O")) && (b6==("X") || b6==("O")) && (b8==("X") || b8==("O")) && (b13==("X") || b13==("O")))
    {    
    if(b10==("O")&& b6==("O") && b8==("O") && b13==("O")  )
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton10.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton10.setBackground(Color.YELLOW);
        jButton6.setBackground(Color.YELLOW);
        jButton8.setBackground(Color.YELLOW);
        jButton13.setBackground(Color.YELLOW);
        return;
    }    
    }
    
    if((b10==("Z") || b10==("O")) && (b6==("Z") || b6==("O")) && (b8==("Z") || b8==("O")) && (b13==("Z") || b13==("O")))
    {    
    if(b10==("Z")&& b6==("Z") && b8==("Z") && b13==("Z")  )
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
        jButton10.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton13.setBackground(Color.CYAN);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton10.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        return;
    }    
    }
    
    if((b10==("Z") || b10==("X")) && (b6==("Z") || b6==("X")) && (b8==("Z") || b8==("X")) && (b13==("Z") || b13==("X")))
    {    
    if(b10==("X")&& b6==("X") && b8==("X") && b13==("X")  )
    {
        JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton10.setBackground(Color.YELLOW);
        jButton6.setBackground(Color.YELLOW);
        jButton8.setBackground(Color.YELLOW);
        jButton13.setBackground(Color.YELLOW);
        return;
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Player Z Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        zcount++;
        gameScore();
       jButton10.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton13.setBackground(Color.CYAN);
        return;
    }    
    }
}
        
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jlblp = new javax.swing.JLabel();
        jlblpZ = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jlblPlay = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jlblPlayerZ = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        
        jButton10 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacTao");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(4, 6, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);
        
        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);
        
        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jlblp.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jlblp.setText("Player X :");
        jPanel6.add(jlblp, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jPanel7.add(jlblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);
        
        /*--------------------------------------------------------------------------------------------*/

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);
        
        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jlblPlay.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jlblPlay.setText("Player O :");
        jPanel11.add(jlblPlay, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jPanel12.add(jlblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);
        
        /*------------------------------------------------------------------------------------*/

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);
        
        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel20);
        
        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel25.setLayout(new java.awt.BorderLayout());

        jlblpZ.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jlblpZ.setText("Player Z :");
        jPanel25.add(jlblpZ, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jlblPlayerZ.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jlblPlayerZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerZ.setText("0");
        jPanel26.add(jlblPlayerZ, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel26);
        
        
        /*------------------------------------------------------------------------------------------------*/
        
       jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton14, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton15, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel23);
        
        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 96)); 
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton16, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel24);
        
        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel17.setLayout(new java.awt.BorderLayout());
        
        
        
        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) 
    {
        frame =new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Conform if you want to exit","Tic Tac Teo",
                JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION);
        {
           System.exit(0);
        }
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    
    jButton1.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton1.setForeground(Color.GREEN);
    }
    else 
    {
        jButton1.setForeground(Color.BLUE);
    }
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    jButton2.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton2.setForeground(Color.GREEN);
    }
    else 
    {
        jButton2.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    
    choose_a_Player();
    winningGame();

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
jButton3.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton3.setForeground(Color.GREEN);
    }
    else 
    {
        jButton3.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
jButton10.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton10.setForeground(Color.GREEN);
    }
    else 
    {
        jButton10.setForeground(Color.BLUE);
    }
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    
    choose_a_Player();
    winningGame();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
      jButton4.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton4.setForeground(Color.GREEN);
    }
    else 
    {
        jButton4.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
     jButton5.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton5.setForeground(Color.GREEN);
    }
    else 
    {
        jButton5.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
     jButton6.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton6.setForeground(Color.GREEN);
    }
    else 
    {
        jButton6.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
    jButton11.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton11.setForeground(Color.GREEN);
    }
    else 
    {
        jButton11.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
    jButton7.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton7.setForeground(Color.GREEN);
    }
    else 
    {
        jButton7.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
     jButton8.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton8.setForeground(Color.GREEN);
    }
    else 
    {
        jButton8.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
     jButton9.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton9.setForeground(Color.GREEN);
    }
    else 
    {
        jButton9.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }
    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
    jButton12.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton12.setForeground(Color.GREEN);
    }
    else 
    {
        jButton12.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }
    
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
    jButton13.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton13.setForeground(Color.GREEN);
    }
    else 
    {
        jButton13.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }
    
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
    jButton14.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton14.setForeground(Color.GREEN);
    }
    else 
    {
        jButton14.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }
    
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
    jButton15.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton15.setForeground(Color.GREEN);
    }
    else 
    {
        jButton15.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }
    
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
    jButton16.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton16.setForeground(Color.GREEN);
    }
    else 
    {
        jButton16.setForeground(Color.BLUE);
    }
    
    if(c==1)
    {    
    c++;
    startGameX=0;
    startGameO=1;
    }
    choose_a_Player();
    winningGame();
    }
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {
    jButton1.setText(null);
    jButton2.setText(null);
    jButton3.setText(null);
    jButton10.setText(null);
    
    jButton4.setText(null);
    jButton5.setText(null);
    jButton6.setText(null);
    jButton11.setText(null);
    
    jButton7.setText(null);
    jButton8.setText(null);
    jButton9.setText(null);
    jButton12.setText(null);
    
    jButton13.setText(null);
    jButton14.setText(null);
    jButton15.setText(null);
    jButton16.setText(null);
    
    
    jButton1.setBackground(Color.lightGray);
    jButton2.setBackground(Color.lightGray);
    jButton3.setBackground(Color.lightGray);
    jButton10.setBackground(Color.lightGray);
    
    jButton4.setBackground(Color.lightGray);
    jButton5.setBackground(Color.lightGray);
    jButton6.setBackground(Color.lightGray);
    jButton11.setBackground(Color.lightGray);
    
    jButton7.setBackground(Color.lightGray);
    jButton8.setBackground(Color.lightGray);
    jButton9.setBackground(Color.lightGray);
    jButton12.setBackground(Color.lightGray);
    
    jButton13.setBackground(Color.lightGray);
    jButton14.setBackground(Color.lightGray);
    jButton15.setBackground(Color.lightGray);
    jButton16.setBackground(Color.lightGray);

    }
    public static void main(String args[]) 
    {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_3P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_3P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_3P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_3P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() {
                new Tic_Tac_Toe_3P().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
   private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
   
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlay;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    private javax.swing.JLabel jlblPlayerZ;
    private javax.swing.JLabel jlblp;
    private javax.swing.JLabel jlblpZ;
    
}
