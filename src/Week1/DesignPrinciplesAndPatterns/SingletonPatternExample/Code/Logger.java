package Week1.DesignPrinciplesAndPatterns.SingletonPatternExample.Code;

public class Logger {
    private static Logger instance;

    public Logger(){
        System.out.println("Logger instance created");
    }

    public static Logger getInstance(){
        if (instance==null){
            instance=new Logger();
        }
        return instance;
    }
}
