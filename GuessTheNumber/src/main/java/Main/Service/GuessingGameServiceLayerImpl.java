/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Service;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Noah McElroy
 */
public class GuessingGameServiceLayerImpl {
    int createAnswer(){
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
        return Integer.parseInt(answer);
    }
}
