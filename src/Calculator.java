import java.util.Scanner;

public class Calculator{
	public static void main(String args[]){
		
		System.out.println("Witaj widzisz przed sob� najnowszy kalkulator :)");
		Scanner odczyt = new Scanner(System.in);
		int a;
		int b;
		int c=0;
		char decyzja;
		char znak;
		do{
			System.out.println("1. Podaj pierwsz� liczb�: ");
			
			a = odczyt.nextInt();
			
			System.out.println("1. Podaj drug� liczb�: ");
			
			b = odczyt.nextInt();
			
			System.out.println("2. Wybierz dzia�anie: ");
			System.out.println("Dodawnie  +" + '\n' + "Odejmowanie  -" + '\n' + "Mno�enie  *" + '\n' + "Dzielenie  /");
			
			znak = odczyt.next().charAt(0);
			
			switch(znak){
				case '+':
					c=a+b;
					break;
				case '-':	
					c=a-b;
					break;
				case '*':
					c=a*b;
					break;
				case '/':
					c=a/b;
					break;		
			}
			
			System.out.println("4. Wynik: " + c + '\n' + "Kontynuowa� liczenie?" + '\n' + "Tak - t / Nie - n");
			
			decyzja = odczyt.next().charAt(0);
			
			switch(decyzja){
				case 't':
					decyzja=1;
					break;
				case 'n':	
					decyzja=2;
					break;		
			}
		}while(decyzja!=2);
		
		System.out.println("Koniec liczenia");
	}
}