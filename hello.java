import java.util.*

public class hello{
	public static void main(String[] args){
		// 输出
		System.out.println("Hello, how are you");
		
		//数字类型
		byte b1 = -128; // -2^7 ~ (2^7-1)
		byte b2 = 127;
		
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		short s1 = -10000; // -2^15) ~ (2^15-1)
		short s2 = 10000;
		
		int i1 = 100000;  // 2^31 ...
		
		long a1 = 100000000L;  // 2^63 ...
		
		
		float f1 = 0.1f;
		float f2 = 1.1f;
		
		double d1 = 0.1;
		double d2 = 1.1D;
		
		System.out.println(Double.SIZE);
		System.out.println(Double.MAX_VALUE);
		
		//布尔型
		boolean bo1 = true;
		boolean bo2 = false;
		
		//字符型
		char ch1='a';
		System.out.println(Character.SIZE);
		System.out.println(ch1);
		
		// 类型转换
		i1 = (int) b1;
		System.out.print(i1);

		i1 = (int) ch1;
		System.out.print(i1);
		
		//ASCII 码
		ch1 = (char) b2;
		System.out.print(i1);
		
		Scanner input = new Scanner(System.in)
		System.out.print("请输入：")
		i1 = input.nextInt()
		System.out.println(i1)
		
		input.close()

		int int_1
		int int_2 = int_1++;	//int_2=int_1;  int_1++

		int_2 = ++int_1;		//++int_1; int_2=int_1

		
	}
}