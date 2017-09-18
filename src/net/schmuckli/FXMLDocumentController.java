package net.schmuckli;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import net.schmuckli.example.RowExample;
import net.schmuckli.views.checkbox.CheckBoxManager;
import net.schmuckli.views.tableview.TableViewManager;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TableView tabView;
    private TableViewManager tabManager;

    @FXML
    private CheckBox cheOption1, cheOption2;
    private CheckBoxManager checkboxManager;

    @FXML
    private TableColumn<?, ?> colExample;

    @FXML
    private void addToTableView(ActionEvent event) {
        tabManager.add(new RowExample("Hallo"));
    }

    @FXML
    private void checkBoxes(ActionEvent event) {
        System.out.println(checkboxManager.isOneChecked());
        checkboxManager.setSelected(true, 0, 1);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tabManager = new TableViewManager(tabView);
        colExample.setCellValueFactory(new PropertyValueFactory<>("example"));

        checkboxManager = new CheckBoxManager(cheOption1, cheOption2);
    }

}
