public class FizzBuzz {
    public static String fizzBuzz(int number){
        int i = number % 3;
        boolean isFizz = i == 0;
        boolean isBuzz = number % 5 == 0;
        if(isFizz && isBuzz)
            return "FizzBuzz";
        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";
        return number + "";
    }
}
