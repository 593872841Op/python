package day3;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组
		//创建
		int[] a1= {};
		int[] a2= {123,456,-789,0};
		
		double[] a3= {1.34,10,'今'};
		
		//byte
		
		//short
		
		//long
		
		//float
		float[] f1= {12.34f,56}; 
		
		//boolean
		boolean[] bo1= {true,false,true};
		
		//String
		String[] st1= {"123","abc"};
		System.out.println(st1.length);  //数组的长度
		
//		//输出整个数组的内容
//		System.out.println(st1);
		System.out.println(Arrays.toString(st1));
		
		
		//创建一个长度为5的数组，自动赋初始值
		int[] i1=new int[5];
		System.out.println(i1.length);
		System.out.println(Arrays.toString(i1));
		
		boolean[] bo2=new boolean[4];
		System.out.println(Arrays.toString(bo2));
		
		
		//访问数组元素
		int[] a5= {11,33,55,77,99,101,111}; 
		System.out.println(a5[4]);
		System.out.println(a5[0]);
		System.out.println(a5[2]);
		//修改
		a5[2]=0;
		System.out.println(Arrays.toString(a5));
		
		//使用循环访问数组元素
//		for(int aa=1;aa<=5;aa++) {
//			System.out.println(a5[aa]);
//		}  //数组索引越界
		for(int aa=0;aa<a5.length;aa++) {
			System.out.println(a5[aa]);
		}
		
		//二维数组
		int[][] arr2= {{1,2,3},{4,5}};
		System.out.println(arr2[1][0]);
		
		int[][] arr3=new int[2][3];
		//{{1,2,3},{4,5,6}}
		
		//答案：567
		//输入：123

	}

}
