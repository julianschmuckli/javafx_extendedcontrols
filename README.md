# JavaFX Extended controls
Library for extended functions to handle with multiple elements.

This library should help you to make it easier to access and control elements of JavaFX.

## TableViewManager

Create a tableview in the SceneBuilder with one or more columns. Get access to the JavaFX elements via the @FXML notation. After that you can initalize your view and columns with the `CellValueFactory`.

```java
TableViewManager tabManager = new TableViewManager(tabView);
colExample.setCellValueFactory(new PropertyValueFactory<>("example"));
```
Now you can add elements with a `Row` object. This can be extended as you can see in the following example:

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
It is recommended to use `SingleStringProperty`. Then you can add rows simply and easy via the following command in your controller.

```java
tabManager.add(new RowExample("Hello World"));
```

```java
tabManager.updateLast(new RowExample("Hello World"));
```

## CheckBoxManager

When you have multiple checkboxed and you want to control all of them with simple commands, then you should use this feature. To initialize the checkboxes, create an instance of CheckBoxManager and put all your checkboxes in the constructor. You can put as many checkboxes you want.

```java
checkboxManager = new CheckBoxManager(cheOption1, cheOption2, ...);
```

Now you can check if all checkboxes are checked or if there is just one selected:

```java
checkboxManager.areAllChecked();
checkboxManager.isOneChecked();
```

You can also set a status to one or more checkboxes:

```java
checkboxManager.setSelected(true, 0, 1, ...);
```
