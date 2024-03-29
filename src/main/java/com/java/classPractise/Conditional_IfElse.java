package com.java.classPractise;

public class Conditional_IfElse {
    public static void main(String[] args) {
       String status = getDetails(25,"male");
        System.out.println(status);
    }

    public static String getDetails(int age,String gender){
        String status = null;
        if(age > 0 && age < 18){
            if(gender == "male"){
                status = "boy";
            } else {
                status = "girl";
            }
        }
        else if(age >= 18 && age < 60){
            if(gender == "male"){
                status = "man";
            } else {
                status = "woman";
            }
        }
        else if(age > 60 ){
            if(gender == "male" || gender == "female"){
                status = "Senior Citizen";
            }
        }

        return status;
    }
}
