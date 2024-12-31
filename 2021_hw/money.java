package abcd;
import java.util.Scanner;
public class money {

	public static void main(String[] args) {
		float l=27.3f;
		System.out.println("這是現在的油價: "+l+"元/公升");
		//前兩行定義現在油價及顯示出來
		System.out.println("請輸入要加油的公升數");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//前兩行將scan定義為物件，num利用scan的方法，讓客戶輸入公升數
		System.out.println("價錢為: "+(int)(num*25.7)+"元(小數點無條件捨去)");
		//顯示最終的價錢，價錢不能為小數，要轉成int
	}

}
