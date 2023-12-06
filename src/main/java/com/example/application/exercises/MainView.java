package com.example.application.exercises;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value ="/test")
public class MainView extends VerticalLayout {

    public MainView() {
        Button button = new Button("Click me!", e -> Notification.show("Hello World!"));
        add(button);
    }
}
