import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // = != ==
        int d = diap();
        number_guessing(d);
    }

    public static void calculate(){
            Scanner in = new Scanner(System.in);

            int num1 = in.nextInt();
            int num2 = in.nextInt();

            System.out.println("Выберите действие: \n 1. * \n 2. + \n 3. - \n 4. / ");
            int num = in.nextInt();
            if (num == 1){
                System.out.println(num1 * num2);
            }
            else if (num == 2) {
                System.out.println(num1 + num2);
            }
            else if (num == 3){
                System.out.println(num1 - num2);
            }
            else if (num == 4){
                System.out.println(num1 / num2);
            }
            else{
                System.out.println("Ну ты и дурак");
            }
    }

    public static int diap(){
        System.out.println("Choose the diapason: \n 1. 1-100 \n 2. 1-1000 \n 3. 1-10000");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch(num){
            case 1:
                int r1 = (int) (Math.random()*100) + 1;
                return r1;
            case 2:
                int r2 = (int) (Math.random()*1000) + 1;
                return r2;
            case 3:
                int r3 = (int) (Math.random()*10000) + 1;
                return r3;
            default:
                System.out.println("Incorrect number");
                diap();
                break;
        }
        return diap();
    }

    public static void number_guessing(int num){
        // Радомное число от 1 до 100 и число попыток 5
        System.out.println("Guess the number");
        Scanner in = new Scanner(System.in);
        int in_num = in.nextInt();
        int c = 1;
        while (in_num != num){
            if (in_num<num){
                System.out.println("Make it bigger");
            }
            else if (in_num > num) {
                System.out.println("Make it smaller");
            }
            in = new Scanner(System.in);
            in_num = in.nextInt();
            c ++;
        }
        System.out.println("Winner \n Count of try = " + c);
    }
}


