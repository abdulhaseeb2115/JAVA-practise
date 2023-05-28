import java.io.Serializable;

class Sub extends Operands implements Instructions,Serializable{

    Sub(int a, int b) { setAB( a, b );  }

    public int execute(){ return this.a - this.b; }
    public String toString(){ return " - "; }
}