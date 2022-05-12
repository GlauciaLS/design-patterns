package br.com.example;

import br.com.example.interfaces.Observer;
import br.com.example.model.EmailTopic;
import br.com.example.model.EmailTopicSubscriber;

public class DesignPatternsApplication {

    public static void main(String[] args) {

        EmailTopic topic = new EmailTopic();

        // Create observers
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

        // Register them
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        // Attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        // Check for updates
        firstObserver.update();

        // Provider/Subject (Broadcaster)
        topic.postMessage("Hello subscribers!");

        // Unregister
        topic.unregister(firstObserver);

        // Provider/Subject (Broadcaster)
        topic.postMessage("Hello again!");
    }
}
