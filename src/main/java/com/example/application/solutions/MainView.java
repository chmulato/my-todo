package com.example.application.solutions;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="/exercises01")
public class MainView extends VerticalLayout {
    public MainView() {
        add(new ProductForm());
    }
}
