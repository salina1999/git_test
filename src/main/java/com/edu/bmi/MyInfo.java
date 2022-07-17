package com.edu.bmi;
 
import java.util.ArrayList;
 
//-------------------------------------------------------------------------------------------------
// ���� ����
//-------------------------------------------------------------------------------------------------
public class MyInfo {
 
    private    String                name;    // �̸�
    private    double                height;    // Ű
    private    double                weight;    // ������
    private    ArrayList<String>    hobby;    // ���
    
    private    BMICalculator        bmiCalculator;
    
    public void bmiCalculate() {
        bmiCalculator.bmiCalculate(weight, height);
    }
    
    public void getInfo() {
        System.out.println("��  �� : " + name);
        System.out.println("Ű     : " + height);
        System.out.println("������ : " + weight);
        System.out.println("��  �� : " + hobby);
        
        // BMI ������ ����Ͽ� ����� �����ش�.
        bmiCalculate();
    }
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getHeight() {
        return height;
    }
 
    public void setHeight(double height) {
        this.height = height;
    }
 
    public double getWeight() {
        return weight;
    }
 
    public void setWeight(double weight) {
        this.weight = weight;
    }
 
    public ArrayList<String> getHobby() {
        return hobby;
    }
 
    public void setHobby(ArrayList<String> hobby) {
        this.hobby = hobby;
    }
 
    public BMICalculator getBmiCalculator() {
        return bmiCalculator;
    }
 
    public void setBmiCalculator(BMICalculator bmiCalculator) {
        this.bmiCalculator = bmiCalculator;
    }
 
    @Override
    public String toString() {
        return "���� �ǰ� ���� [name=" + name + ", height=" + height + ", weight=" + weight + ", hobby=" + hobby
                + ", bmiCalculator=" + bmiCalculator + "]";
    }
} // End - public class MyInfo


















