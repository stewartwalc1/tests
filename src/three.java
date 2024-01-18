public interface three extends one,two {

    public void print_red();

    default void show(){

        System.out.println("Show super");
    }
}
