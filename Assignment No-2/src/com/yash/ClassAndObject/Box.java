package com.yash.ClassAndObject;

public class Box {
	
	 int width;
	 int height;
	 int depth;
	 int volume;
	 public Box(int width, int height, int depth) {
			super();
			this.width = width;
			this.height = height;
			this.depth = depth;
		}
	 
	 void volumeOfSphere()
	 {
		 volume=width*depth*height;
		 System.out.println(volume);
		 
	 }
	 public static void main (String []args) 
	 
	 {
		 
		 Box b=new Box(11,11,11);
		 b.volumeOfSphere();
		 
	 }


}

