package models;
// we want to group out athletes according to activity.
// eg may want to delegate equipment specific to each activity (goggles for swimmers, helmets for cyclists)

import Interfaces.ICycle;
import Interfaces.IRun;
import Interfaces.ISwim;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    private String name;
    private List<ICycle> cyclists;
    private List<IRun> runners;
    private List<ISwim> swimmers;

    public Championship(String name) {
        this.cyclists = new ArrayList<>();
        this.runners = new ArrayList<>();
        this.swimmers = new ArrayList<>();
    }

    public void addSwimmer(ISwim swimmer) {
        this.swimmers.add(swimmer);
    }

    public List<ISwim> getSwimmers() {
        return this.swimmers;
    }
}
