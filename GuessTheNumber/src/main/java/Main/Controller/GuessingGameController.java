/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import Main.CTO.Game;
import Main.CTO.Round;
import Main.Dao.GuessingGameDao;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    private GuessingGameDao dao;
    
    public GuessingGameController(GuessingGameDao dao){
        this.dao = dao;
    }
    
    @PostMapping("/begin")
    @ResponseStatus(HttpStatus.CREATED)
    public Game Create(){
        Game newGame = new Game();
        dao.add(newGame, createAnswer());
        return newGame;
    }
    
    @PostMapping("/guess/{gameId}")
        public Round guess(@PathVariable int gameId, @RequestBody String g){
        
        //System.out.println(gameId);
        Game thisGame = dao.findById(gameId);
        if (compareResults(thisGame,g)){
            thisGame.setFinished(true);
        }
        return thisGame.getLastRound();
//    return null;
    }
    
    @GetMapping("/game")
    public List<Game> getGames(){
        return dao.getAll();
    }
    

    public String createAnswer(){
        HashSet<Integer> set=new HashSet();  
        Random rand = new Random();
        String answer ="";
        while(set.size() < 4){
            int randomInt = rand.nextInt(10);
            if (!set.contains(randomInt)){
                set.add(randomInt);
                answer+= randomInt;
            }
        }
        return answer.toString();
    }


    public boolean compareResults(Game game, String guess) {
        //{e,p}
        int[] result = {0,0};
        String localAnswer = game.getAnswer();
        System.out.println(guess);
        System.out.println(localAnswer);
        for (int i = 0 ; i < localAnswer.length();i++){
            int position = localAnswer.indexOf(guess.charAt(i));
            if (position != -1){
                if (position == i){
                    result[0]++;
                }
                else{
                    result[1]++;
                }
            }
        }
        
        Round newRound = new Round(result[0],result[1],guess);
        game.addRound(newRound);
        
        System.out.println(Arrays.toString(result));
        
        if (result[0] == 4){
            return true;
        }else{
            return false;
        }
    }

        
}
