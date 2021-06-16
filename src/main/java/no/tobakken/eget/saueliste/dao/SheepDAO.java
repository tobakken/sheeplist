package no.tobakken.eget.saueliste.dao;

import no.tobakken.eget.saueliste.SheepRegister;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class SheepDAO {
    public final String DELIMITER = ";";

    public SheepDAO(){

    }
    public void fillRegisterFromCSV(SheepRegister reg){
        String line;
        try (FileInputStream fileInputStream = new FileInputStream(reg.getSaveLocation());
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(inputStreamReader)){
            while ((line = br.readLine()) != null){
                String[] sheep = line.split(DELIMITER);
                reg.addSheep(sheep[0], sheep[1].equals("true"), sheep[2]);
                System.out.println(reg.toString());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void saveToCSV(SheepRegister reg){
        try (OutputStream os = new FileOutputStream(reg.getSaveLocation());
             PrintWriter pw = new PrintWriter(new OutputStreamWriter(os, "UTF-8"))){
            reg.getREGISTER().stream().map(s -> s.convertToCSV()).forEach(pw::println);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
