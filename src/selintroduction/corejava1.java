package selintroduction;

public class corejava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int mynum = 9 ;
  String website = "Marwan sameh";
  char letter = 'm';
  double dec = 2.3;
	boolean mycard=true;	
	
	System.out.println(mynum+"is the variable store in the mynum variable");
	System.out.println(website);
	//arrays -
	int[] arr= new int[5];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;

	 int[] arr2= {6,7,8,9,5,4,3,2,23,23,45,6767,577,54};
	//for loop arr.length-5
	for(int i=0;i<arr.length;i++) 
	System.out.println(arr[i]);
	
	
	for(int i=0;i<arr2.length; i++)
		System.out.println(arr2[i]);
	
	String[]  name={"marwan","mohmed","ahmed"};
	
	for(int i=0;i<name.length;i++)
	
	System.out.println(name[i]);
	for(String  s:name)
	System.out.println(s);
		
	 	
	
	
	}

}
