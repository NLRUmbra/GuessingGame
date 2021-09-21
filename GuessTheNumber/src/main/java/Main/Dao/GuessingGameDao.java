/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Dao;

import Main.CTO.Game;
import java.util.List;

/**
 *
 * @author Noah McElroy
 */
public interface GuessingGameDao {
    Game addGame(int id, Game game);
    
    Game deleteGame(int id);
    
    Game updateGame(int id);
    
    List<Game> listAllGames();
}
