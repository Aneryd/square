public class squarePayment {
    public static double sqrtPayment(double number){

        if(number <0){
            return Double.NaN;
        }
        if (number > Double.MAX_VALUE){
            return Double.NaN;
        }

//        double form;
        double answer;
        double value = 3;
        double result = 0;

        answer = number;
        while (answer != result){
            answer = 0.5*(value + (number/value));
            value=answer;
            result = 0.5*(value + (number/value));
        }
        return answer;
    }
}
