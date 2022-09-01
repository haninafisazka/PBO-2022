import java.util.Scanner;
public class dataMahasiswa {

    public static void main (String[] args){
       Scanner input = new Scanner (System.in);

       String nama, nim, jenisKelamin, alamat; //variabel
       
       System.out.println("===================================");
       System.out.println("     FORM INPUT DATA MAHASISWA     ");
       System.out.println("===================================");

       System.out.print("Nama             : ");
       nama = input.nextLine(); //memberikan nilai variabel dengan menyimpan input dr user
       System.out.print("NIM              : ");
       nim = input.nextLine();
       System.out.print("Jenis Kelamin    : ");
       jenisKelamin = input.nextLine();
       System.out.print("Alamat           : ");
       alamat = input.nextLine();

       System.out.println();

       System.out.println("===================================");
       System.out.println("           DATA MAHASISWA          ");
       System.out.println("===================================");
       System.out.println("Nama             : " +nama);
       System.out.println("NIM              : " +nim);
       System.out.println("Jenis Kelamin    : " +jenisKelamin);
       System.out.println("Alamat           : " +alamat); 
    }  
}

