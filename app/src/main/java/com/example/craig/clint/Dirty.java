package com.example.craig.clint;

/**
 * Created by Craig on 10/15/2017.
 */

public class Dirty {
    private String name;
    private String description;

    public static final Dirty[] dirtys = {
            new Dirty("Dirty Harry",
                    "1971\nThe original Dirty Harry\nDo you feel lucky?"),
            new Dirty("Magnum Force",
                    "1973\nHarry's back to dish out vigilante justice\nA man's got to know his limitations"),
            new Dirty("The Enforcer",
                    "1976\nIf you thought Harry was dirty before, wait til he gets a new partner"),
            new Dirty("Sudden Impact",
                    "1983\nThe best cop in the biz is back, and still bitter as ever\nGo ahead, make my day"),
            new Dirty("The Dead Pool",
                    "1988\nHarry finds himself in the midst of a deadly game, but this game's rigged")
    };

    //Each Dirty Harry has a name and description
    private Dirty(String name, String description) {
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