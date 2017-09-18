package net.schmuckli.views.tableview;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.scene.control.TableView;

public class TableViewManager {

    private static ArrayList<TableViewManager> instances = new ArrayList<>();

    private TableView view;

    public TableViewManager(TableView tableView) {
        view = tableView;
        view.setItems(FXCollections.observableArrayList());
        instances.add(this);
    }

    public void add(Row row) {
        view.getItems().add(row);
    }

    public void updateLast(Row row) {
        view.getItems().remove(view.getItems().size() - 1);
        view.getItems().add(row);
    }

    public void removeAll() {
        view.getItems().clear();
    }
}
