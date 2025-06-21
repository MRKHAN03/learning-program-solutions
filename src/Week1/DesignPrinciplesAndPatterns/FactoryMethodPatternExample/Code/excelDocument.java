package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample.Code;

public class excelDocument implements Document {
    @Override
    public void getDocument(){
        System.out.println("This is Excel Document..!!");
    }
}
