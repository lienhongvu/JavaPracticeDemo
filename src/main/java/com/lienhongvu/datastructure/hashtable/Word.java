package com.lienhongvu.datastructure.hashtable;

import javax.annotation.Nonnull;

/**
 * Created by hvlien on 9/26/2018.
 */
public class Word {

    private String name;

    public Word(@Nonnull String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        return name != null ? name.equals(word.name) : word.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
