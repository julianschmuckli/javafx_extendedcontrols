package net.schmuckli.views.checkbox;

import java.util.ArrayList;
import javafx.scene.control.CheckBox;

public class CheckBoxManager {

    private static ArrayList<CheckBoxManager> instances = new ArrayList<>();
    private ArrayList<CheckBox> checkboxes = new ArrayList<>();

    public CheckBoxManager(CheckBox... checkboxes) {
        for (CheckBox curr : checkboxes) {
            this.checkboxes.add(curr);
        }
        instances.add(this);
    }

    public boolean areAllChecked() {
        for (CheckBox curr : checkboxes) {
            if (!curr.isSelected()) {
                return false;
            }
        }
        return true;
    }

    public boolean isOneChecked() {
        int i = 0;
        for (CheckBox curr : checkboxes) {
            if (curr.isSelected()) {
                i++;
            }
        }
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMinOneChecked() {
        int i = 0;
        for (CheckBox curr : checkboxes) {
            if (curr.isSelected()) {
                i++;
            }
        }
        if (i == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void setSelected(boolean status, int... indexes) {
        try {
            for (int curr : indexes) {
                checkboxes.get(curr).setSelected(status);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
