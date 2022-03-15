import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    int k;
    double z1;
    double z2;

    System.out.println("wybierz program !!!");
    System.out.println(" 1.Dodawanie \n 2.Odejmowanie \n 3.Mnozenie \n 4.Dzielenie");
    Scanner to = new Scanner(System.in);
    k = to.nextInt();
    switch(k)
      {
        case 1:
    double suma;
    System.out.println("Podaj dwie liczby: ");

    Scanner first = new Scanner(System.in);
    z1= first.nextDouble();
    Scanner secend = new Scanner(System.in);
    z2 = secend.nextDouble();

    suma= z1+z2;

    System.out.println("wynik dodawania "+suma);
          break;
        case 2:
          double roznica;
    System.out.println("Podaj dwie liczby: ");

    Scanner a = new Scanner(System.in);
    z1= a.nextDouble();
    Scanner b = new Scanner(System.in);
    z2 = b.nextDouble();

    roznica= z1-z2;

    System.out.println("wynik odejmowania "+roznica);
          break;
          
        case 3:
          
    double iloczyn;
    System.out.println("Podaj dwie liczby: ");

    Scanner c = new Scanner(System.in);
    z1= c.nextDouble();
    Scanner d = new Scanner(System.in);
    z2 = d.nextDouble();

    iloczyn= z1*z2;

    System.out.println("wynik mnozenia "+iloczyn);
          break;
        case 4:
           double iloraz;
    System.out.println("Podaj dwie liczby: ");

    Scanner e = new Scanner(System.in);
    z1 = e.nextDouble();
    Scanner f = new Scanner(System.in);
    z2 = f.nextDouble();
  if(z2 !=0)
  {
    iloraz = z1/z2;
    System.out.println("wynik to "+iloraz);
  }
  else
  {
     System.out.println("nie dziel przez zero !!!");
    break;
  }
  

    System.out.println("wynik dzielenia "+iloraz);
          break;
          
      }
    
    
    



    
  }
}