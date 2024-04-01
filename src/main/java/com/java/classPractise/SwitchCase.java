package com.java.classPractise;

public class SwitchCase {

    public static void main(String[] args) {
        SwitchCase sc = new SwitchCase();
        String status = sc.switchCaseGenderDemo(10,"female","unknown");
        System.out.println(status);

    }

    public String switchCaseGenderDemo(int age,String gender,String maritalStatus){
        String status = null;
        switch (gender.toLowerCase()){
            case "male":
                if(age > 0 && age <= 18) {
                    status = "Add prefix as 'Master'";
                } else if(age > 18) {
                    status = "Add prefix as 'Mr.'";
                }
                break;
            case "female":
                if(maritalStatus.equalsIgnoreCase("married")){
                    status = "Add prefix as 'Mrs.'";
                } else if (maritalStatus.equalsIgnoreCase("unmarried")){
                    status = "Add prefix as 'Miss.'";
                } else if (maritalStatus.equalsIgnoreCase("unknown")){
                    status = "Add prefix as 'Ms.'";
                }
                break;
            default:{
                status = "Given Age/Gender/MaritalStatus are incorrect";
            }
        }
        return status;
    }

}
