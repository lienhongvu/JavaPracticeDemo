package com.lienhongvu.javaclass;

/**
 * Created by hvlien on 8/11/2017.
 */
public class AnonymousInnerClassSample {

    interface AnonymousInterfaceClass {
        void saySomethingInteresting();
    }

    public static abstract class AnonymousAbstractClass {
        public abstract void saySomethingInteresting();
        void sayThank(){
            System.out.println("Thank for making me laugh!");
        }
    }

    public static void main(String[] args) {
        AnonymousInterfaceClass anonymousClass = new AnonymousInterfaceClass() {
            public void saySomethingInteresting() {
                System.out.println("ahihi");
            }
        };
        anonymousClass.saySomethingInteresting();

        AnonymousAbstractClass anonymousAbstractClass = new AnonymousAbstractClass(){
            public void saySomethingInteresting() {
                System.out.println("ahaha");
            }
        };
        anonymousAbstractClass.saySomethingInteresting();
        anonymousAbstractClass.sayThank();
    }

}
