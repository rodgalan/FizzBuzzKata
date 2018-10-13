package kata.tdd.fizzbuzz;

public class FizzBuzz {

  public String applyRule(int number) {
    return (number % 3 == 0) ? "Fizz" : (number % 5 == 0) ? "Buzz" : String.valueOf(number);
  }
}
