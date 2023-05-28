import java.io.Serializable;

class Operands implements Serializable{

    protected int a;
    protected int b;

    public int getA() { return a; }
    public int getB() { return b; }
    public void setAB(int a, int b) { this.a = a;  this.b = b; }
}