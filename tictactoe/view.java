/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author BAZAID
 */
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;


class view extends JFrame
{
public JButton buttons[];
public GridLayout display;
public JLabel myname;
public JLabel myname2;
public JLabel myname3;
 
 view()
 {
  super("TIC TAC TOE"); 
  myname=new JLabel();
  myname2=new JLabel();
  myname3=new JLabel();
  myname.setText("Agha Bazaid Khan");
  myname2.setText("");
  myname3.setText("");
  display= new GridLayout(4,3,5,5); 
  setSize(700,700);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLayout(display);
  buttons = new JButton[9];//3x3 board.
  add(myname);
  add(myname2);
  add(myname3);
  addbuttons();
  setVisible(true);
 }
 
 public void addbuttons()
 {
     for(int i=0; i<9; i++)//9 buttons.
  {
        buttons[i] = new JButton(); 
        add(buttons[i]);
  }
 }
 
 
 public void Restartgame()//restart the game.
 {
  for(int i=0; i<9; i++)
  {
   buttons[i].setText("");
  }
 }
}
