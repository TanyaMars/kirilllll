import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // = != ==
        calculate();
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
}

