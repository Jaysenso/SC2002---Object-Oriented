import java.util.Scanner;


public class P4 {
    public static void main(String[] argz){

        int i;
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.printf("Height: ");
        int height = input.nextInt();

        for(i = 0; i < height; i++){
            if (i%2 == 0){
                str = "AA" + str;
                System.out.println(str);
            }
            else{
                str = "BB" + str;
                System.out.println(str);
            }
        }
    }
}
