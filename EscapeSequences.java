public class EscapeSequences {
    public static void main (String[] args) {
        System.out.println("Hello 'Aashna'..."); // it will print Hello 'Aashna' ...

        // but instead of single quotes you wanna use double quotes then use a backslash
        System.out.println("Hello \"Aashna\"..."); //this will print out Hello "Aashna"....

        // instead of printing double quotes and u wanna print out backslash then use:
        System.out.println("Hello \\Aashna\\"); // this will print "Hello \Aashna\"

        //to print a sentence but place a part of it on a new line
        System.out.println("Hello \nAashna"); //this will print aashna on the next line

        //to print out a sentence where the space is "Tab" then use:
        System.out.println("Hello \tAashna"); //this will print Hello   Aashna

        //to print out a sentence where backspace is supposed to be used:
        System.out.println("Hello\bAashna"); //this will print HellAashna ; because it takes a character back
    }
}
