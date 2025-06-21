package Week1.DataStructuresAndAlgorithms.FinancialForecasting.Code;

public class ForecastTest {
    public static double calculateFutureValue(double presentValue , double rate , int years){
        if(years==0){
            return presentValue;
        }
        return calculateFutureValue(presentValue*(1+rate) , rate,years-1);
    }

    public static void main(String[] args)
    {
        double presentValue = 1000.0;
        double rate = 0.05;
        int year = 3;

        double futureValue = calculateFutureValue(presentValue,rate,year);
        System.out.println("Future value after "+ year+ " years is : "+ futureValue);
    }
}
