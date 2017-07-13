import java.util.Scanner;
public class Zadata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos = new Scanner (System.in);
System.out.println("Unesite 3 cijela broja");
int broj1 = unos.nextInt();
int broj2 = unos.nextInt();
int broj3 = unos.nextInt();

double prosjek = ((broj1 + broj2 + broj3) / 3);

System.out.println("Prosjek brojeva koje ste unijeli je:" + prosjek);



	}

}
