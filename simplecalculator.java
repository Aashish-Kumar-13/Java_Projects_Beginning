public class simplecalculator {
    public static void main(String[] args) {
//        Taking the user input from Scanner
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1=sc.nextDouble();

        System.out.println("Enter Second Number:");
        double num2=sc.nextDouble();

        System.out.println("Chose an Operations :");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("Enter Your Operation to perform the numbers:(1-4)");

//      chose the operation
        int choice=sc.nextInt();
        double result;
        switch (choice){
            case 1:
                result=num1+num2;
                System.out.println("Sum of "+num1+"+"+num2+"is:"+result);
                break;
            case 2:
                result=num1-num2;
                System.out.println("Sub of "+num1+"-"+num2+"is:"+result);
                break;
            case 3:
                result=num1*num2;
                System.out.println("Mul of "+num1+"*"+num2+"is:"+result);
                break;
            case 4:
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Quotient of " + num1 + " / " + num2 + " is:" + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Choice");

        }
    }
}
