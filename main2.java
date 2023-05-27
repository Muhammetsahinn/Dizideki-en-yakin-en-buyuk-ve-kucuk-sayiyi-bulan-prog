import java.util.Arrays;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};
        int max=list[0];
        int min=list[0];

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int number = inp.nextInt();

        System.out.println("Mevcut dizimiz : " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Kucukten buyuge sirali dizi : " + Arrays.toString(list));
        for(int i =0; i<list.length; i++)  {
            if (number > list[i] ) {
                //System.out.println(i);
                min = list[i];
            }
        }
        for(int i = list.length-1; i > 0; i--){
            //System.out.println(list.length);
                if(list[i]>number){
                    max=list[i];
                }
            }

        System.out.println("En yakin kucuk deger : " + min);
        System.out.println("En yakin buyuk deger : " + max);

    }
}