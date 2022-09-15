package com.clonemethod;

public class CloneMethod {
public static void main(String[] args) throws CloneNotSupportedException {
        
        Product pro1=new Product(101, "parle", 2000, "Killo Gram");
        
        Product pro2=(Product) pro1.clone();
        pro2.setPname("Godrege");
        pro2.setPrice(34353);
        
        System.out.println(pro2);
        if(pro2 instanceof Product) {
            
            System.out.println("Objects are same");
        }
        
    }
}


