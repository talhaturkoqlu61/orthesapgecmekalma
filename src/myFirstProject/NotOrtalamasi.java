package myFirstProject;
import java.util.Scanner;

public class NotOrtalamasi {
	public static void main(String []args) {
		// Dersleri oluştur.
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		Scanner input= new Scanner(System.in);
		
		
		System.out.print("Lütfen matematik notunuzu giriniz:");
		mat=input.nextInt();
		
		System.out.print("Lütfen fizik notunuzu giriniz:");
		fizik=input.nextInt();
		
		System.out.print("Lütfen kimya notunuzu giriniz:");
		kimya=input.nextInt();
		
		System.out.print("Lütfen Türkçe notunuzu giriniz:");
		turkce=input.nextInt();
		
		System.out.print("Lütfen Tarih notunuzu giriniz:");
		tarih=input.nextInt();
		
		System.out.print("Lütfen müzik notunuzu giriniz:");
		muzik =input.nextInt();
		
		Double genelOrt=(mat+fizik+kimya+turkce+tarih+muzik)/6.0;
		System.out.println(genelOrt);
		
        String passingSituation=genelOrt>=60?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(passingSituation);
        
        
		
		
		
		
		
	}

}
