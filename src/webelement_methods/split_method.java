package webelement_methods;

public class split_method {
	
	public static void main(String[] args) {
		String name="Velocity_Corporate_Training_Center";
		
		String names[]=name.split("_");
		
		for(int i=0;i<=3;i++)
		{
		System.out.println(names[i]);
		}
		}
}
