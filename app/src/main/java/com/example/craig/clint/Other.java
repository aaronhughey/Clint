package com.example.craig.clint;

/**
 * Created by Craig on 10/15/2017.
 */

public class Other {
    private String name;
    private String description;

    public static final Other[] others = {
            new Other("ThunderBolt and Lightfoot",
                    "1974\nDisguised as a preacher, Eastwood plays a hard hitting bank robber"),
            new Other("Pink Cadillac",
                    "1989\nBounty hunters and fast cars, Eastwood is right at home"),
            new Other("In the Line of Fire",
                    "1993\nEastwood plays a Secret Service agent racing to stop an assassin."),
            new Other("Gran Torino",
                    "2008\nEastwood seems right at home as a gruff, no-nonsense war vet")
    };

    //Each Other movie has a name and description
    private Other(String name, String description) {
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