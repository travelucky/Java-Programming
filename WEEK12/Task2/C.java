package Task2;

public class C {
    private boolean x;
    public boolean xx;
    public static void main(String[] args) {
        C object1 = new C();
        System.out.println(object1.x);
        System.out.println(object1.convert());
    }
    private int convert(){
        return x ? 1 : -1;
    }
    public int Convert(){
        return xx ? 1 :-1;
    }
}
