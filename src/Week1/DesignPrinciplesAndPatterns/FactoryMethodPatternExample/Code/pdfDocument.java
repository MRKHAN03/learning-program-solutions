package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample.Code;

public class pdfDocument implements Document{

    @Override
    public void getDocument(){
        System.out.println("This is PDF document..!!");
    }
}
