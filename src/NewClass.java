
import java.util.Scanner;


public class NewClass {
    public static class Toplama{
        void toplama_yap(int a,int b,int c){
            int sonuc=a+b+c;
            System.out.println(a+"+"+b+"+"+c+"="+sonuc);
        }
       
    }
    public static class Cikarma{
        void cikarma_yap(int a,int b,int c){
            int sonuc=a-b-c;
            System.out.println(a+"-"+b+"-"+c+"= "+sonuc);
        }
    }
     public static class Carpma{
            void carpma_yap(int a,int b,int c){
                int sonuc=a*b*c;
                System.out.println(a+"*"+b+"*"+c+"= "+sonuc);
            }
        }
        
    public static class Bolme{
        void bolme_yap(int a,int b){
            int sonuc=a/b;
            System.out.println(a+"/"+b+"= "+sonuc);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        String message="Hesap makinesi ekranına hosgeldiniz.\n"
                + "Çıkmak için 0'a basınız\n"
                + "Toplama yapmak için 1'e basınız\n"
                + "Çıkarma yapmak için 2'ye basınız\n"
                + "Çarpma yapmak için 3'e basınız\n"
                + "Bölme yapmak için 4'e basınız:\n";
       while(true){
        System.out.println(message);
        Scanner scanner=new Scanner(System.in);
        int buton=scanner.nextInt();
        
        if(buton==0){
            System.out.println("Hesap makinesinden çıkılıyor..");
            Thread.sleep(2000);
            return;
        }
        else if(buton==1){
            System.out.println("Lütfen toplamak istediğiniz sayilari girin");
            System.out.print("1. sayi= ");
            int s1=scanner.nextInt();
            System.out.print("2. sayi= ");
            int s2=scanner.nextInt();
            System.out.print("3. sayi= ");
            int s3=scanner.nextInt();
            NewClass.Toplama t1=new NewClass.Toplama();
            t1.toplama_yap(s1, s2, s3);
        }
        else if(buton==2){
            System.out.println("Lütfen çıkarmak istediğiniz sayilari girin");
            System.out.print("1. sayi= ");
            int s1=scanner.nextInt();
            System.out.print("2. sayi= ");
            int s2=scanner.nextInt();
            System.out.print("3. sayi= ");
            int s3=scanner.nextInt();
            NewClass.Cikarma t1=new NewClass.Cikarma();
            t1.cikarma_yap(s1, s2, s3);
        }
        else if(buton==3){
            System.out.println("Lütfen çarpmak istediğiniz sayilari girin");
            System.out.print("1. sayi= ");
            int s1=scanner.nextInt();
            System.out.print("2. sayi= ");
            int s2=scanner.nextInt();
            System.out.print("3. sayi= ");
            int s3=scanner.nextInt();
            NewClass.Carpma t1=new NewClass.Carpma();
            t1.carpma_yap(s1, s2, s3);
        }
        else if(buton==4){
            System.out.println("Lütfen bölmek istediğiniz sayilari girin");
            System.out.print("1. sayi= ");
            int s1=scanner.nextInt();
            System.out.print("2. sayi= ");
            int s2=scanner.nextInt();
            
            NewClass.Bolme t1=new NewClass.Bolme();
            t1.bolme_yap(s1, s2);
        }
        else {
            System.out.println("Hatali bir işlem yaptınız!");
            break;
        }
    }
   }
}
