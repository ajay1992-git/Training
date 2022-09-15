package com.yash.exception.StudentResult_program1;

public class StudentResult {
	
	  int maths;
	    int geography;
	    int physics;
	    public int getMaths() {
	        return maths;
	    }
	    public void setMaths(int mathe) {
	        this.maths = maths;
	    }
	    public int getGeography() {
	        return geography;
	    }
	    public void setGeography(int geography) {
	        this.geography = geography;
	    }
	    public int getPhysics() {
	        return physics;
	    }
	    public void setPhysics(int physics) {
	        this.physics = physics;
	    }
	    
	    public void result() throws ResultException
	    {
	        int total= (maths+geography+physics)*100;
	        int avg=total/300;
	        System.out.println(avg);    
	        
	        if(maths<0 || geography<0 || physics<0)
	        {
	            throw new ResultException("Marks cant be Negative");
	        }
	        
	        else if(avg<40 )
	        {
	            throw new ResultException("your result is fail");
	        
	        }
	        else {System.out.println("Passsssss bete");}
	        
	    }
	    
}


