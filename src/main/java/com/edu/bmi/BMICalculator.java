package com.edu.bmi;
 
//-------------------------------------------------------------------------------------------------
// BMI (Body Mass Index : ü���� ����) ����
// �񸸵� ����(BMI����)
// BMI�� �̿��� �񸸵� ����� �ڽ��� �����Ը� Ű�� �������� ������ ������ ������ kg/��.
// BMI�� 18.5 ���ϸ� ��ü�� �� 18.5 ~ 22.9 ���̸� ���� �� 23.0 ~ 24.9 ���̸� ��ü�� �� 25.0 �̻���ʹ� ������ ����.
// ex) Ű 170���� ������ 73kg�̸�, ���� : 73 / (1.7��1.7) = 25.26 �� ��ü��
//-------------------------------------------------------------------------------------------------
public class BMICalculator {
 
    // ü���� ��꿡 ������ �Ǵ� ������
    private    double    lowWeight;        // ��ü��
    private    double    normal;            // ����
    private    double    overWeight;        // ��ü��
    private    double    obesity;        // ��
    
    public void bmiCalculate(double weight, double height) {
        double    h        = height * 0.01;
        double    result    = weight / (h*h);
        
        System.out.println("BMI ���� : " + (int)result);
        
        if(result > obesity) {
            System.out.println("���Դϴ�.");
        } else if(result > overWeight) {
            System.out.println("��ü���Դϴ�.");
        } else if(result > normal) {
            System.out.println("�����Դϴ�.");
        } else {
            System.out.println("��ü���Դϴ�.");
        }
    }
    
    public double getLowWeight() {
        return lowWeight;
    }
    public void setLowWeight(double lowWeight) {
        this.lowWeight = lowWeight;
    }
    public double getNormal() {
        return normal;
    }
    public void setNormal(double normal) {
        this.normal = normal;
    }
    public double getOverWeight() {
        return overWeight;
    }
    public void setOverWeight(double overWeight) {
        this.overWeight = overWeight;
    }
    public double getObesity() {
        return obesity;
    }
    public void setObesity(double obesity) {
        this.obesity = obesity;
    }
    
    @Override
    public String toString() {
        return "BMICalculator [lowWeight=" + lowWeight + ", normal=" + normal + ", overWeight=" + overWeight
                + ", obesity=" + obesity + "]";
    }
} // End - public class BMICalculator





