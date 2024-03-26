package com.java.classPractise;

public class Teacher {

    String teacherName;
    String teacherSubject;
    String className;

    public Teacher(String teacherName,String teacherSubject, String className){
        this.teacherName = teacherName;
        this.teacherSubject = teacherSubject;
        this.className = className;
    }

    public void classTeacherOf(){
        System.out.println(teacherName+" is Class Teacher of "+className+" Class");
    }

    public void teachingSubject(){
        System.out.println(teacherName+" teaches "+teacherSubject+" for "+className+" Class students");
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Abilash","Mathematics","TENTH");
        Teacher teacher2 = new Teacher("Avinash","General Science","EIGHTH");

        teacher1.classTeacherOf();
        teacher1.teachingSubject();
        teacher2.classTeacherOf();
        teacher2.teachingSubject();

    }
}
