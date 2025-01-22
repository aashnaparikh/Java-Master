public class ifelse {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Bob";
        if (isMale) {
            System.out.println("Mr." + name);
        } else {
            System.out.println("Ms." + name);
        }

        //you can also write this in a single statement
        //if (isMale) System.out.println("Mr." + name);
        // else System.out.println("Ms." + name);



        //NESTED IF LOOPS

        boolean isSeniorCitezen = true;
        boolean isAdult = false;
        if (isSeniorCitezen){
            System.out.println("Hello Senior Citezen" );
        } else if (isAdult) {
                System.out.println("Hello Adult");
            } else {
                System.out.println("Hello Child");
            }
        }
    }

