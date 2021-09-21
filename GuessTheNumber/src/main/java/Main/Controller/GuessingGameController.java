/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import Main.CTO.Game;
import Main.Dao.GuessingGameDao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Noah McElroy
 */
@RestController
@RequestMapping("/api")
public class GuessingGameController {
    
    private final GuessingGameDao dao;
    
    public GuessingGameController(GuessingGameDao dao){
        this.dao = dao;
    }
    
    @PostMapping("/begin")
    @ResponseStatus(HttpStatus.CREATED)
    public Game Create(){
        Game newGame = new Game();
        dao.addGame(0, newGame);
        return newGame;
    }
    
    @PostMapping("/guess");
//    //private AddressBookView view;
//    private UserIO io = new UserIOConsoleImpl();
//    private GuessingGameServiceLayer service;
//
//    public GuessingGameController(GuessingGameServiceLayer service) {
//        //this.view = view;
//        this.service = service;
//    }
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
