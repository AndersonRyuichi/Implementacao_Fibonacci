package Fibonacci;
import java.util.Scanner;

public class Fibonacci {
    public static void Main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int num;
        System.out.println("Digite o termo da serie que deseja encontrar: ");
        num = leitor.nextInt();
        for(int i = 1 ; i <= num ; i++){
            System.out.println(fibonacci(i));
        }
    }

    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n -2);
        }
    }
}
