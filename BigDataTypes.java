import java.math.BigDecimal; // package
import java.math.BigInteger; // package

class BigDataTypes {
    public static void main(String[] args) {
        BigInteger firstNumber = new BigInteger("79847987");
        BigInteger secondNumber = new BigInteger("729384798");
        BigInteger result = firstNumber.add(secondNumber);

        System.out.println(result);

        // BigDecimal firstNumber = new BigDecimal("0.03");
        // BigDecimal secondNumber = new BigDecimal("0.04");
        // BigDecimal result = secondNumber.subtract(firstNumber);

        // System.out.println(result);
        
        // comment shortcut: ctrl + /
        // double firstNumber = 0.03;
        // double secondNumber = 0.04;
        
        // double result = secondNumber - firstNumber;
    }
}
