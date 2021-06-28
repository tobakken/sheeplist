package no.tobakken.eget.saueliste;

import java.util.ArrayList;
import java.util.Objects;

public class Sheep {
    private String number;
    private String lambs;
    private String comment;
    private boolean alive;
    private String weight;
    private int mother;
    private int father;

    public Sheep(String number, boolean alive, String comment){
        this.number = number;
        this.alive = alive;
        this.comment = comment;
    }

    public String getNumber() {
        return number;
    }

    public String getLambs() {
        return lambs;
    }

    public String getComment() {
        return comment;
    }

    public boolean isAlive() {
        return alive;
    }

    public String getWeight() {
        return weight;
    }

    public int getMother() {
        return mother;
    }

    public int getFather() {
        return father;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLambs(String lambs) {
        this.lambs = lambs;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setMother(int mother) {
        this.mother = mother;
    }

    public void setFather(int father) {
        this.father = father;
    }

    public String convertToCSV(){
        return number + ";" +
                alive + ";" +
                comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sheep sheep = (Sheep) o;
        return sheep.number.equalsIgnoreCase(number);
    }
}
