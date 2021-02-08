public class FizzBuzz {
    public String FizzBuzz(int number) {
        String log1 = null;
        if ((number % 3 == 0) && (number % 5 == 0)){
            log1 = "FizzBuzz";
        }
        else if (number % 3 == 0){
            log1 = "Fizz";
        }
        else if (number % 5 == 0){
            log1 = "Buzz";
        }
        else {
            log1 = Integer.toString(number);
        }
        return log1;
    }
}