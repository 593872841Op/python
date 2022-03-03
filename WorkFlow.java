import java.util.*;

public class WorkFlow {
	public static void main(String[] args) throws Exception{
		// ==== 顺序结构 ====		
		int a1;
		int a2 = 2;
//		a3 = a1 + a2;	//错误：a3 需先定义后，才能使用
//		int a3 = a1 + a2;	//错误：a1 还需要赋值了，才能被使用
		a1 = 1;
		int a3 = a1 + a2;
//		
		//不带名称的{...}
		{
//			int a1 = 4;		//错误：a1 已在外层 {...} 已被定义了，里面（包括嵌套的{...}) 不能再重复定义
			int a4 = 4;
			System.out.println(a4);	
		}
		
		//试一试
		{
			int aa1 = 1011;
			int bb1 = 101;
			double cc1 = (double)aa1 / (double)bb1;
			String ss1 = "aa1 + bb1 = " + String.format("%.3f", cc1);
			System.out.println(ss1);
					
		}
		
		
		// ==== 分支结构 ====
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的3位数字彩票号：");
		int chou_jiang = input.nextInt();
		
		// 单分支
		System.out.println("==== 第一轮开奖结果（单分支） ====");
		if (chou_jiang % 5 == 0) {
			System.out.println("你获得了特等奖");
		}
		System.out.println("谢谢惠顾");
		
		// 双分支：二选一
		System.out.println("==== 第二轮开奖结果（双分支） ====");
		if (chou_jiang % 5 <= 3 ) {
			System.out.println("恭喜你，中奖了");
		}else {
			System.out.println("继续努力哦");
		}
		System.out.println("==== 第二轮开奖结果（双分支（三目运算）） ====");
		String s1 = (chou_jiang % 5 <= 3) ? "恭喜你，又中奖了" : "还要继续努力哦";
		System.out.println(s1);
		System.out.println("谢谢惠顾");
		
		// 多分支：多选一（if ... else if ... else）
		System.out.println("==== 第三轮开奖结果（多分支） ====");
		if (chou_jiang % 5 == 0) {
			System.out.println("你获得了特等奖");
		} else if (chou_jiang % 5 == 1) {
			System.out.println("你获得了一等奖");
		} else if (chou_jiang % 5 == 2) {
			System.out.println("你获得了二等奖");
		} else if (chou_jiang % 5 == 3) {
			System.out.println("你获得了三等奖");
		} else {
			System.out.println("继续努力哦");
		}
		System.out.println("谢谢惠顾");
		
		// 多分支：多选一（switch ... case X: ... default ...）
		System.out.println("==== 第三轮开奖结果（多分支（Switch）） ====");
		switch (chou_jiang % 5) {
		case 0:
			System.out.println("你获得了特等奖");
			break;
		case 1:
			System.out.println("你获得了一等奖");
			break;
		case 2:
			System.out.println("你获得了二等奖");
			break;
		case 3:
			System.out.println("你获得了三等奖");
			break;
		default:
			System.out.println("继续努力哦");
		}
		System.out.println("谢谢惠顾");
		

		System.out.println("==== 第三轮开奖结果（多分支（Switch）-- 用法二） ====");
		switch (chou_jiang % 5) {
		case 0:
			System.out.println("特等奖耶，你太牛了，我们会加送您一箱牛奶");
			break;			
		case 1:
		case 2:
		case 3:
			System.out.println("好运气，我们会加送您一桶食用油");
			break;
		default:
			System.out.println("继续努力哦");
		}
		System.out.println("谢谢惠顾");
		
		
		
		// ==== 循环结构 ====
		System.out.println("==== for 循环 ====");
		for (int i = 1; i <= 5; i = i+1) {
			System.out.print(String.valueOf(i) + " ");
		}
		System.out.println("");
//		System.out.println(i);	// 循环体内定义的 i，出来后即被清除，无法使用（需重新定义）
		
		System.out.println("==== while 循环 ====");
		int i1 = 1;
		while (i1 <= 5) {
			System.out.print(String.valueOf(i1) + " ");
			i1 ++;
		}
		System.out.println("");
		
		System.out.println("==== do while 循环 ====");
		i1 = 1;
		do {
			System.out.print(String.valueOf(i1) + " ");
			i1 ++;
		} while  (i1 <= 5);
		System.out.println("");
		
		
		
		// ==== * ==== 大作战
		for (int i = 1; i <= 9 ; i += 1) {
			// 打印第 i 行
			System.out.print("第" + i + "行：");
			for (int j = 1; j <= i; j++) {
				// 打印第 j 列（共 i 个 *）
				System.out.print("*");
			}
			System.out.println("");
		}		
		
		// ==== 加法99表 ==== 
		String ss1, ss2, sum1;
		for (int i = 1; i <= 9 ; i += 1) {
			// 打印第 i 行
			for (int j = 1; j <= i; j++) {
				// 打印第 j 列：i+j=sum 
				ss1 = String.valueOf(i);
				ss2 = String.valueOf(j);
				sum1 = String.valueOf(i+j);		
				System.out.print(ss1 + "+" + ss2 + "=" + sum1 + " ");
			}
			System.out.println("");
		}		
		
	}
}