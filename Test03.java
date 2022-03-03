package day3;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {  //i局部变量
			System.out.println(i);
		}
		
//		System.out.println(i);
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		int i=1;  //全局
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(i);
		
		i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("--------------");
		//跳过循环语句
		for(int j=1;j<=5;j++) {
			if(j==3) {
				break;
			}
			System.out.println(j);
		}   // 1 2 
		
		for(int j=1;j<=5;j++) {
			if(j==3) {
				continue;
			}
			System.out.println(j);
		}  //1 2 4 5 
		
//		for(int j=1;j<=5;j++) {
//			for(int z=1;z<=5;z++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
		
		
		

	}

}
