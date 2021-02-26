package com.company;
import java.util.*;
import java.util.Scanner;
interface Furniture {
    public void stressTest();
    public void fireTest();
}
abstract class Chair implements Furniture {
    public abstract String chairType();
}
abstract class Table implements Furniture {
    public abstract String tableType();
}
abstract class MetalChair extends Chair {
    @Override
    public void stressTest() {
    }
    @Override
    public void fireTest() {
    }
}
class MetalTable extends Table {
    @Override
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }
    @Override
    public void fireTest() {
        System.out.println("Passed Fire Test");
    }
    @Override
    public String tableType() {
        String s = "This is a metal Table";
        return s;
    }
}
class WoodenTable extends Table {
    @Override
    public void stressTest() {
        System.out.println("Failed Stress Test");
    }
    @Override
    public void fireTest() {
        System.out.println("Failed Fire Test");
    }
    @Override
    public String tableType() {
        String s = "This is a wooden Table";
        return s;
    }
}
abstract class WoodenChair extends Chair {
    @Override
    public void stressTest() {
    }
    @Override
    public void fireTest() {
    }
}
public class Main {
    public static void main(String[] args){
        Table table = null;
        Scanner input =  new Scanner(System.in);
        String str = input.next();
        if(str.equals("wooden")){
            table = new WoodenTable();

        }   else if (str.equals("metal")){
            table = new MetalTable();

        }
        System.out.println(table.tableType());
        table.stressTest();
        table.fireTest();
    }
}
