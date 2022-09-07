import java.util.Scanner;

class KonversiNilai {
  public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Masukkan nilai : ");
    int a = scanner.nextInt();
    if (a >= 85){
      System.out.println ("Nilai Anda adalah A");
    }
    else if (a>=80&&a<=84){
      System.out.println ("Nilai Anda adalah A-");
    }
    else if (a>=75&&a<=79){
      System.out.println ("Nilai Anda adalah B+");
    }
    else if (a>=70&&a<=74){
      System.out.println ("Nilai Anda adalah B");
    }
    else if (a>=65&&a<=69){
      System.out.println ("Nilai Anda adalah C+");
    }
    else if (a>=60&&a<=64){
      System.out.println ("Nilai Anda adalah C");
    }
    else if (a>=55&&a<=59){
      System.out.println ("Nilai Anda adalah D");
    }
    else if (a<=55){
      System.out.println ("Nilai Anda adalah E");
    }
  }
}