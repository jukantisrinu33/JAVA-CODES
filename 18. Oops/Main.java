//Understanding Constructors

class Main {
    public static void main(String[] args) {
        Print p1 = new Print();
        p1.num = 20;
        Print p2 = new Print(p1);
        p1.num = 10;
        System.out.println(p2.num);
        System.out.println(p1.num);
    }
}

class Print {
    int num;

    Print(Print object) {
        this.num = object.num;

    }

    Print() {

    }

}