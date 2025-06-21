package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample.Code;

public class WordDocumentFactory extends DocumentFactory {

    public Document createDocument(){
        return new wordDocument();
    }
}
