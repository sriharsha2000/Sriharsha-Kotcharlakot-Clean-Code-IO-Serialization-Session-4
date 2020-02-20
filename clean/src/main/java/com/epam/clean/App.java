package com.epam.clean;

public class App 
{
    public static void main( String[] args )
    {
    	//Simple Interest
        System.out.println( "Simple Interest!" );
        SimpleInterest simpleInterest = new SimpleInterest(1000, 8, 100);
        System.out.println("Amount after simple interest calculation: "+simpleInterest.getSimpleInterest());
        
        //Compound Interest
        System.out.println( "Compound Interest!" );
        CompoundInterest compoundInterest = new CompoundInterest(1000, 8, 100);
        System.out.println("Amount after compound interest calculation: "+compoundInterest.getCompoundInterest());
        
        //House Construction
        System.out.println( "House Construction Cost Prediction!" );
        HouseConstruction house1 = new HouseConstruction(4000, "standard");
        System.out.println("Estimated cost for house 1: "+house1.getEstimatedCost());
        HouseConstruction house2 = new HouseConstruction(4000, "above standard");
        System.out.println("Estimated cost for house 2: "+house2.getEstimatedCost());
        HouseConstruction house3 = new HouseConstruction(4000, "high standard");
        System.out.println("Estimated cost for house 3: "+house3.getEstimatedCost());
        HouseConstruction house4 = new HouseConstruction(4000, "high standard and automated");
        System.out.println("Estimated cost for house 4: "+house4.getEstimatedCost());
    }
}
