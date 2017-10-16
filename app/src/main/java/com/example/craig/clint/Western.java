package com.example.craig.clint;

/**
 * Created by Craig on 10/15/2017.
 */

public class Western {
    private String name;
    private String description;

    public static final Western[] westerns = {
            new Western("A Fistful of Dollars",
                    "1964\nThe first in a new era of Spaghetti Westerns"),
            new Western("For a Few Dollars More",
                    "1965\nThe Man with No Name returns in one of the best Westerns of the decade"),
            new Western("The Good, the Bad and the Ugly",
                    "1966\nThe final chapter in the Man with No Name's saga")
    };

    //Each Western has a name and description
    private Western(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}