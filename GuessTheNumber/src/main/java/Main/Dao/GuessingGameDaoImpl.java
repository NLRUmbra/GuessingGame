/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Dao;

import Main.CTO.Game;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Noah McElroy
 */
public class GuessingGameDaoImpl implements GuessingGameDao{
    private Map<int, Game> gameList;

    public GuessingGameDaoImpl() {
    }

    @Override
    public Game addGame(int id, Game game) {
       gameList.put(game.getId(),game);
       return gameList.get(game.getId());
    }

    @Override
    public Game deleteGame(int id) {
        return gameList.remove(id);
    }

    @Override
    public Game updateGame(int id) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Game> listAllGames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
