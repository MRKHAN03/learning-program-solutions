package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample.Code;

public class PDFDocumentFactory extends DocumentFactory {

    public Document createDocument(){
        return new pdfDocument();
    }
}
