package org.example.receiver;

public interface Receiver extends Runnable {

    void receiveMessage();
    void stop();
}
