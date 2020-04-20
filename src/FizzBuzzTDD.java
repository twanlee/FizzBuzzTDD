public class FizzBuzzTDD {
    public static String fizzBuzz( int number){
        String result;
        boolean isOddFive = number % 5 == 0;
        boolean isOddThree = number % 3 == 0;
        boolean isOddAll = isOddThree && isOddFive;
        if(isOddAll){
             result = "FizzBuzz";
        }else if(isOddFive){
             result = "Buzz";
        }else if(isOddThree){
            result = "Fizz";
        }else {
            return String.valueOf(number);
        }
        return result;
    }
}
