package Queue;

public class No1_AntrianApp {
    
    public static void main(String[] args){
           // Fika Nur Hasari - 21092001 //
           // No.1 Antrian //
           Antrian antrian = new Antrian(10);
          
           antrian.enqueue(40);
           antrian.display();
           System.out.println();
           
           antrian.enqueue(33);
           antrian.display();
           System.out.println();
           
           System.out.println("nilai yang paling depan = "+ antrian.peek());
           
           antrian.enqueue(60);
           antrian.display();
           System.out.println();
           
           System.out.println("nilai diambil dari antrian = "+ antrian.dequeue());
           antrian.display();
           System.out.println();
           
           System.out.println("nilai diambil dari antrian = "+ antrian.dequeue());
           antrian.display();
           System.out.println();
           
           antrian.enqueue(54);
           antrian.display();
           System.out.println();
           
           System.out.println("nilai yang paling depan =  "+ antrian.peek());
    }
}
