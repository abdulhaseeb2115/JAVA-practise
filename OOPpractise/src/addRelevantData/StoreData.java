package addRelevantData;

public class StoreData {
	Storage st = new Storage();

	StoreData() {
		System.out.println("----DATA STORAGE----");
	}

	public void AddBoolean(boolean b) {
		if (this.st.b_index != this.st.b.length) {
			this.st.b[this.st.b_index] = b;
			this.st.b_index++;
		} else {
			System.out.println("Boolean Memory Full...!");
		}
	}

	public void AddChar(char c) {
		if (this.st.c_index != this.st.c.length) {
			this.st.c[this.st.c_index] = c;
			this.st.c_index++;
		} else {
			System.out.println("Char Memory Full...!");
		}
	}

	public void AddDouble(double d) {
		if (this.st.d_index != this.st.d.length) {
			this.st.d[this.st.d_index] = d;
			this.st.d_index++;
		} else {
			System.out.println("Double Memory Full...!");
		}
	}

	public void AddInt(int i) {
		if (this.st.i_index != this.st.i.length) {
			this.st.i[this.st.i_index] = i;
			this.st.i_index++;
		} else {
			System.out.println("Int Memory Full...!");
		}
	}

	public void AddString(String s) {
		if (this.st.s_index != this.st.s.length) {
			this.st.s[this.st.s_index] = s;
			this.st.s_index++;
		} else {
			System.out.println("String Memory Full...!");
		}
	}

	public void DisplayBoolean() {
		System.out.println("\n[BOOLEAN DATA]");
		for (int x = 0; x < this.st.b_index; x++) {
			System.out.println("> " + this.st.b[x]);
		}
	}

	public void DisplayChar() {
		System.out.println("\n[CHAR DATA]");
		for (int x = 0; x < this.st.c_index; x++) {
			System.out.println("> " + this.st.c[x]);
		}
	}

	public void DisplayDouble() {
		System.out.println("\n[DOUBLE DATA]");
		for (int x = 0; x < this.st.d_index; x++) {
			System.out.println("> " + this.st.d[x]);
		}
	}

	public void DisplayInt() {
		System.out.println("\n[INT DATA]");
		for (int x = 0; x < this.st.i_index; x++) {
			System.out.println("> " + this.st.i[x]);
		}
	}

	public void DisplayString() {
		System.out.println("\n[STRING DATA]");
		for (int x = 0; x < this.st.s_index; x++) {
			System.out.println("> " + this.st.s[x]);
		}
	}

	public static void main(String[] args) {
		StoreData obj = new StoreData();
		obj.AddInt(10);
		obj.AddInt(20);
		obj.AddInt(30);
		obj.DisplayInt();

		obj.AddString("Haseeb");
		obj.AddString("Mateen");
		obj.AddString("Rehman");
		obj.DisplayString();

		obj.AddChar('a');
		obj.AddChar('b');
		obj.AddChar('c');
		obj.DisplayChar();

		obj.AddBoolean(true);
		obj.AddBoolean(false);
		obj.AddBoolean(true);
		obj.DisplayBoolean();

		obj.AddDouble(24.5);
		obj.AddDouble(25.6);
		obj.AddDouble(26.7);
		obj.DisplayDouble();
	}

}
