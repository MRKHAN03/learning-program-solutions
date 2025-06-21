package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample.Code;

public class ExcelDocumentFactory extends DocumentFactory {

    public Document createDocument(){
        return new excelDocument();
    }
}
