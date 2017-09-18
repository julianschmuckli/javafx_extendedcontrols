package net.schmuckli.example;

import javafx.beans.property.SimpleStringProperty;
import net.schmuckli.views.tableview.Row;

public class RowExample extends Row {

    private final SimpleStringProperty example = new SimpleStringProperty("");

    public RowExample(String example) {
        this.example.set(example);
    }

    public String getExample() {
        return example.get();
    }
}
