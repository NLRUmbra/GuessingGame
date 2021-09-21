package Main.Dao;

import Main.CTO.Game;
import java.util.List;


/**
 *
 * @author Noah McElroy
 */
public interface GuessingGameDao {
    Game add(Game game, String answer);

    List<Game> getAll();

    Game findById(int id);

    // true if item exists and is updated
    boolean update(Game game);

    // true if item exists and is deleted
    boolean deleteById(int id);
    
}
