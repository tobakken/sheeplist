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
        fillRegisterWithTestData();
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

    public void fillRegisterWithTestData(){
        addSheep("80184", false, "Lull");
        addSheep("20151", true, "Funne ved Toppen");
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
