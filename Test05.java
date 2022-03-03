package day3;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//变量值的交换
		int a=50;
		int b=70;
//		a=20;
//		b=10;
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println(a);
		System.out.println(b);
		
		//数组中的元素值的交换
		int[] a1= {111,345,777};
		tmp=a1[0];
		a1[0]=a1[1];
		a1[1]=tmp;
		
		System.out.println(Arrays.toString(a1));
		
		//冒泡排序
		int[] aa1= {1,2,234213,5643,6543,0,-4532,564};
		
//		aa1= {5643,6543,0,-4532,564,234213};
		//比较
//		if(aa1[0]>aa1[1]) {
//			int c=aa1[0];
//			aa1[0]=aa1[1];
//			aa1[1]=c;
//		}
		
		//5次比较
//		for(int i=0;i<=4;i++) {
//			if(aa1[i]>aa1[i+1]) {
//				int c=aa1[i];
//				aa1[i]=aa1[i+1];
//				aa1[i+1]=c;
//			}
//		}
		
		//升序
		for(int j=1;j<=aa1.length-1;j++) {
			for(int i=0;i<=aa1.length-2;i++) {
				if(aa1[i]>aa1[i+1]) {
					int c=aa1[i];
					aa1[i]=aa1[i+1];
					aa1[i+1]=c;
				}
			}
		}
		
		System.out.println(Arrays.toString(aa1));
		
		//索引:
//		aa1[0]>aa1[1]
//		aa1[1]>aa1[2]
//		aa1[2]>aa1[3]
//		aa1[3]>aa1[4]
//		aa1[4]>aa1[5]
				
		
//		aa1= {-4532,0,564,5643,6543,234213};

	}

}
