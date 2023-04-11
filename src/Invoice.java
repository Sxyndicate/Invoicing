public class Invoice {
    private String invoiceNumber;
    private double saleAmount;
    private double salesTax;

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
        this.salesTax = saleAmount * 0.05;
    }

    public void display() {
        System.out.println("Invoice number: " + invoiceNumber);
        System.out.println("Sale amount: R" + saleAmount);
        System.out.println("Sales tax: R" + salesTax);
    }

    public static void main(String[] args) {
        // create an instance of the Invoice class
        Invoice invoice = new Invoice();

        // set the invoice number and sale amount
        invoice.setInvoiceNumber("INV-001");
        invoice.setSaleAmount(500.0);

        // display the invoice details
        invoice.display();
    }
}
