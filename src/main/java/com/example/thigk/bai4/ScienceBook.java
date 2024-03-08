package com.example.thigk.bai4;

public class ScienceBook extends Book {
    private String scienceField;

    public ScienceBook(String title, String author, String publisher, String scienceField) {
        super(title, author, publisher);
        this.scienceField = scienceField;
    }

    public String scienceField() {
        return scienceField;
    }

    public void scienceField(String scienceField) {
        this.scienceField = scienceField;
    }
}
