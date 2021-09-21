/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Dao;

import Main.CTO.Game;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Noah McElroy
 */
@Repository
public class GuessingGameDaoImpl implements GuessingGameDao{
    
    private static final List<Game> games = new ArrayList<>();

    @Override
    public Game add(Game game) {

        int nextId = games.stream()
                .mapToInt(i -> i.getId())
                .max()
                .orElse(0) + 1;

        game.setId(nextId);
        games.add(game);
        return game;
    }

    @Override
    public List<Game> getAll() {
        return new ArrayList<>(games);
    }

    @Override
    public Game findById(int id) {
        return games.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean update(Game game) {

        int index = 0;
        while (index < games.size()
                && games.get(index).getId() != game.getId()) {
            index++;
        }

        if (index < games.size()) {
            games.set(index, game);
        }
        return index < games.size();
    }

    @Override
    public boolean deleteById(int id) {
        return games.removeIf(i -> i.getId() == id);
    }

    
    
    
    
    
    
    
  
    /*private Map<Integer, Game> gameList =new HashMap<>();

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

    /*@Override
    public Game updateGame(int id) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Game> listAllGames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
