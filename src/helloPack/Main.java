package helloPack;

/* Solution authentification github : 
 * https://mycyberuniverse.com/how-fix-fatal-authentication-failed-for-https-github-com.html
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenus ");
		Demenagement dem = new Demenagement("Entreprisse bretonne", 9); // on cr�e une "instance"
		dem.auTravail(34); // 34 cartons � demenager

	}

}
