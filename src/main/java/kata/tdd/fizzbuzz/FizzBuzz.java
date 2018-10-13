package kata.tdd.fizzbuzz;

public class FizzBuzz {

  public String applyRule(int number) {
    return (number % 3 == 0) ? "Fizz" : String.valueOf(number);
  }
}
