package day3;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char
		char ch1=65535;
		ch1='今';
		ch1=20170;
		char ch2=22825;
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1+ch2);
		String s1="天";
		System.out.println(ch1+s1);
		System.out.println(ch1+ch2+s1);
		System.out.println(ch1+s1+ch2);
		
//		ch1='';
		s1="";
		
		//短路
		int a=5;
//		System.out.println(a<4 & a++>5);
		System.out.println(a<4 && a++>5);
		System.out.println(a);
		
		System.out.println(!(a>5));
		
		
		//循环
		int i1=1;
		while(i1<=5) {
			System.out.println(i1);
			i1++;
		}
		
		System.out.println("-------------");
		
		int i2=6;
		do{
			System.out.println(i2);
			i2++;
		}while(i2<=5);
		
		System.out.println(i2);
		

	}

}
