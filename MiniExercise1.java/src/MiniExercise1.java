import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MiniExercise1 {
    public static void main(String[] args) {
        //task 1
        Task1();
    }

    //Task1
    public static void Task1() {
        Scanner sc = new Scanner(System.in);

        //Asking the user, how many elements they want to create
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        //Create an Object array with X elements
        Object[] array = new Object[n];

        //ask the user to enter a value for each element of the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value for element" + (i + 1) + ": ");
            int value = sc.nextInt();

            //converting the value to boolean, if the vale is 0 or 1
            if (value == 0 || value == 1) {
                array[i] = (value == 1);
            }
            //convert the value to a byte, if it is within the byte range
            else if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                array[i] = (byte) value;
            }
            //convert to short, if the value is within in the short range
            else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                array[i] = (short) value;
            }
            //convert the value to integer, if the value is a number
            else {
                array[i] = value;
            }
        }

        System.out.println("\nArray contents: ");
        for (Object obj : array) {
            System.out.print(obj + "(" + obj.getClass().getSimpleName() + ")");
        }
        sc.close();
    }
}




