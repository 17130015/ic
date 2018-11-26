package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Program.FrameUI;

public class DoCalculationTestThree1 {

	@Test
	public void testCalculation() {
		FrameUI frame = new FrameUI("��������� �����������", 820, 780); /*������� ���������� ������ FrameUI*/
		assertEquals("22714.0" ,frame.Calculation(2965.0, 2.0, 1.4, 1.8 ,1.0, 1.6, 0.95,1.0,1.0));  /*�������� ������������ ���������� � ��������� ����������*/
	}

}
