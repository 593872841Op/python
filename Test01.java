package day3;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=5;
		System.out.println(++i + i++ + ++i + i++);
		//打印内容：6+6+8+8
		//i值：6   7   8  9
		System.out.println(i);  //9
		
		byte by1=5;
		byte by5=1;
		by1+=1;
//		by1=by1+by5;  //int
		
		short sh1=5;
		short sh2=10;
//		sh1+sh2
		
		byte by2=127;
		byte by3=1;
		System.out.println(by2+by3);  //int
		
		short s1=10;
		int i1=20;
		s1=(short)i1;  //强制转型
		i1=s1;  //自动转型
		
		Scanner sc1 = new Scanner(System.in);
		String str1="abc";
		String str2=sc1.next();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));  //比较字符串值是否相等
		
		String ss1="";
		

	}

}
