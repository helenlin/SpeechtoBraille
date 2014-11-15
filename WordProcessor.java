/*
 * Name: Kate Denner, Helen Lin
 * Princeton Hackathon 2014
 * Speech to Braille
 * 
 * Dependencies: 
 * Description: Word processor defines all character objects for the 
 *   alphabet and stores them for later use. It also deals with the
 *   actual translation from speech to english text and text to braille.
 */


public class WordProcessor {
    
    //CHARS that SpeechtoBraille supports
    private final String CHARS = "abcdefghijklmnopqstuvwxyz";
    //defining braille formation with brute force
    private final Character[] brailChars = new Character[] {
            new Character('a', new int[] {1, 0, 0}, new int[] {0, 0, 0}),
            new Character('b', new int[] {1, 1, 0}, new int[] {0, 0, 0}),
            new Character('c', new int[] {1, 0, 0}, new int[] {1, 0, 0}),
            new Character('d', new int[] {1, 0, 0}, new int[] {1, 1, 0}),
            new Character('e', new int[] {1, 0, 0}, new int[] {0, 1, 0}),
            new Character('f', new int[] {1, 1, 0}, new int[] {1, 0, 0}),
            new Character('g', new int[] {1, 1, 0}, new int[] {1, 1, 0}),
            new Character('h', new int[] {1, 1, 0}, new int[] {0, 1, 0}),
            new Character('i', new int[] {0, 1, 0}, new int[] {1, 0, 0}),
            new Character('j', new int[] {0, 1, 0}, new int[] {1, 1, 0}),
            new Character('k', new int[] {1, 0, 1}, new int[] {0, 0, 0}),
            new Character('l', new int[] {1, 0, 0}, new int[] {0, 0, 0}),
            new Character('m', new int[] {1, 1, 1}, new int[] {0, 0, 0}),
            new Character('n', new int[] {1, 0, 1}, new int[] {1, 1, 0}),
            new Character('o', new int[] {1, 0, 1}, new int[] {1, 1, 0}),
            new Character('p', new int[] {1, 1, 1}, new int[] {1, 0, 0}),
            new Character('q', new int[] {1, 1, 1}, new int[] {1, 1, 0}),
            new Character('r', new int[] {1, 1, 1}, new int[] {0, 1, 0}),
            new Character('s', new int[] {0, 1, 1}, new int[] {1, 0, 0}),
            new Character('t', new int[] {0, 1, 1}, new int[] {1, 1, 0}),
            new Character('u', new int[] {1, 0, 1}, new int[] {0, 0, 1}),
            new Character('v', new int[] {1, 1, 1}, new int[] {0, 0, 1}),
            new Character('w', new int[] {0, 1, 0}, new int[] {1, 1, 1}),
            new Character('x', new int[] {1, 0, 1}, new int[] {1, 0, 1}),
            new Character('y', new int[] {1, 0, 1}, new int[] {1, 1, 1}),
            new Character('z', new int[] {1, 0, 1}, new int[] {0, 1, 1})
        };
    
    //retrieves correct Character for use
    public Character getBraille(char c){
        int pos = CHARS.indexOf(c);
        return brailChars[pos];
    }
    
    public static void main(String[] args) {
        
    }
    
}