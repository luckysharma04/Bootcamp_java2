package com.company;

class candidate implements Cloneable{
    int ID;
    String name;
    candidate(int ID,String name){
        this.ID=ID;
        this.name=name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]){
        try{
            candidate s1=new candidate(100,"lucky");
            candidate s2=(candidate)s1.clone();

            System.out.println(s1.ID+" "+s1.name);
            System.out.println(s2.ID+" "+s2.name);

        }catch(CloneNotSupportedException c){}

    }
}
