 class MergeSort{
	 void merge(int[] arr,int p, int q, int r){

		int n1,n2,i,j,k;

		n1=q-p+1; n2=r-q;

		int L[]=new int[n1];
		int R[]=new int[n2];

		for (i=0;i<n1;i++)
			L[i]=arr[p+i];
		for (i=0;i<n2;i++)
			R[i]=arr[i+q+1];
		i=0;j=0;k=p;

		while(i<n1 && j<n2){

			if(L[i]<=R[j]){
				arr[k]=L[i];
				i++;
			}

			else{
				arr[k]=R[j];
				j++;
			}

			k++;
		}

		while(i<n1){
			arr[k]=L[i];
			i++;
			k++;
		}

		while(j<n2){
			arr[k]=R[j];
			j++;
			k++;
		}


}
	void sort(int[] arr,int p, int r){

if(p<r){
	int q=(p+r)/2;
	sort(arr,p,q);
	sort(arr,q+1,r);
	merge(arr,p,q,r);
	}

}

public static void main(String args[]){

	int arr[]={9,3,82,10,27,38,43};

    int i;
	MergeSort first=new MergeSort();
	first.sort(arr,0,arr.length-1);
for(i=0;i<arr.length;i++){
	System.out.print(arr[i]+" ");
}

}
}


