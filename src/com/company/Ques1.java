package com.company;
import java.util.*;
import java.util.Scanner;
abstract class Library
{
    abstract void showBooks();
}
class Book extends Library
{
    String name;
    String author;
    public Book(String name,String author)
    {
        this.name=name;
        this.author=author;
    }
    public void showBooks()
    {
        System.out.println("Book :"+this.name + " Author :"+this.author);
    }
}
interface PrintEmployee
{
    void print();
}
class Employee implements PrintEmployee
{
    String name;
    public Employee(String name)
    {
        this.name=name;
    }
    public void print()
    {
        System.out.println(name);
    }
}
public class Ques1{
    public static void main(String args[]){
        Book b=new Book("Core Java","Cay S. Horstmann");
        Employee emp=new Employee("Lucky");
        emp.print();
        b.showBooks();
    }
}