public class binaryadd{
public static void main (String[] args){

int arr1[]={1,0,1,1,1}, arr2[]={0,1,1,1,1};
int res[]=new int[6];
int i,j,n,sum,carry,add;

n=arr1.length; carry=0;

for(j=n-1;j>=0;j--){


add=arr1[j]+arr2[j]+carry;

if(add==0){
res[j+1]=0;
carry=0;
}

if(add==1){
res[j+1]=1;
carry=0;
}

if(add==2){
res[j+1]=0;
carry=1;
}

if(add==3){
res[j+1]=1;
carry=1;
}

}

res[0]=carry;

for(i=0;i<=n;i++)
System.out.print(res[i]+" ");

System.out.println();

}
}


