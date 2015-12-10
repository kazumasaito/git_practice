import java.text.DecimalFormat;

/**
 * 九九の表を表示するアルゴリズム
 * @since 2015.12.10
 * @author K.Saito
 */

public class MultiplicationTable {
    public static void main(String[] args) {
    	//配列を用意
        int[][] multipl = new int[9][9];

        //ヘッダ出力
        System.out.println("+-------- かけ算九九表 ---------+");
        System.out.println("|     1  2  3  4  5  6  7  8  9 |");
        System.out.println("|  +----------------------------|");

        //データ代入
        //for文のネスト
        for(int i=0;i<multipl.length;i++) {
            for(int j=0;j<multipl[i].length;j++) {
                multipl[i][j] = (i+1)*(j+1);
            }
        }

        //表示
        //文字を2ケタに合わせてくれる(インスタンス生成時に引数で指定)
        DecimalFormat df = new DecimalFormat("00");

        for(int i=0;i<multipl.length;i++) {

            System.out.print("| "+ (i+1) +"|");

            //データ出力
            for(int j=0;j<multipl[i].length;j++) {
                System.out.print(" "+df.format(multipl[i][j]));
            }

            System.out.println(" |");
        }

        //フッタ出力
        System.out.println("+--+----------------------------+");
    }
}