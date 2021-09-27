import java.util.Scanner; //! Import scanner class

public class App {
    public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in); //! Import scanner obj
       String nama, kelas; //input variabel
       Double ipk;
    
       System.out.print("Nama: ");
       nama = myObj.nextLine();         //! Input data nama

       System.out.print("kelas: ");       
       kelas = myObj.nextLine();        //! Input data Kelas 

       System.out.print("IPK: ");
       ipk = myObj.nextDouble();        //! Input data IPK 

       System.out.println("Halo " + nama + "! \nDari kelas " + kelas + "\nIPK kamu " + ipk); //Output ke terminal


    }
}
