import java.util.Scanner;


    public class Calculator {

   

    public static void main (String[] args) {

       

        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();

        int b= sc.nextInt();

        Calculate Perform_addition = performAddition();

        Calculate Perform_subtraction = performSubtraction();

        Calculate Perform_product = performProduct();

        Calculate Perform_division = performDivision();

        System.out.println("The sum is "+Perform_addition.performCalculation(a,b));

        System.out.println("The difference is "+Perform_subtraction.performCalculation(a,b));

        System.out.println("The product is "+Perform_product.performCalculation(a,b));

        System.out.println("The division value is "+Perform_division.performCalculation(a,b));

       

    }

    public static Calculate performAddition(){

       Calculate Perform_calculation = (int a,int b)->a+b;

       return Perform_calculation;

    }

    public static Calculate performSubtraction(){

       Calculate Perform_calculation = (int a,int b)->a-b;

       return Perform_calculation;

    }

    public static Calculate performProduct(){

       Calculate Perform_calculation = (int a,int b)->a*b;

       return Perform_calculation;

    }

    public static Calculate performDivision(){

       Calculate Perform_calculation = (int a,int b)->{

              float c = (float)a;

              float d = (float)b;

              return (c/d);

              };

       return Perform_calculation;

    }

}


