package com.yash.exception.StudentResult_program1;

public class Test {
	
	public static void main(String[] args) throws ResultException
    {
        StudentResult sr= new StudentResult();
        sr.setMaths(61);
        sr.setGeography(20);
        sr.setPhysics(55);
        
        Student s=new Student();
        s.setRollno(1);
        s.setSname("Sumit");
        s.setSname("Nagpur");
        s.setSrobj(sr);
//        
        
//        sr.result();
        
        if(sr.getMaths()<35 && sr.getGeography()<35 || sr.getMaths()<35 && sr.getPhysics()<35 || sr.getGeography()<35 && sr.getPhysics()<35);
        {
            throw new ResultException("you failed in 2 subjects...");    
            
        }
    
    }



}

