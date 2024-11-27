package akka.tutorial.first.java;

import akka.actor.AbstractActor;

public class Consumer2 extends AbstractActor {

    @Override
    public Receive createReceive() {
        return receiveBuilder()
            .match(Integer.class, msg -> {
                System.out.println("<<< Receiving & printing " + msg);
            })
            .build();
    }
}
