import java.lang.reflect.Array;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;

class Node {
	private int parent;

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}
}

public class GCDGraph {
	Node [] nodes;
	public String possible(int n, int k, int x, int y) {
		nodes = new Node[n + 1];
		for (int i = 0; i <= n; i++) {
			nodes[i] = new Node();
			nodes[i].setParent(i);
		}

		for (int i = k + 1; i <= n; ++i) {
			for (int j = i; j <= n; j += i) {
				union(i, j);
			}
		}

		if(find(x) == find(y)) {
			return "Possible";
		}
		else {
			return "Impossible";
		}
	}

	private void union(int i, int j) {
		int f1 = find(i);
		int f2 = find(j);

		if(f1 == f2) {
			return;
		}

		if(f1 > f2) {
			nodes[f2].setParent(f1);
		}
		else {
			nodes[f1].setParent(f2);
		}
	}

	private int find(int x) {
		if(nodes[x].getParent() == x) {
			return x;
		}
		int parent = find(nodes[x].getParent());
		nodes[x].setParent(parent);
		return parent;
	}
}
