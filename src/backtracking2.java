public class backtracking2 {
	
	public static boolean ind_set (int[][] G, int m, int n) {
//		Instantiate array to hold independent set.
		int[] independent = new int[n];
//		Check each vertex G[i] to see if it is the first node in an independent set.
		for (int i = 0; i < n; i++) {
//			Set the current node G[i] in the independent set to 1, others 0.
			for (int k = 0; k < n; k++) {
				independent[k] = 0;
			}
			independent[i] = 1;
//			Recursive function to create DFS into G[i]'s non-adjacent nodes.
//			If a set is found, print it.
			if (rind_set(G, m, n, independent, i)) {
				for (int k = 0; k < n; k++) {
					System.out.print(independent[k]);
				}
				System.out.println();
				return true;
			}
		}
		return false;
	}

	private static boolean rind_set (int[][] G, int m, int n, int[] independent, int i) {
//		For checking the size of the current independent set.
		int sum = 0;
//		Compare G[i] to G[i+1...n] and look for nodes to add to independent set.
		for (int j = i + 1; j < n; j++) {
			if (ind_ok(G, n, independent, i, j)) {
//				Found an independent node, add it to the set.
//				If there are m nodes in the set, stop.  Otherwise, recurse on non-adjacent nodes.
				independent[j] = 1;
				for (int k = 0; k < n; k++) {
					if (independent[k] == 1) {
						sum++;
					}
				}
				if (sum == m) {
					return true;
				}
				else {
					return rind_set(G, m, n, independent, j);
				}
			}
		}
		return false;
	}

	private static boolean ind_ok (int[][] G, int n, int[] independent, int i, int j) {
//		Is the new node NOT adjacent to the parent node?
		if ((G[i][j]) == 0) {
//			Is new new node NOT adjacent to all other nodes in the independent set?
			for (int k = 0; k < n; k++) {
				if ((G[k][j] == 1) && (independent[k] == 1)) {
//					The new node is adjacent to another node in the independent set, don't add it.
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
//		Set up variables.
		int[][] G = new int[][] 
				{{0, 1, 1, 0, 0, 0},
		         {1, 0, 0, 1, 0, 0},
		         {1, 0, 0, 1, 0, 1},
		         {0, 1, 1, 0, 1, 0},
		         {0, 0, 0, 1, 0, 1},
		         {0, 0, 1, 0, 1, 0}};
		int n = G.length;
		int m = 3;
//		Call the initial function.
		System.out.println(ind_set(G, m, n));
	}

}
