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
class model
{
 int Board[] = new int[9];
 int TotalClicks=0;
 
 public void setClick(int position, int value)
 { 
  if(Board[position]==0){ //to handle multiple clicks
    Board[position]=value; 
    TotalClicks++; 
  }

 }
 
 
 //RESET ARRAY AND THE NUMBER OF TURNS COUNT
 public void resetGame()
 {
  TotalClicks=0;
  for(int z=0; z<9; z++)
  {
   Board[z]=0;
  }
 }
 
 public int getResult()
 { 
  //HORIZONTAL INSPECTION
 
    if (Board[0]==1 && Board[1]==1 && Board[2]==1)
     return 1; // O WINS  
   if (Board[0]==2 && Board[1]==2 && Board[2]==2)
   return 2; // X WINS 
  if (Board[3]==1 && Board[4]==1 && Board[5]==1)
     return 1; // O WINS 
  if (Board[3]==2 && Board[4]==2 && Board[5]==2)
   return 2; // X WINS
  if (Board[6]==1 && Board[7]==1 && Board[8]==1)
     return 1; // O WINS 
  if (Board[6]==2 && Board[7]==2 && Board[8]==2)
   return 2; // X WINS
  
   
  // VERTICAL INSPECTION

  if (Board[0]==1 && Board[3]==1 && Board[6]==1)
     return 1; // O WINS  
  if (Board[0]==2 && Board[3]==2 && Board[6]==2)
   return 2; // X WINS
  if (Board[1]==1 && Board[4]==1 && Board[7]==1)
     return 1; // O WINS
  if (Board[1]==2 && Board[4]==2 && Board[7]==2)
   return 2; // X WINS
  if (Board[2]==1 && Board[5]==1 && Board[8]==1)
     return 1; // O WINS
  if (Board[2]==2 && Board[5]==2 && Board[8]==2)
   return 2; // X WINS 
   
  //DIAGONAL INSPECTION
  
   if (Board[0]==1 && Board[4]==1 && Board[8]==1)
     return 1; // O WINS
   if (Board[0]==2 && Board[4]==2 && Board[8]==2)
   return 2; // X WINS
  if (Board[2]==1 && Board[4]==1 && Board[6]==1)
     return 1; // O WINS
   if (Board[2]==2 && Board[4]==2 && Board[6]==2)
   return 2; // X WINS
  
  if (TotalClicks==9)
   return 3; //Game Tie.

  return 0; // Continue Game
 }
}