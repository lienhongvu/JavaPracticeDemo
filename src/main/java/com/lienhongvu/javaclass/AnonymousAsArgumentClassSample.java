package com.lienhongvu.javaclass;

/**
 * Created by hvlien on 8/11/2017.
 */
public class AnonymousAsArgumentClassSample {

    interface MessageArgument {
        int a = 0;
        int b = 2;

        void display();
    }

    private void displayMessage(MessageArgument message){
        message.display();
    }

    public static void main(String[] args) {
        AnonymousAsArgumentClassSample main = new AnonymousAsArgumentClassSample();
        main.displayMessage(new MessageArgument() {
            public void display() {
                System.out.println("ahihi");
            }
        });
    }
}
