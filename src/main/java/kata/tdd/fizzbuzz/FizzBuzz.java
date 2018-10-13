package kata.tdd.fizzbuzz;

public class FizzBuzz {

  public String applyRule(int number) {
    return (number % 3 == 0 && number % 5 == 0) ? "FizzBuzz"
        : (number % 3 == 0 || String.valueOf(number).contains("3")) ? "Fizz"
        : (number % 5 == 0) ? "Buzz"
        : String.valueOf(number);
  }
}
