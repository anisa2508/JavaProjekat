import java.util.Scanner;
public class Sekunde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kreiraj noci scaner 
Scanner unos = new Scanner (System.in);
System.out.print("Unesite broj sekundi: ");
int sekundeKorisnik = unos.nextInt();

//izracunaj broj minuta i sekundi
int minute = sekundeKorisnik / 60;
int sekunde = sekundeKorisnik % 60;

System.out.println(sekundeKorisnik + " sekundi je: " + minute + "minuta i "  + sekunde + "sekundi ");


	}

}
