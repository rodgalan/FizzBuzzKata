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

  @Test
  public void should_return_Fizz_when_number_has_a_3_on_it() {
    String response = fizzBuzz.applyRule(31);
    assertEquals("Fizz", response);
  }

  @Test
  public void should_return_Buzz_when_number_is_divisible_by_5() {
    String response = fizzBuzz.applyRule(5);
    assertEquals("Buzz", response);
  }

  @Test
  public void should_return_Buzz_when_number_has_a_5_on_it() {
    String response = fizzBuzz.applyRule(52);
    assertEquals("Buzz", response);
  }


  @Test
  public void should_return_FizzBuzz_when_number_is_divisible_by_5_and_3() {
    String response = fizzBuzz.applyRule(15);
    assertEquals("FizzBuzz", response);
  }

  @Test
  public void should_return_FizzBuzz_when_number_is_divisible_by_5_and_has_a_3_on_it() {
    String response = fizzBuzz.applyRule(35);
    assertEquals("FizzBuzz", response);
  }
}
