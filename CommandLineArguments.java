class CommandLineArguments {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]); // type conversion
        int secondNumber = Integer.parseInt(args[1]);

        int result = firstNumber + secondNumber;
        System.out.println("Addition is: "+result);
    }
}
