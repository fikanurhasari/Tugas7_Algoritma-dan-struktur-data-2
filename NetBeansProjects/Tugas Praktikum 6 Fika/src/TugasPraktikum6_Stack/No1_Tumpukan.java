package TugasPraktikum6_Stack;

public class No1_Tumpukan {
  public static void main(String [] args){
        System.out.println("Fika Nur Hasari - 21092001");
        System.out.println("No. 1");
        System.out.println(" ");
      
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.push(80);
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        
        long nilai1 = tumpukan.peek();
        System.out.println("nilai top = "+nilai1);
        System.out.println(" ");
        
    }
    
}
