# JavaFX Extended controls
Library for extended functions to handle with multiple elements.

This library should help you to make it easier to access and control elements of JavaFX.

## TableViewManager

Create a tableview in the SceneBuilder with one or more columns. Get access to the JavaFX elements via the @FXML notation. After that you can initalize your view and columns with the `CellValueFactory`.

```java
TableViewManager tabManager = new TableViewManager(tabView);
colExample.setCellValueFactory(new PropertyValueFactory<>("example"));
```
Now you can add elements with a Row object. This can be extended as you can see in the follwing example:

```java

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
```
It is recommended to use `SingleStringProperty`. Then you can add rows simple and easy via the following command in your controller.

```java
tabManager.add(new RowExample("Hello World"));
```
