package org.example.factory;

public interface Document {
    void open();
}

// PDFDocument class
class PDFDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
}

// WordDocument class
class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }
}

// HTMLDocument class
class HTMLDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening HTML document...");
    }
}
