package no.tobakken.eget.saueliste.singleton;

import no.tobakken.eget.saueliste.Sheep;
//import no.tobakken.eget.saueliste.SheepKotlin;

public final class SheepHolder {
    private Sheep sheep;
    private final static SheepHolder INSTANCE = new SheepHolder();

    private SheepHolder() {}

    public static SheepHolder getInstance() {
        return INSTANCE;
    }

    public void setSheep(Sheep u) {
        this.sheep = u;
    }

    public Sheep getUser() {
        return this.sheep;
    }
}
