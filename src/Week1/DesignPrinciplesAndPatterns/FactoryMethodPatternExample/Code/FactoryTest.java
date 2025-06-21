package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample.Code;

public class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.getDocument();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.getDocument();

        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.getDocument();
    }
}
