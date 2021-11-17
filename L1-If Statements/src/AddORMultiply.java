import javax.swing.*;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, multiply and display the result
    If not, add them and display the results.
     */



    public static void main(String[] args) {

        double Input1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter a number: "));
        double Input2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter another number: "));
        double result = 0;

        if(Input1 > Input2){
           result = multiply(Input1,Input2);
        }

        if (Input1 <= Input2){
            result = addition(Input1,Input2);
        }

        JOptionPane.showMessageDialog(null, "The result is: " + result);



    }


    public static double addition(double Input1, double Input2){

        return Input1 + Input2;

    }

    public static double multiply(double Input1, double Input2){

        return Input1 * Input2;

    }


}
