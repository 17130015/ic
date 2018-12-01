package Testing;
import junit.framework.TestCase;
import Program.FrameUI;
public class DoKbmValTest1 extends TestCase{
	
	public void testKbmVal() {
		FrameUI frame = new FrameUI("Страховой калькулятор", 820, 780); /*Создани экземпляра класса FrameUI*/
		assertEquals(Double.toString(frame.KbmVal(0)),"2.45"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(1)),"2.3"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(2)),"1.55"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(3)),"1.4"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(4)),"1.0"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(5)),"0.95"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(6)),"0.9"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(7)),"0.85"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(8)),"0.8"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(9)),"0.75"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(10)),"0.7"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(11)),"0.65"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(12)),"0.6"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(13)),"0.55"); /*Проверка соответствия ожидаемого и реального результата*/
		assertEquals(Double.toString(frame.KbmVal(14)),"0.5"); /*Проверка соответствия ожидаемого и реального результата*/
	}

}
