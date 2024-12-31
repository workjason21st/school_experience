package credit;
import java.util.Scanner;
public class credit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//建立scanner
		System.out.print("請輸入信用額度：");
		int credit = scan.nextInt();	//取得使用者輸入的值放入credit;
		System.out.print("繳款是否正常(1:正常，0:不正常)：");	
		long x = scan.nextLong();	//取得使用者輸入的值放入x;
		
		if(x==0) {	//判斷x是否為0(繳款不正常)
			System.out.print("\n未正常繳款，無法預借現金");
		}
		if(x==1) {	//判斷x是否為1(繳款正常)
			System.out.print("請輸入持卡年份：");
			float year = scan.nextFloat();	//取得使用者輸入的值放入year;
			if(year<0.5) {	//判斷持卡年份是否低於半年
				System.out.print("\n持卡未滿半年，無法預借現金");
			}
			else if(year>=1) {	//判斷持卡年份是否滿1年
				System.out.print("預借現金額度："+credit);
			}
			else {	//若都不是，則持卡年份為1年~半年
				System.out.print("預借現金額度："+credit/2);
			}
		}
	}

}
