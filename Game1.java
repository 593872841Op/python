package day3;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//猜数字游戏
		
		//通过随机数生成3位数答案
		Random r1 = new Random();
		int a = 0; 
		while(true) {
			a=r1.nextInt(1000);
			if(a>=100) {
				break;
			}
		}
//		System.out.println(a);
		
		//简陋UI界面
		System.out.println("---------");
		System.out.println("欢迎使用猜数字游戏，可以猜3位整数，按0退出");
		System.out.println("---------");
		
		//游戏程序主体
		Scanner sc1 = new Scanner(System.in);
		int count=10; //猜测次数
		
		for(int i=1;i<=count;i++) {
			System.out.print("请输入你猜测的数字：");
			int a2 = sc1.nextInt();
			if(a2==0) {
				System.out.println("不玩了，再见！");
				break;
			}
			else if(a2==a) {
				System.out.println("恭喜你，不错！");
				break;  //猜对了，不需要继续再猜
			}
			else {
				System.out.println("猜错了，不太行");
			}
		}
		
		


	}

}
