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
    Game addGame(int id, Game game);
    
    Game deleteGame(int id);

}
