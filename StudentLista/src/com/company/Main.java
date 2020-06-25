package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> studenti = new ArrayList<>();
        Student s1 = new Student("Miroslav","Obic", 126,1,"11.03.2004");
        s1.dodajPolozeniIspit(10);
        s1.dodajPolozeniIspit(3);
        s1.dodajPolozeniIspit(6);
        s1.dodajPolozeniIspit(9);
       s1.dodajPolozeniIspit(8);
       studenti.add(s1);

        Student s2 = new Student("Milos","Mangel", 127,3,"16.12.2002");
        s2.dodajPolozeniIspit(10);
        s2.dodajPolozeniIspit(8);
        s2.dodajPolozeniIspit(9);
        s2.dodajPolozeniIspit(9);
        s2.dodajPolozeniIspit(10);
        studenti.add(s2);

        Student s3 = new Student("Mirjana","Mladenovic", 128,4,"21.09.2000");
        s3.dodajPolozeniIspit(10);
        s3.dodajPolozeniIspit(7);
        s3.dodajPolozeniIspit(8);
        s3.dodajPolozeniIspit(9);
        s3.dodajPolozeniIspit(9);
        studenti.add(s3);

        for(Student s : studenti){
          if(s.brucosIliNe()){
              System.out.println("Student je brucos");
          }
          else{
              System.out.println("Prosecna ocena je: "+ s.racunajProsek());
          }
        }


    }
}
