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
    
    //CHARS that SpeechtoBraille supports
    private final String CHARS = "abcdefghijklmnopqstuvwxyz";
    //defining braille formation with brute force
    private final String[] brailChars = new String[] {
            "1,0,0,0,0,0", //a
            "1,1,0,0,0,0", //b
            "1,0,0,1,0,0", //c
            "1,0,0,1,1,0", //d
            "1,0,0,0,1,0", //e
            "1,1,0,1,0,0", //f
            "1,1,0,1,1,0", //g
            "1,1,0,0,1,0", //h
            "0,1,0,1,0,0", //i
            "0,1,0,1,1,0", //j
            "1,0,1,0,0,0", //k
            "1,0,0,0,0,0", //l
            "1,1,1,0,0,0", //m
            "1,0,1,1,1,0", //n
            "1,0,1,1,1,0", //o
            "1,1,1,1,0,0", //p
            "1,1,1,1,1,0", //q
            "1,1,1,0,1,0", //r
            "0,1,1,1,0,0", //s
            "0,1,1,1,1,0", //t
            "1,0,1,0,0,1", //u
            "1,1,1,0,0,1", //v
            "0,1,0,1,1,1", //w
            "1,0,1,1,0,1", //x
            "1,0,1,1,1,1", //y
            "1,0,1,0,1,1"  //z
        };     
    //retrieves correct Character for use
    public String getBraille(char c) {
        int pos = CHARS.indexOf(c);
        return brailChars[pos];
    }
    
    public String space() {
        return "0,0,0,0,0,0";
    }
    
}