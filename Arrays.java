public class Arrays {
    public static void main(String[] args) {
        int[] myArr = new int[5]; //initialsing
        
        //Array redudance set
        myArr[0] = 98;
        myArr[1] = 80;
        myArr[2] = 21;
        myArr[3] = 30;
        myArr[4] = 18;
        //Another way to write this is
        //int[] myArr = {98,80,21,30,18};
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
        
        //Loop way to print everything

        int index =0;
        while (index < 5) {
            System.out.println(myArr[index]);
            index++;
        }
    }
}
