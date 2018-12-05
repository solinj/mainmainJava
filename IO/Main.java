package IO;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("IO.LOLO/test.txt");
		/**
		 * METHODES DE FILE
		 */
		String chemin_absolu_fichier = f.getAbsolutePath();
		String nom_fichier = f.getName();
		boolean existe = f.exists();
		boolean est_un_repertoire = f.isDirectory();
		boolean est_fichier = f.isFile();
		
		System.out.println("chemin absolu fichier " + chemin_absolu_fichier);
		System.out.println("nom fichier " + nom_fichier);
		System.out.println("existe ? " + existe);
		System.out.println("est un répertoire ? " + est_un_repertoire);
		System.out.println("est un fichier ? " + est_fichier);
		System.out.println("parent file " + f.getParentFile());
		//String path = f.getPath();
		System.out.println("INFO " + f.getAbsolutePath());
		
		/**
		 * AFFICHAGE LECTEURS RACINE PC
		 */
		for(File fi : f.listRoots()) {
			try {
				System.out.println(fi.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(fi.getParentFile());
			for (File nom : fi.listFiles()) {
				System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName()+"/" : nom.getName()));
			}
		}
		
	}

}
