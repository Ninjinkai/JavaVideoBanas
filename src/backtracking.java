
public class backtracking {
	
	public static int[] rBacktrack (int[][] G, int i, int n) {
		int[] A = new int[n];
		for (int j = 0; j < n; j++) {
			if (G[i][j] == 0) {
				A[j] = 1;
			}
			else {
				A[j] = 0;
			}
		}
		return A;
	}
	
	public static int[] backtrack (int G[][], int n, int A[]) {
		for (int k = 0; k < n; k++) {
			if (A[k] == 1) {
				int B[] = rBacktrack(G, k, n);
				for (int j = k; j < n; j++) {
					if (A[j] == 1 && B[j] == 1) {
						A[j] = 1;
					}
					else {
						A[j] = 0;
					}
				}
			}
		}
		return A;
	}
	
	public static int[] bound (int[][] G, int m, int n) {
		int[] C = new int[n];
		int[] A;
		int x;
		for (int k = 0; k < n; k++) {
			A = rBacktrack(G, k, n);
			A = backtrack(G, n, A);
			x = 0;
			for (int i = 0; i < n; i++){
				if (A[i] == 1) {
					x++;
				}
			}
			if (m == x) {
				C = A;
				break;
			}
		}
		return C;
	}

	public static void main(String[] args) {
		int[][] G = new int[][] 
				{{0, 1, 1, 0, 0, 0},
		         {1, 0, 0, 1, 0, 0},
		         {1, 0, 0, 1, 0, 1},
		         {0, 1, 1, 0, 0, 0},
		         {0, 0, 0, 0, 0, 1},
		         {0, 0, 1, 0, 1, 0}};
		int n = G.length;
		int m = 3;
		int[] out = new int[n];
		out = bound(G, m, n);
		for (int i = 0; i < n; i++) {
			System.out.print(out[i]);
		}
	}

}
