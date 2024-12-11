package OOPS_1;

public class Constructor {
    public static void main(String[] args) {
        ComplexNum n1 = new ComplexNum(5,6);
        ComplexNum n2 = new ComplexNum(1,2);
        ComplexNum res = n1.add(n2);
        res.print();
    }
}

class ComplexNum{
    int a,b;

    void print(){
        System.out.println(a + " + " + b + "i");
    }

    ComplexNum(){
        a = 0;
        b = 0;
    }

    ComplexNum(int a, int b){
        // this keyword remove ambiguity
        this.a = a;
        this.b = b;
    }

    ComplexNum add(ComplexNum n2){
        return new ComplexNum(n2.a + a,n2.b+b);
    }
}
