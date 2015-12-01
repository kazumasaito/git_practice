/**
 * 1から15までの数字を表示し、3の倍数の時に"Fizz"、5の倍数の時に"Buzz"、
 * 3の倍数でも5の倍数でもある時に"FizzBuzz"と表示するプログラム（FizzBuzz問題）
 * 
 * @since 2015/12/01
 * @author KazumaSaito
 */

public class FizzBuzz { 
  public static void main(String[] args){
	//変数を用意
	String fizz = "Fizz";
	String buzz = "Buzz";

	for(int i=1 ; i<=15 ; i++){
		if(i%3==0 && i%5==0){
			System.out.println(i + " : " + fizz + buzz);
		}
		else if(i%3==0){
			System.out.println(i + " : " + fizz);
		}
		else if(i%5==0){
			System.out.println(i + " : " + buzz);
		}
	}
  }
}