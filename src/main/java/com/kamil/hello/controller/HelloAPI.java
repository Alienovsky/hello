package com.kamil.hello.controller;

import com.kamil.hello.service.HelloService;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by alienor on 6/26/17.
 */
@SpringUI(path = "/")
@Theme("valo")
public class HelloAPI extends UI{

    @Autowired
    private HelloService helloService;

    @Override
    protected void init(VaadinRequest request) {
        TextField name = new TextField("Enter ur name");
        Button button = new Button("Click me!");

        VerticalLayout layout = new VerticalLayout(button, name);
        layout.setMargin(true);
        layout.setSpacing(true);
        setContent(layout);

        button.addClickListener( e -> Notification.show(helloService.sayHello(name.getValue())));

    }
}
