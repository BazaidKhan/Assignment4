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
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


class controller extends view implements ActionListener
{
 private int MovesCount=0;
 private boolean PlayerTurn=false; // First turn for O
 private model MyModel = new model();
 
 public controller()
 {
  
  for(int i=0; i<9; i++)
   super.buttons[i].addActionListener(this);
 }
 
 
 public void RenewGame(int i)
 {
     int reply=0;
     if(i==1){
        reply = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "X WON!!" , JOptionPane.YES_NO_OPTION);
     }
     else
     {
        reply = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "O WON!!" , JOptionPane.YES_NO_OPTION);
     }
      
  if (reply == JOptionPane.YES_OPTION)
  {
   MyModel.resetGame();
   super.Restartgame();
  }
  else
  {
   dispose();
   System.exit(0);
  }
 }
 
 
 public void actionPerformed (ActionEvent event)
 {
  Object objClicked=event.getSource();

  for(int x=0; x<9; x++)
  {
   if(objClicked==super.buttons[x])
   {
    if (super.buttons[x].getText()=="")
    {
     if (PlayerTurn==false)
     {
      
      super.buttons[x].setText("X");
      super.buttons[x].setFont(new Font("Arial",Font.BOLD,40));
      MyModel.setClick(x,1);
      PlayerTurn=true;  // O turn
      
      MovesCount=MyModel.getResult();
 
     }
     else
     {
      super.buttons[x].setText("O"); 
      super.buttons[x].setFont(new Font("Arial",Font.BOLD,40));
      MyModel.setClick(x,2);
      PlayerTurn=false; // X turn 
      
      MovesCount=MyModel.getResult();
     }
    }
   }
  }
  if(MovesCount==1)
    RenewGame(1);
  else if(MovesCount==2)
      RenewGame(2);

 }
}