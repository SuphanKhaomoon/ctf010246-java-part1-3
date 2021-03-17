package CTF01.Java.part1.No3;

public class Operator
{

	public static void main(String[] args)
	{
//		1. ประกาศ int i ให้มีค่า = 20
//			a. เรียก i++ 5 ครั้ง แล้ว print ค่า i ออกมา
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("ค่า i++ 5 ครั้ง มีค่าเท่ากับ " + i);
		
//			b. เรียก --i  5 ครั้ง  แล้ว print ค่า i ออกมา
		i = 20;
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println("ค่า --i 5 ครั้งมีค่าเท่ากับ " + i);
		
//		2. ทดลองใช้ && กับข้อมูลประเภท float
		float value_1 = 1.0f;
		float value_2 = 2.0f;
		if ((value_1 == 1.0) && (value_2 == 2.0))
		{
			System.out.println("value_1 is 1.0 AND value_2 is 2.0");
		}
		
//		3. ทดลองใช้ || กับข้อมูลประเภท char
		char valueChar1 = 'a';
		char valueChar2 = 'b';
		if ((valueChar1 == 'a') || valueChar2 == 'b') 
		{
			System.out.println("valueChar is a OR b");
		}
	}

}
