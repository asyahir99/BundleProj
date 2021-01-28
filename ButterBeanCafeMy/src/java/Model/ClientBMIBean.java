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
public class ClientBMIBean implements Serializable {
    private String name;
    private int yob;
    private double weight;
    private double height;
    private int age;
    private double BMI;
    private String category;

//    public ClientBMIBean(){}
    
    public ClientBMIBean() {
    }
    
    public void calculateAll(){
        age = 2020 - yob;
        BMI = weight/(height*height);
        if (BMI < 18.0){
            category = "underweight";
        }
        else {
            category = "undefined yet";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    

    
}
