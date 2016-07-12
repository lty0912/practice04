package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요: (종료:0)  ");

			int inputNumber = scanner.nextInt();

			if (inputNumber == 0) {				
				break;
			}

			/* 여기에 구현 코드를 작성 합니다. */
			if (inputNumber % 2 == 0) { // 짝수라면
				sum(inputNumber, 0);
			} else {
				sum(inputNumber, 1); // 홀수라면
			}

		}
		
		System.out.println("종료합니다.");
		scanner.close();

	}

	public static void sum(int inputNumber, int initialNumber) {
		int sum = 0;
		while (initialNumber <= inputNumber) {
			sum += initialNumber;
			initialNumber += 2;
		}
		System.out.println("결과 값 : " + sum);
		System.out.println();
	}

}
