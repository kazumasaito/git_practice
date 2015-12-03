import java.util.Scanner;

/**
 *入力した数値の平方根を返すプログラム
 *
 *@since 2015-12-03
 *@author KazumaSaito
 */

public class SquareRoot {

	private Scanner scanner;

	private SquareRoot() {
		this.scanner = new Scanner(System.in);
	}

	private void calculation() {
		System.out.printf("数字を入力してください。");
		double number = scanner.nextDouble();
		double answer = number;
		for(int i=0 ; i<100 ; i++){
			answer = (answer + number / answer) / 2;
		}
		System.out.printf("%.15f",answer);
	}

	public static void main(String[] args){
		new SquareRoot().calculation();
	}
}