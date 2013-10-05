import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void shouldAddTwoNumbers(){
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.add(2,3));
	}
}