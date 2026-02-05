import java.util.Random;
import java.security.SecureRandom;

public class Des {
	private int valeur;
	private Random random;
	
	public Des (int position) {
		try {
			random = SecureRandom.getInstanceStrong();
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		public int lancerDes  {
			return (random.nextInt(10)+2);
		}
		
	}

}
