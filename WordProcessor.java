/*
 * Name: Kate Denner, Helen Lin
 * Princeton Hackathon 2014
 * Speech to Braille
 * 
 * Dependencies: Character.java
 * Description: Word processor gets text from Vognition and accesses Character 
 *   to return the correct command and deals with the actual translation from 
 *   speech to english text and text to braille.
 */


public class WordProcessor {
    
    //CHARS that SpeechtoBraille supports
    private final String CHARS = "abcdefghijklmnopqstuvwxyz ";
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
            "1,0,1,0,1,1", //z
            "0,0,0,0,0,0"  //space
        };     
    
    
    //retrieves correct Character for use
    public String getBraille(char c) {
        
        int pos = CHARS.indexOf(c);
        return brailChars[pos];
    }
    
    
    //acts as an intermediary b/w speech and text
    //                            text and braille
    public void main() {
        String text = "";
        //get text from vognition
        int l = text.length();
        
        String bCommands = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            bCommands += getBraille(c);
        }
    }
    

    
}