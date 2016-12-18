import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GCDGraph {

	public String possible(int n, int k, int x, int y) {
		LinkedList<Integer> adj[] =  new LinkedList[n + 1];
		for (int i = 1; i < n + 1; ++i)
			adj[i] = new LinkedList();

		for (int i = 1; i < n + 1 ; i++) {
			for (int j = 1; j < n + 1; j++) {
				if(i != j && gcd(i, j) > k) {
					addEdge(i, j, adj);
				}
			}
		}

		if (x == y) {
			return "Possible";
		}

		Boolean b = checkPath(adj, n, x, y);
		if(b) {
			return "Possible";
		}
		return "Impossible";
	}

	private Boolean checkPath(LinkedList<Integer>[] adj, int n, int x, int y) {
		boolean [] visited = new boolean[ n + 1];
		Arrays.fill(visited, false);
		visited[x] = true;

		Queue<Integer> queue = new LinkedList<>();
		queue.add(x);
		int val;
		while (!queue.isEmpty()) {
			x = queue.poll();
			Iterator<Integer> i = adj[x].iterator();
			while (i.hasNext()) {
				val = i.next();
				if(val == y) {
					return true;
				}
				if(!visited[val]) {
					queue.add(val);
				}
			}
		}
		return false;
	}

	void addEdge(int v,int w, LinkedList<Integer> adj[])  { adj[v].add(w); }
	public int gcd(int a, int b) { return b == 0 ? a : gcd(b, a%b); }
}
