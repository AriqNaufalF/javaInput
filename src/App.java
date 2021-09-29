import java.util.Scanner; //! Import scanner class

public class App {
    public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in); //! Import scanner obj
       String nama, kelas; //input variabel
       float ipk;
       long nim;
    
       System.out.print("Nama: ");
       nama = myObj.nextLine();         //! Input data nama

       System.out.print("kelas: ");       
       kelas = myObj.nextLine();        //! Input data Kelas

       System.out.print("NIM: ");       
       nim = myObj.nextLong();        //! Input data NIM 

       System.out.print("IPK: ");    
       ipk = myObj.nextFloat();        //! Input data IPK 

       System.out.println("=".repeat(30));

       System.out.println("Halo " + nama + "! \nDari kelas " + kelas + "\nDengan NIM: " + nim + "\nIPK kamu " + ipk); //Output ke terminal

       System.out.println("=".repeat(30));

    }
}
