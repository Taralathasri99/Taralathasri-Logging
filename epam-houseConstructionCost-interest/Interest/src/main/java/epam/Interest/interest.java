package epam.Interest;
import java.lang.Math;

class interest {
	public float simpleInterest(int principle,int time,float rateOfInterest)
	{
		return principle*time*rateOfInterest;
	}
	public double compoundInterest(int principle,int time,float rateOfInterest,int nYears)
	{
		double Amount=principle*(1+(rateOfInterest/nYears));
		return Math.pow(Amount, nYears*time);
	}

}
