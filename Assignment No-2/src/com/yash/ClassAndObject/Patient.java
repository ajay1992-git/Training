package com.yash.ClassAndObject;

public class Patient {
	
	String patienteName;
	double height;
	double weight;
	
	
	public Patient(String patienteName, double height, double weight) {
		super();
		this.patienteName = patienteName;
		this.height = height;
		this.weight = weight;
	}


	double computeBMI()
	{
		
	return weight%height*height;
		
	
	}
   public static void main(String args[])
   {
	   Patient p=new Patient("Ajay",50,60);  
	   double computeBMI = p.computeBMI();
	   System.out.println(computeBMI);
   }
}



