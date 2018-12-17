package com.company;

import java.util.Scanner;

public class runner {

    public static void main(String[] args) {
        DailySchedule today = new DailySchedule();
        Scanner in = new Scanner(System.in);
        System.out.println("Insert appointment info.");
        String Appointment = in.nextLine();
        conflict = today.conflictsWith(Appointment);
        while (conflict == true)
        {
            System.out.println("Your apppointment conflicts with your schedule");
            today.clearConflicts(Appointment);
            System.out.println("Apppointments that conflict with " + Appointment + " have been removed.");
            conflict = today.conflictsWith(Appointment);
        }
        System.out.println("No conflicting appointments.");
    }
}
