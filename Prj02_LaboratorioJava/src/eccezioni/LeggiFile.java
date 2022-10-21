package eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeggiFile {
	public static void main(String[] args) {
		
		File f = new File("files/gatto.txt");
		
		ArrayList<Gatto>gattile = new ArrayList<>();
		
		try {
			
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				
				String riga = sc.nextLine();
				
				String[] dueEta = riga.split(",");
				
				String etaGatto = dueEta[0];
				String etaUmano = dueEta[1];
				
				Gatto g = new Gatto(etaGatto,etaUmano);
				gattile.add(g);
				
				//System.out.println("Un gatto di "+etaGatto+ " corrisponde a "+ etaUmano +" di un umano");;
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(gattile.size());
	}

}
