package com.java.classPractise;

public class Student {

    String studentName;
    String studentRollNo;
    int studentAge;
    String classNum;
    String favFood;
    String nativeLanguage;

    public Student(String studentName,String studentRollNo,int studentAge,
                   String classNum,String favFood,String nativeLanguage){
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentAge = studentAge;
        this.classNum = classNum;
        this.favFood = favFood;
        this.nativeLanguage = nativeLanguage;
    }

    public void displayStudentInfo(){
        System.out.println(studentName+" bearing Roll No:  "+studentRollNo+
                " is student of "+classNum+" and aged :"+studentAge);
    }
    public void eat(){
        System.out.println(studentName+" is student of "+classNum+" and his fav food is :"+favFood);
    }
    public void talk(){
        System.out.println(studentName+" bearing Roll No:  "
                +studentRollNo+" & his Mother Tongue is "+nativeLanguage);
    }


    public static void main(String[] args) {
        Student student1 = new Student("Abilash","A0501",
                20,"Tenth","Biryani","Telugu");

        Student student2 = new Student("Avinash","A0509",
                21,"Tenth","Pasta","Tamil");

        student1.displayStudentInfo();
        student1.eat();
        student1.talk();

        student2.displayStudentInfo();
        student2.eat();
        student2.talk();

    }

}
