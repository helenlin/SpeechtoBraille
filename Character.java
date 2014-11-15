/*
 * Name: Kate Denner, Helen Lin
 * Princeton Hackathon 2014
 * Speech to Braille
 * 
 * Dependencies: 
 * Description: Character is an object that has braille and alphabetic
 *   properties.
 */

public class Character {
    
    private char letter;
    private int[] left, right;
    
    public Character(char c) {
        left = new int[3];
        right = new int[3];
        letter = c;
    }
    
    public Character(char c, int[] l, int[] r) {
        left = l;
        right = r;
        letter = c;
    } 
    
    public int getLeft(int pos) {
        return left[pos];
    }
    
    public int getRight(int pos) {
        return right[pos];
    }
    
}