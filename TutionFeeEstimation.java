
public class TutionFeeEstimation {
	public static void main(String[] args) {
		float tutionFee = 5000;
		float updatedFee = tutionFee;
		int noOfYears=0;
		
		while(updatedFee < 2*tutionFee) {
			updatedFee += updatedFee*0.10;
			noOfYears++;
		}
		
		System.out.println("the no of years taken to double the Original Fee: " + noOfYears);
	}
}
