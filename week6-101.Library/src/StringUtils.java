/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
        searched = searched.trim();
        searched = searched.toUpperCase();
        word=word.trim();
        word=word.toUpperCase();
        
        if (word.contains(searched)) {
            return true;
        }
        return false;

    }

}
