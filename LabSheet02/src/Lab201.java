public class Lab201 {
    public static void main(String[] args) {
            int A = 10;
            int B = 8;

            int sum = (A + B);
            int sub = (A - B);
            int mul = (A * B);
            double div = (A / Float.parseFloat(B+""));
            int mod = (A % B);

            System.out.println("Summation = " + sum + "\nSubtraction = " + sub + "\nMultiplication = " + mul + "\nDivision = " + div + "\nModulus = " + mod);
    }
}
