package Assignment4;

public class currencyFucntions {
    public void Ruppe_to_other(double amt) {
        System.out.println("1 Ruppe = " + 0.013 + " Dollar");
        System.out.println();
    
        System.out.println(amt+" Ruppe = " + (amt*0.013) + " Dollar");
        System.out.println();
    
        System.out.println("1 Ruppe = " + 0.012 + " Euro");
        System.out.println();
        System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");
        System.out.println();
    
    }
    public void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 79.37 + " Ruppe");
        System.out.println();
        System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
        System.out.println();
    
        System.out.println("1 Dollar= " + 0.98 + " Euro");
        System.out.println();
    
        System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
    }
    
        
    
    public void Euro_to_other(double amt){
        System.out.println("1 Euro = " + 80.85 + " Ruppe");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
        System.out.println();
    
        System.out.println("1 Euro = " + 1.02 + " Dollar");
        System.out.println();
    
        System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
    }
}
