package com.atguigu.webrestfulcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebRestfulCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebRestfulCrudApplication.class, args);
		//yangHuiTriangle();
	}

	private static void yangHuiTriangle() {
		/*
		何谓杨辉三角：
		1. 每行元素个数与行数一致
		2. 每行头元素和尾元素的值为1
		3. 从第三行开始(不包括头和为元素)，每行的元素的值等于上一行所在元素的值 + 上一行相邻左边元素的值，即：
		arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1]
		 */
		// 输出10行杨辉三角

		// 1.初始化一个二维数组，用来表示杨辉三角
		int[][] yangHui = new int[10][];

		// 2.为杨辉三角赋值
		for (int i = 0; i < yangHui.length; i++) {
			// 2.1 初始化内层数组的长度
			yangHui[i] = new int[i + 1];
			// 2.2 先给头元素和尾元素赋值
			yangHui[i][0] = yangHui[i][i] = 1;
			// 2.3 为每行其他元素赋值
			for (int j = 1; j < yangHui[i].length - 1; j++) {
				yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
			}
		}

		// 3.格式化输出
		for (int[] row : yangHui) {
			for (int item : row) {
				System.out.print(item + "\t");
			}
			System.out.println();
		}
	}

}
