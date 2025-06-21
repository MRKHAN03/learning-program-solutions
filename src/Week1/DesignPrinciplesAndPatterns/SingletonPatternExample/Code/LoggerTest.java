package Week1.DesignPrinciplesAndPatterns.SingletonPatternExample.Code;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Logger 1 Instance : " + logger1);
        System.out.println("Logger 2 Instance : " + logger2);

        if (logger1==logger2){
            System.out.println("Logger1 and Logger2 are same -> SINGLETON WORKS..!!");
        }
        else {
            System.out.println("\"Logger1 and Logger2 are not same -> SINGLETON PATTERN FAILED..!!\"");
        }
    }
}
