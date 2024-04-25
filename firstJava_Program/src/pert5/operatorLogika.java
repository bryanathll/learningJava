package pert5;

public class operatorLogika {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c;

        c=a && b; // && adalah operator AND
        System.out.println("True && False = "+c);

        c=a || b; // || adalah operator OR
        System.out.println("True || False = "+c);

        System.out.println("NOT True = "+ !a); // ! adalah operator NOT
    }
    
}
