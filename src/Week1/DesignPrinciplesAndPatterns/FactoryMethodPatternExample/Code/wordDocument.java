package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample.Code;

public class wordDocument implements Document{

    @Override
    public void getDocument(){
        System.out.println("This is Word document..!!");
    }
}
