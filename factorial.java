class factorial{
int fact(int x){

	if (x>1)
	return (x*fact(x-1));
	
	else 
	return 1;
}

public static void main(String args[]){
	int x=6;
	factorial first=new factorial();
	int y=first.fact(x);
	System.out.print(y);
}
}