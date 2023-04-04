import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(     testAge(21,-10));
        System.out.println(     testAge(19,0));
        System.out.println(     testAge(50,25));
        System.out.println(     testAge(65,0));
        System.out.println(     testAge(70,-100));
        System.out.println(testAge(generateRandomAge(), -10));
    }
    public static String testAge(int age, int temperature) {
        if ((age >= 20 || age == 45) && (temperature >= -20 || temperature == 30)){
           return goToWalk();

        } else if (age < 20 && temperature >= 0 || temperature == 28 ) {
            return goToWalk();

        } else if (age > 45 && temperature >= -10 || temperature == 25 ) {
         return goToWalk();
        }
        else{
            return stayAtHome();
        }


    }
    public static String goToWalk(){
        return "Можно идти гулять";
    }
    public static String stayAtHome(){
        return "Остовайся дома";
    }
    public static int generateRandomAge(){
        int minAge, maxAge;
        minAge = 0;
        maxAge = 100;
        Random random = new Random();
        return random.nextInt(maxAge - minAge + 1 ) + minAge;
    }

}