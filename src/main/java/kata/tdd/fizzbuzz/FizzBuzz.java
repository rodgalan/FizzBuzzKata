package kata.tdd.fizzbuzz;

public class FizzBuzz {

  public String applyRule(int number) {
    return (isFizz(number) && isBuzz(number)) ? "FizzBuzz"
        : (isFizz(number)) ? "Fizz"
        : (isBuzz(number)) ? "Buzz"
        : String.valueOf(number);
  }

  private boolean isBuzz(int number) {
    return number % 5 == 0 || String.valueOf(number).contains("5");
  }

  private boolean isFizz(int number) {
    return number % 3 == 0 || String.valueOf(number).contains("3");
  }
}
