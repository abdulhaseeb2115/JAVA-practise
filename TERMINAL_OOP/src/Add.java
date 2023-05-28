import java.io.Serializable;

class Add extends Operands implements Instructions,Serializable{

    Add(int a, int b) {
        setAB( a, b );
    }

    public int execute(){ return this.a + this.b; }
    public String toString(){ return " + "; }
}