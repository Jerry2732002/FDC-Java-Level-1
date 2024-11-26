package src;

import src.week_one.day_one.Palindrome;
import src.week_one.day_two.OOPs01;
import src.week_one.day_two.oops_02.FuelType;
import src.week_one.day_two.oops_02.Type;
import src.week_one.day_two.oops_02.Vehicle;


public class Main {
    public static void main(String[] args) {
        OOPs01 obj = new OOPs01();
        obj.useEmployee();


        Vehicle vehicle1 = new Vehicle(Type.LMV, 10000);
        Vehicle vehicle2 = new Vehicle(Type.HMV, FuelType.PETEROL, 14200400.432);
        Vehicle vehicle3 = new Vehicle(Type.FOUR_WHEELER,FuelType.PETEROL,"Sedan","City",1000000.12);

        vehicle1.printDetails();

        vehicle2.printDetails();

        vehicle3.printDetails();


    }
}


