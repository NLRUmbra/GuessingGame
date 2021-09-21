/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import Main.Dao.GuessingGameDao;
import Main.Service.GuessingGameServiceLayer;
import Main.UI.UserIO;
import Main.UI.UserIOConsoleImpl;

/**
 *
 * @author Noah McElroy
 */
public class GuessingGameController {
    //private AddressBookView view;
    private UserIO io = new UserIOConsoleImpl();
    private GuessingGameServiceLayer service;

    public GuessingGameController(GuessingGameServiceLayer service) {
        //this.view = view;
        this.service = service;
    }
    /*public void run() {
        io.print("What would you like to do?");
        io.print("1: Create new game");
        io.print("2: Attempt to solve a game");
        
        int choice  =  io.readInt("Please select from the above choices.", 1, 2);
        
        switch(choice){
            case 1:
                
                break;
            case 2: 
                int game = selectedGame();
                break;
            default:
                break;
        }
                
    }
    private void createGame(){
        String answer  =  service.createAnswer();
        io.
        
    }
    private int selectedGame(){
        return io.readInt("enter the id of the game you want to try");
    }
    
    private void solvingGame(int id){
        boolean flag = false;
        while(flag==false){
            String guess = io.readString("Enter your guess which is 4 numbers long and has no repeating numbers");
            flag = service.compareResults(guess);
        }
    }*/
        
}
