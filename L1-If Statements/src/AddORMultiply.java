import javax.swing.*;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, multiply and display the result
    If not, add them and display the results.
     */



    public static void main(String[] args) {

        double numInput1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter a number: "));
        double numInput2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter another number: "));
        double result = 0;

        if(numInput1 > numInput2){
           result = multiply(numInput1,numInput2);
        }

        if (numInput1 <= numInput2){
            result = addition(numInput1,numInput2);
        }

        JOptionPane.showMessageDialog(null, "The result is: " + result);



    }


    public static double addition(double input1, double input2){

        return input1 + input2;

    }

    public static double multiply(double input1, double input2){

        return input1 * input2;

    }


}
