package test;
import java.math.BigInteger;

public class Factorial {



    public static BigInteger factorial(BigInteger number){

        if(number.compareTo(BigInteger.ONE) <=1){    
            return BigInteger.ONE;   //for base case
        }
        else{
            return number.multiply(
                factorial(number.subtract(BigInteger.ONE))
            ) ;

        }

    }


    public static void main(String[] args) {

        //factorial for 0-50
        for(int count=0;count<=20;count++){
            System.out.printf("%d \t = %d \n",count,factorial(BigInteger.valueOf(count)));

        }
        
    }
    
}
