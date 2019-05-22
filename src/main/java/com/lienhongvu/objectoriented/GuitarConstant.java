package com.lienhongvu.objectoriented;

/**
 * Created by hvlien on 12/25/2018.
 */
public class GuitarConstant {

    public enum Type {
        ACOUSTIC, ELECTRIC;

        @Override
        public String toString() {
            switch (this) {
                case ACOUSTIC:
                    return "acoustic";
                case ELECTRIC:
                    return "electric";
                default:
                    return "";
            }
        }
    }

    public enum Builder {
        FENDER;

        @Override
        public String toString() {
            switch (this) {
                case FENDER:
                    return "fender";
                default:
                    return "";
            }
        }
    }

    public enum Wood {
        ALDER;

        @Override
        public String toString() {
            switch (this) {
                case ALDER:
                    return "alder";
                default:
                    return "";
            }
        }
    }

    public enum Style {
        A, F;
    }

}
