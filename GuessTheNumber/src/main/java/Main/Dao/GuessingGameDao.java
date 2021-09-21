/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Dao;
<<<<<<< HEAD

import Main.CTO.Game;
import java.util.List;

=======
import Main.CTO.Game;
import java.util.List;
>>>>>>> eb56b5615b259b0be4ac57c68a88c3042aae87b0
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
