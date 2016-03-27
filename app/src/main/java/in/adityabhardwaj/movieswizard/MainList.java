package in.adityabhardwaj.movieswizard;

import java.io.Serializable;

/**
 * Created by Aditya on 28-03-2016.
 */

public class MainList implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
