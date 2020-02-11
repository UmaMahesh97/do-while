interface Bank{    
abstract int rateOfInterest();    
}    
class SBI implements Bank{    
public int rateOfInterest(){return 7;}    
}    
class PNB implements Bank{    
public int rateOfInterest(){return 8;}    
}    
    
class TestBank{    
public static void main(String args[]){    
Bank b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.rateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.rateOfInterest()+" %");    
}}   