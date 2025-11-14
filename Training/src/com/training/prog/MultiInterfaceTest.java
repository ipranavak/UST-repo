//multiImplement
package com.training.prog;
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class PrinterScanner implements Printable, Scannable {
    public void print() { System.out.println("Printing document..."); }
    public void scan() { System.out.println("Scanning document..."); }
}

public class MultiInterfaceTest {
    public static void main(String[] args) {
        PrinterScanner ps = new PrinterScanner();
        ps.print();
        ps.scan();
    }
}
