package epam.houseConstructionCost;

public class Construction {
	public float standardMaterials(float area)
	{
		return 1200*area;				
	}
	public float aboveStandardMaterials(float area)
	{
		return 1500*area;				
	}
	public float highStandardMaterials(float area,String  automated)
	{
		if(automated=="Yes")
			return 2500*area;
		else
			return 1800*area;
	}
}
