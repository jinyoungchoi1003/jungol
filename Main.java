package jungol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int sum = 0, cnt = 0;
//		float avg = 0;
//
//		while (true) {
//			int input = sc.nextInt();
//			cnt++;
//			sum += input;
//			if (input >= 100)
//				break;
//		}
//
//		avg = (float) sum / (float) cnt;
//		System.out.println(sum);
//		System.out.printf("%.1f", avg);
//		sc.close();

//		int i = 0; 
//		int[] ar = new int[100];
//		do {
//			ar[i] = sc.nextInt();		
//		} while (ar[i++] < 100);
//		sc.close();
//		
//		int sum = 0;
//		for(int j = 0; j < i; j++) {
//			sum += ar[j];
//		}
//		
//		System.out.println(sum);
//		System.out.printf("%.1f\n",(double)sum / i);

//		while (true) {
//			int input = sc.nextInt();
//			if (input < 0) {
//				break;
//			} else if (input % 3 == 0) {
//				System.out.println(input / 3);
//			}
//		}

//		while (true) {
//			System.out.println("1. Korea\n2. USA\n3. Japan\n4. China");
//			System.out.print("number? ");
//
//			int input = sc.nextInt();
//
//			if (input == 1) {
//				System.out.println("Seoul\n");
//			} else if (input == 2) {
//				System.out.println("Washington\n");
//			} else if (input == 3) {
//				System.out.println("Tokyo\n");
//			} else if (input == 4) {
//				System.out.println("Beijing\n");
//			} else {
//				System.out.println("none\n");
//				break;
//			}
//
//		}

		int[] arr = new int[10];
		int sum = 0, sum2 = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i % 2 == 1) {
				sum += arr[i];
			} else {
				sum2 += arr[i];
				avg = (double) sum2 / (arr.length / 2);
			}

		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
		sc.close();

	}

}
