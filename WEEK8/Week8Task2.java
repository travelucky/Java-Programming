import java.util.Scanner;
public class Week8Task2 {
    public static void main(String[]args){
        //Create an array
        double[] mylist =new double[5];
        //Initializing arrays with input values:
        Scanner input =new Scanner(System.in);
        System.out.print("Enter "+mylist.length +" Values:");
        for(int i=0;i<mylist.length;i++){
            mylist[i]=input.nextDouble();
        }
        input.close();
    }
}