import java.util.Scanner;





public class Test {
	private String nom;
	private String statut;
	public static int cpt = 0;
	public Test(String nom, String statut) {
		System.out.println("ok");
		this.nom = nom;
		this.statut = statut;
		cpt++;
		
//		String nom = "premier test";
//		String statut = "inconnu";
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getStatut() {
		return this.statut;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	} 
	
	/**
	 * EXCEPTIONS
	 */
	public int div(int a, int b) {
		int c = a/b;
		return c;
	}
	
	/**
	 * EXCEPTIONS PERSONNALISEES
	 */
	public void define_exception(int a) throws TestException{
		if(a == 2) {
			throw new TestException();
		}
		else {
			System.out.println("that's ok");
		}
	}
	
//	public int fonction_sensible(int a, int b) throws TestException{
//		try{
//			int c = a / b;
//			return c;
//		}
//			catch (TestException e){
//				e.getMessage();
//				return 0;
//			}
//		
//	}
	
	
	/**
	 * TRAVAIL SUR LE POLYMORPHISME
	 */
	public String toString() {
		return "attributes are : " + this.getNom() + " " + this.getStatut();
	}
	
	/**
	 * SURCHARGE DE METHODE : 
	 * on garde même type de traitement
	 * on change type des paramètres par ex
	 */
//	public static void relou(String[] tabstr) {
//		for (String s : tabstr) {
//			System.out.println(s);
//		}
//	}
//	public static void relou(int[] tabint) {
//		for (int i : tabint) {
//			System.out.println(i);
//		}
//	}
//	TEST
//	String[] tabstr = {"oui", "non"};
//	int[] tabint = {1, 2};
//	relou(tabstr);
//	System.out.println("-----");
//	relou(tabint);
	
	
	/**
	 * CREER OWN METHOD
	 */
//	public static double test_math(double[] aa) {
//		//System.out.println(a);
//		double d = 0.0;
//		for(double a : aa) {
//			d = d + a + Math.random();
//		}
//		System.out.println(d);
//		return d;
////		TEST :
////			double[] b = {1.0, 1.0};
////		test_math(b);
//	}
	
	public static void main(String[] args) {
		Test t = new Test("premier test", "inconnu");
//		System.out.println(t.getNom());
//		System.out.println(t.getStatut());
//		System.out.println("cpt : " + t.cpt);
//		t.setNom("jojo le test");
//		t.setStatut("en cours");
//		System.out.println(t.getNom());
//		System.out.println(t.getStatut());
//		System.out.println("cpt : " + t.cpt);
//		Test f = new Test("r", "f");
//		System.out.println("cpt f : " + f.cpt);
		try {
		System.out.println(t.div(2, 0));
		}
		catch(Exception e) {
			System.out.println("pas ok");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
		try {
			t.define_exception(0);
		}
		catch(TestException | ArithmeticException e) {
			e.getMessage();
			
		}
		finally {
			System.out.println("ouais");
		}
		
		/**
		 * METHODES CLASSE INT
		 */
//		double ranlo = Math.random();
//		System.out.println(ranlo);
//		double absolu = Math.abs(-234);
//		System.out.println(absolu);
		
		/**
		 * METHODES DE CLASSE STR
		 */
//		String str1 = "OK BONJOUR";
//		String str1b = "ouais nan";
//		String str2 = new String();
//		String str2b = new String();
//		str2 = str1.toLowerCase();
//		str2b = str1b.toUpperCase();
//		int len = str1.length();
//		System.out.println(str2);
//		System.out.println(str2b);
//		System.out.println(len);
//		System.out.println(str1.equals(str2));
//		System.out.println(!str1.equals(str2));
//		System.out.println(str1b.charAt(1));
//		System.out.println(str1b.indexOf("u"));
//		System.out.println(str1b.indexOf("w"));
//		System.out.println(str1b.lastIndexOf("a"));
//		System.out.println(str1.substring(0, 4));
		
		
		
		
		
		/**
		 * PARCOURS DANS TABLEAU
		 */
		//déclaration tableau avec accolades
		//length quand on parle de tableau
//		Scanner sc = new Scanner(System.in);
//		System.out.println("le nombre ");
//		
//		int[][] tableau = {{1, 2, 3}, {4, 5, 6}};
//		//System.out.println(tableau[1][2]);
//		//for(int i = 0; i < tableau.length; i++) {
//		for(int[] i : tableau) {
//			//System.out.println(tableau[i]);
//			//for(int j = 0; j < tableau[i].length; j++) {
//			for(int j : i) {
//				System.out.println("tableau i j est " + j);
////				if(tableau[i][j] == sc.nextInt()) {
////					System.out.println("nombre est : " + tableau[i][j]);
////				}
////				else {
////					System.out.println("nothing to say");
////				}
//		}
//		}
		
		/**
		 * CONDITIONS
		 */
		//if/else // if/else if/else
		
		/**
		 * SCANNER
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("votre mot ?");
//		String str = sc.nextLine();
//		System.out.println("mot saisi : " + str);
//		char c = str.charAt(0);
//		System.out.println(c);
		
		/**
		 * CONVERSIONS DE TYPES EN JAVA
		 */
//		int i = 12;
//		String j = new String();
//		//besoin d'instancier classe string pour créer string
//		j = j.valueOf(i);
//		System.out.println(j);
//		System.out.println(j.getClass().getName());
//		int k = Integer.valueOf(j).intValue();
//		System.out.println(k);
//		//System.out.println("oui");
//		// TODO Auto-generated method stub

	}

}
//t = new Test();



