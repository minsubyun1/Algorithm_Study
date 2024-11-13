package BOJ.Bronze;
import java.util.*;
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] albArr = alphabet.split("");
        int[] arr = new int[albArr.length];
        int index = 0;

        for(String s : albArr){
            index = alphabet.indexOf(s);
            for(int i = 0; i < str.length(); i++){
                if(String.valueOf(str.charAt(i)).equals(s)){
                    arr[index]++;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
