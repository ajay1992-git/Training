package com.yash.stringPrograms;

public class GarbageCollectorWork_7 {
	
	String st;

	 public GarbageCollectorWork_7(String st) {
	          this.st = st;
	      }
	      
	      @Override
	      protected void finalize() throws Throwable {
	           System.out.println(this.st + " collected");
	      }
	       
	      public static void main(String[] args) {
	           GarbageCollectorWork_7 gcc = new GarbageCollectorWork_7("Ajay");
	           System.out.println("String="+gcc.st.toString());
	          gcc=null;
	          System.gc();
	      }

}
		
