package br.com.example.model;

import br.com.example.interfaces.Observer;
import br.com.example.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

    //Reference to our Subject class
    private Subject topic;
    private String name;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);

        if(message == null)
            System.out.println(name + " - No new message on this topic!");
        else
            System.out.println(name + " - Retrieving message: " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
