import java.util.Scanner;

/**
 *
 * @author fatih-git
 */


public class k3k4Avg {

    public static void main(String[] args) {

        int limit, top=0, miktar=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen üst sınırı giriniz: ");
        limit=input.nextInt();

        for(int i=0; i<limit; i++){

            if(i%3==0 || i%4==0){
                top+=i;
                miktar++;
            }

        }

        System.out.println(limit+"'e kadar olan sayılardan 3 ve 4'ün katı olan sayıların ortalaması= "+(top/miktar));

    }

}
