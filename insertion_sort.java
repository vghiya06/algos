public class insertion_sort{
public static void main (String[] args){

int arr[]={5,2,4,6,1,3};
int temp,i,j,key;
int n=arr.length;
for (i=1;i<n;i++)
{

key=arr[i];

j=i-1;

while(j>=0 && arr[j]>key){
arr[j+1]=arr[j];
j--;
}
arr[j+1]=key;

}
for (i=0;i<n;i++){
System.out.print(arr[i]+" ");

System.out.println();

}
}
}
