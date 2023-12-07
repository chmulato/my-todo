package com.example.application.solutions;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value= "/exercises02")
public class LayoutView extends VerticalLayout {

    private static VerticalLayout getVerticalLayout() {
        DatePicker datePicker01 = new DatePicker("DatePicker");
        TextField textField01 = new TextField("TextField");
        ComboBox<String> comboBox01 = new ComboBox<>("ComboBox");
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.setPadding(true);
        verticalLayout.setSpacing(true);

        verticalLayout.add(datePicker01);
        verticalLayout.add(textField01);
        verticalLayout.add(comboBox01);
        return verticalLayout;
    }
    private static HorizontalLayout getHorizontalLayout() {
        DatePicker datePicker02 = new DatePicker("DatePicker");
        TextField textField02 = new TextField("TextField");
        ComboBox<String> comboBox02 = new ComboBox<>("ComboBox");
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.setPadding(true);
        horizontalLayout.setSpacing(true);

        horizontalLayout.add(datePicker02);
        horizontalLayout.add(textField02);
        horizontalLayout.add(comboBox02);
        return horizontalLayout;
    }
    LayoutView() {
        VerticalLayout verticalLayout = getVerticalLayout();
        HorizontalLayout horizontalLayout = getHorizontalLayout();
        HorizontalLayout mainLayout = new HorizontalLayout(verticalLayout, horizontalLayout);
        add(mainLayout);
    }
}
