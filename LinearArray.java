
public class LinearArray {
	int []a;
	int ele;
	public LinearArray(int x){
		this.a=new int[x];
		this.ele=0;
	}
	public void InsertLast(int y){
		if(ele==a.length)
			System.out.print("full");
		else{
			if(a[ele]==0){
				a[ele]=y;}
			else{
				a[ele]=y;}
			ele++;}}
	public void InsertFirst(int z){
		if(ele>0){
			for(int i=ele-1;i>=0;i--){
				a[i+1]=a[i];}
			}

				a[0]=z;
				ele++;}
	public int LinearSearch(int x){
		for(int i=0;i<a.length;i++){
			if(a[i]==x){

				return i;}}
		return -1 ;}
	public void Delete(int x){
		int pos =this.LinearSearch(x);
		if (pos==-1)
			System.out.println("false");
		else{
		for(int i=pos;i<ele;i++){
			a[i+1]=a[i];
			pos=i;}

		a[pos]=0;
		ele--;}}
   public void DisplayArray(){
	   for(int i=0;i<a.length;i++){
		   System.out.print(a[i]+" ");
	   }
   }
   public void ELE(){
	  System.out.println(ele);
   }
			public static void main(String[]args){
				LinearArray a=new LinearArray(10);

				a.InsertFirst(9);
				a.InsertLast(8);
				a.InsertFirst(6);
				a.LinearSearch(8);

				a.ELE();
				a.DisplayArray();
				a.Delete(6);

			}
}
