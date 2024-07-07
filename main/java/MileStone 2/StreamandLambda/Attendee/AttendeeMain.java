package Attendee;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class AttendeeMain {

    public static List<Attendee> markGreaterThanParticularValue(List<Attendee> listOfAttendees , int mark){
        return listOfAttendees.stream().filter(a->a.totalMark>mark).collect(Collectors.toList());
    }
    public static int totalMarks(List<Attendee> listOfAttendees){
        return listOfAttendees.stream().map(A->A.totalMark).
        reduce(0, (sum , totalMark)->sum + totalMark);

    }
    // public static
    public static void main(String[] args) {

        Attendee A1 = new Attendee("Ravindran", 20, 50);
        Attendee A2 = new Attendee("Ravichandran", 10, 53);
        Attendee A3 = new Attendee("Zain", 56, 21);
        Attendee A4 = new Attendee("Logesh", 21, 33);
        Attendee A5 = new Attendee("Dhoni", 22, 99);
        Attendee A6 = new Attendee("Humani", 100, 77);
        Attendee A7 = new Attendee("jiji", 89, 50);
        Attendee A8 = new Attendee("Abhishek", 66, 65);

        List<Attendee> listOfAttendees = new ArrayList<>();
        listOfAttendees.add(A1);
        listOfAttendees.add(A2);
        listOfAttendees.add(A3);
        listOfAttendees.add(A4);
        listOfAttendees.add(A5);
        listOfAttendees.add(A6);
        listOfAttendees.add(A7);
        listOfAttendees.add(A8);

        List<Attendee> markGreater = markGreaterThanParticularValue(listOfAttendees , 40);
        markGreater.forEach(a->System.out.println(a.name + " is pased with " +a.totalMark ));
        System.out.println(totalMarks(listOfAttendees));

    }
}
