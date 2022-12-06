/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	// Değişkenleri oluşturalım
		double boy;
		double kilo;
		double kitleEndeks;
		
		//Kullanıcıdan veri alalım
		
		Scanner inp= new Scanner(System.in);
		
		System.out.println("kilonuzu giriniz");
		kilo=inp.nextDouble();
		
		System.out.println("boyunuzu giriniz");
		boy=inp.nextDouble();
		kitleEndeks=(kilo/(boy*boy));
		
		System.out.print("Kitle Endeksi : " + kitleEndeks);
		
		

		
	}
}

