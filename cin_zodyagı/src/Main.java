import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("CİN ZODYAGİ BURCU HESAPLAMA");
        Scanner input=new Scanner(System.in);
        System.out.println("Dogum Yilinizi Giriniz :");
        int yil=input.nextInt();
        int a=yil%12;
        if (a==0)
            System.out.println("cin zodyagi burcunuz maymun");
        if (a==1)
            System.out.println("cin zodyagi burcunuz horoz");
        if (a==2)
            System.out.println("cin zodyagi burcunuz kopek");
        if (a==3)
            System.out.println("cin zodyagi burcunuz domuz");
        if (a==4)
            System.out.println("cin zodyagi burcunuz fare");
        if (a==5)
            System.out.println("cin zodyagi burcunuz okuz");
        if (a==6)
            System.out.println("cin zodyagi burcunuz kaplan");
        if (a==7)
            System.out.println("cin zodyagi burcunuz tavsan");
        if (a==8)
            System.out.println("cin zodyagi burcunuz ejderha");
        if (a==9)
            System.out.println("cin zodyagi burcunuz yilan");
        if (a==10)
            System.out.println("cin zodyagi burcunuz at");
        if (a==11)
            System.out.println("cin zodyagi burcunuz koyun");


    }
}
