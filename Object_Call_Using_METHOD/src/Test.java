
public class Test 

{

	public static void main(String[] args) 
	
	{
		Teacher teacher1 = new Teacher();
		
		teacher1.Name = " Fahim Sakib";
		teacher1.Gender = "Male";
		teacher1.Phone = 12345678;
		teacher1.ID = 100;
		
		teacher1.Display();
		
		//System.out.println("\n");
		
		Teacher teacher2 =new Teacher();
		
		teacher2.Name = " Fuad Saif";
		teacher2.Gender = "Male";
		teacher2.Phone = 987654321;
		teacher2.ID = 200;
		
		//System.out.println("\n");
		
		teacher2.Display();
		
		Teacher teacher3 =new Teacher();
		
		teacher3.Name = " Toishi";
		teacher3.Gender = "Female";
		teacher3.Phone = 77755431;
		teacher3.ID = 500;
		
		teacher3.Display();
		
		New_Teacher teacher4= new New_Teacher();
		
		teacher4.Name = " Richard Philip";
		teacher4.Gender = "Male";
		teacher4.Address = " Dhanmondi";
		teacher4.ID = 600;
		teacher4.Phone = 4677789;
		teacher4.Email = " richard.philip@gmail.com ";
		teacher4.Course = "Java ";
		teacher4.Review = " Very Good ";
		
		teacher4.Display1();
		
		
		
		
		
		
		
		}

}

