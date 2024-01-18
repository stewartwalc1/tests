public class Main {
    public static void main(String[] args){
        //single inheritance example
        //Singletwo a = new Singletwo();
        //a.print_red();
        //a.print_hawks();

        //multilevel inheritance example
        //Multithree b = new Multithree();
        //b.print_red();
        //b.print_hawks();
        //b.print_forlife();

        //hierarchical example
        //B obj_B = new B();
        //obj_B.print_A();
        //obj_B.print_B();

        //C obj_C = new C();
        //obj_C.print_A();
        //obj_C.print_C();

        //D obj_D = new D();
        //obj_D.print_A();
        //obj_D.print_D();

        //Multiple Inheritance Example
        child c = new child();
        c.print_red();
        c.print_hawks();
        c.print_red();
        c.show();

    }
}