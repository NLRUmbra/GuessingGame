/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Service;

import Main.CTO.Game;

/**
 *
 * @author Noah McElroy
 */
public interface GuessingGameServiceLayer {
    String createAnswer();//creates 4 digit number user random number and find way to have no repeating numbers
    
    boolean compareResults(int id, String guess);//setting e and p
    
    Game addGame(int id, Game game);
    
    Game deleteGame(int id);

}
