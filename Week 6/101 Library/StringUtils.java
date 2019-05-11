/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthew
 */
public class StringUtils {
    
    public static boolean included(String word, String searched){
        
        if(word == null || searched == null){
            return false;
        }
        
        word = word.trim();
        word = word.toLowerCase();
        
        searched = searched.trim();
        searched = searched.toLowerCase();
        
        return word.contains(searched);
    }
}
