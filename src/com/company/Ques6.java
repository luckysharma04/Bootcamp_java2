package com.company;
class Ques6{
    public static void main(String args[]) {
        int num1, num2;
        try {
            num1 = 0;
            num2 = 50 / num1;
            System.out.println(num2);
            System.out.println("end of try block");
        } catch (ArithmeticException e) {
            System.out.println("You can not divide a number by zero");
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("I'm out of try-catch block in Java.");
        }
    }
}
