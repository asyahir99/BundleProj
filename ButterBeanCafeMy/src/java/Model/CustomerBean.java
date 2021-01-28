/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class CustomerBean implements Serializable {
    private int id;
    private double weight;
    private double height;
    private double bmi;
    private String category;

    public CustomerBean() {
    }
    public CustomerBean(int id, String name, int yob, double Height, double weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.height = Height;
        this.weight = weight;
    }
    
    private String name;
    private int yob;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
     
    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public void calculateBMICategory(){
        bmi = weight/(height*height);
        if (bmi < 18){
            category="underweight";
        }
        else if (bmi <=24.9){
            category="normal";
        }
        else {
            category="overweight";
        }
    }
    
    
}
