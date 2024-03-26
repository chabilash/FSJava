package com.java.classPractise;

public class DummyRun {
    public static void main(String[] args) {

        School sc1 = new School();
        sc1.schoolName = "Bhavan's";
        sc1.address = "Hyderabad";
        sc1.principal = "Akhil";

        Teacher t1 = new Teacher("Sachin","Sports","TENTH");

        Student s1 = new Student("Umesh","A0599",25,"TENTH","Gol Gappa","HINDI");
        Student s2 = new Student("Ramesh","A0589",24,"NINTH","Pani Puri","KANNADA");
        Student s3 = new Student("Suresh","A0579",23,"EIGHTH","Biryani","MALAYALAM");



    }
}
