public class Solution {
    public int removeElement(int[] A, int elem) {
        	int start = 0;
	for(int i=0;i<A.length;i++) {
		if(A[i]!=elem) {
			A[start++] = A[i];
		}
	}
	return start;
    }
}
