public class Typeconversion {
    public static void main(String[] args) {
        
        //type conversion refers to storing one data variable into another depending on size
        // Size list: double > float > long > int > short > byte

        float myFloat = 5; //adding d next to it wont allow it to print as double is bigger; however, adding 
        //L to it will print as long is smaller
        System.out.println(myFloat);
        //This is called implicit conversion
        //MORE EXAMPLES:

        long big = 45; //storing int in long is ok
        float dec = 3; //storing int in float is ok
        double d =3.4f; //storing float in double is ok


        //EXPLICIT CONVERSION
        //Sometimes you need to signal to the complier that you want the value to be converted
        //variable vartiabletype = (whatyouwanttoconvertitto) thingtobeconverted ;
        int myInt = (int)5.45f;
        System.out.println(myInt);
        //when printed the value outputted will be "5"

        //More examples:
        float eDec = (float)3.4; // this will print 3.4
        long eBig = (long) 3.4; // this will print 3
        int eInt = (int)3.4; //this will print 3
    }
}


