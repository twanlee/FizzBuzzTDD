import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTDDTest {

    @org.junit.jupiter.api.Test
    void fizz() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTDD.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void buzz(){
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTDD.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void fizzBuzz(){
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTDD.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void other(){
        int number = 11;
        String expected = String.valueOf(number);
        String result = FizzBuzzTDD.fizzBuzz(number).toString();
        assertEquals(expected,result);
    }
}