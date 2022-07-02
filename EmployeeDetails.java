import java.io.*;
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.name= "Anagha";
		e.Adress = "Bengalurur";
		
		try {
			FileOutputStream f = new FileOutputStream("C:\\Users\\aks43\\Desktop\\Git\\Serialization\\Example.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(e);
			o.close();
			f.close();
			System.out.println("stream of bytes printed successfully");
		}catch(Exception ex) {
			System.out.println("try with different method " + ex);
		}

	}

}
