package kata.tdd.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @Before
  public void setUp() throws Exception {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void should_return_the_number() {
    String response = fizzBuzz.applyRule(2);
    assertEquals("2", response);
  }

  @Test
  public void should_return_Fizz_when_number_is_divisible_by_3() {
    String response = fizzBuzz.applyRule(3);
    assertEquals("Fizz", response);
  }
}
