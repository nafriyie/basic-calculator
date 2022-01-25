public class BasicCalculator {
    
    public BasicCalculator(){

    }

    public double add(double a, double b){
        double sum = a + b;
        return sum;
    }

    public double subtract(double a, double b){
        double difference = a - b;
        return difference;
    }
    
    public double multiply(double a, double b){
        double product = a * b;
        return product;
    }

    public double divide(double a, double b){
        double quotient = a / b;
        return quotient;
    }

    public double modulo(double a, double b){
        double remainder = a % b;
        return remainder;
    }

    public static void main(String[] args){
        BasicCalculator original = new BasicCalculator();
        double firstProblem = original.add(12.0, 5.0);
        double secondProblem = original.subtract(12.0, 5.0);
        double thirdProblem = original.multiply(12.0, 5.0);
        double fourthProblem = original.divide(12.0, 5.0);
        double fifthProblem = original.modulo(12.0, 5.0);
        
        System.out.println(firstProblem);
        System.out.println(secondProblem);
        System.out.println(thirdProblem);
        System.out.println(fourthProblem);
        System.out.println(fifthProblem);
    }
}
