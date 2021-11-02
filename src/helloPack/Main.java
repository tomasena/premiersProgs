package helloPack;

import java.util.Scanner;

/* Solution authentification github : 
 * https://stackoverflow.com/questions/68790276/pushing-from-eclipse-to-my-github-repository-via-https-stopped-working-git-rec
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenus ");

		Scanner clavier = new Scanner(System.in);
		System.out.print("Capacité du camion ? ");
		int cap = clavier.nextInt();
		System.out.print("Nombre de cartons ? ");
		int nc = clavier.nextInt();
		Demenagement dem = new Demenagement("Entreprisse bretonne", cap); // on crée une "instance"
		dem.auTravail(nc); // 34 cartons à  demenager

	}

}
