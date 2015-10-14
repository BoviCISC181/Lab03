package pokerBase;

public class exHand extends Exception{
	public exHand(int numberOfTies){
		System.out.println("Tie. "+numberOfTies+" top hands win.");
	}
}
