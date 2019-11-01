package sort;



import java.util;

public class Sort {
	static int[] sortmethod(int[] li) {
		int temp=0;
		for(int i=1;i<li.length;i++) {
			for(int j=0;j<li.length-i;j++) {
				if(li[j]>li[j+1]) {
					temp=li[j];
					li[j]=li[j+1];
					li[j+1]=temp;
				}
			}
		}
		
		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {2,5,34,0,-1,7,-23};
		int res[]=sortmethod(ar);
		System.out.println(java.util.Arrays.toString(res));
	}

}
