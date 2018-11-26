package Testing;

import static org.junit.Assert.*;


import org.junit.Test;

import Program.FrameUI;

public class DoKbmValTest1 {

	@Test
	public void testKbmVal() {
		FrameUI frame = new FrameUI("��������� �����������", 820, 780); /*������� ���������� ������ FrameUI*/
		assertEquals(Double.toString(frame.KbmVal(0)),"2.45"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(1)),"2.3"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(2)),"1.55"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(3)),"1.4"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(4)),"1.0"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(5)),"0.95"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(6)),"0.9"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(7)),"0.85"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(8)),"0.8"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(9)),"0.75"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(10)),"0.7"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(11)),"0.65"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(12)),"0.6"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(13)),"0.55"); /*�������� ������������ ���������� � ��������� ����������*/
		assertEquals(Double.toString(frame.KbmVal(14)),"0.5"); /*�������� ������������ ���������� � ��������� ����������*/
	}

}
