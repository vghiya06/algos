public class bubblesort{
	public static void main(String args[]){
		int a[]={9,2,5,3,1};
		int n=a.length;
		int i,j,temp;
		boolean swap=true;
i=0;
while(swap==true){
	swap=false;
	for(i=0;i<(n-1);i++){
		if(a[i+1]<a[i]){
			temp=a[i+1];
			a[i+1]=a[i];
			a[i]=temp;
			swap=true;
		}

}
}

for (i=0;i<n;i++){
System.out.print(a[i]+" ");

System.out.println();

}

	}
}