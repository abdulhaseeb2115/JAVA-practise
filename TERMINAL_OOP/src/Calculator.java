import java.io.Serializable;
import java.util.ArrayList;

class Calculator implements Serializable{

    ArrayList<Instructions> history = new ArrayList<>();

    int add(int a, int b) {
        Add r = new Add(a, b);
        history.add(r);
        return r.execute();
    }

    int sub(int a, int b) {
        Sub r = new Sub(a, b);
        history.add(r);
        return r.execute();
    }

    public String toString() {
        String r = "";
        
        for (int i = 0; i < history.size(); i++) {
            Operands o = (Operands)(history.get(i));
            r +="" + o.getA()+ o + o.getB() + " = "+ ((Instructions)o).execute()+"\n";            
        }

        return r;
    }

	public boolean loadHistory() {
		// TODO Auto-generated method stub
		return false;
	}

	public void clearHistory() {
		// TODO Auto-generated method stub
		
	}

	public void storeHistory() {
		// TODO Auto-generated method stub
		
	}
}