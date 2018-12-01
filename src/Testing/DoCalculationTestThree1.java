package Testing;
import junit.framework.TestCase;
import Program.FrameUI;
public class DoCalculationTestThree1 extends TestCase{
	
	public void testCalculation() {
	FrameUI frame = new FrameUI("Страховой калькулятор", 820, 780); /*Создани экземпляра класса FrameUI*/
		TestCase.assertEquals("22714.0" ,frame.Calculation(2965.0, 2.0, 1.4, 1.8 ,1.0, 1.6, 0.95,1.0,1.0));  /*Проверка соответствия ожидаемого и реального результата*/
}}
