package hw;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/03
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw04_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入階層數:");
		int v1 = scn.nextInt();
		int sum = 1;
		int i = 0 ;
		while(i<v1){
			i++;
			sum = sum*i;
			
		}
		System.out.println(sum);

	}

}
