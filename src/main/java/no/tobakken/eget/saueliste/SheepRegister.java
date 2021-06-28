package no.tobakken.eget.saueliste;

import no.tobakken.eget.saueliste.dao.SheepDAO;

import java.io.File;
import java.util.ArrayList;

public class SheepRegister {
    private final ArrayList<Sheep> REGISTER;
    private final SheepDAO DAO;
    private final static File saveLocation = new File("src/main/resources/Saueliste.csv");

    public SheepRegister(){
        this.REGISTER = new ArrayList<>();
        this.DAO = new SheepDAO();
        fillRegister();
    }

    public void addSheep(String number, boolean alive, String comment){
        REGISTER.add(new Sheep(number, alive, comment));
    }

    public ArrayList<Sheep> getREGISTER() {
        return REGISTER;
    }

    public File getSaveLocation() {
        return saveLocation;
    }

    public void fillRegister(){
        DAO.fillRegisterFromCSV(this);
    }

    public Sheep searchNumber(String number){
        for (Sheep s: REGISTER){
            if (s.getNumber().equalsIgnoreCase(number)){
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String msg = "";
        for (Sheep s: REGISTER){
            msg = s.getNumber() + " " + s.getComment();
        }
        return msg;
    }
}
