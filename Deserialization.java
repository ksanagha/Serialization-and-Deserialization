import java.io.*;

public class Deserialization {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Employee emp = null;
		try {
			FileInputStream f =new FileInputStream("C:\\Users\\aks43\\Desktop\\Git\\Serialization\\Example.txt");
			ObjectInputStream o = new ObjectInputStream(f);
			emp = (Employee) o.readObject();
			o.close();
			f.close();
			
		}finally {
			System.out.println("Desirealization is successfull...");
			System.out.println("Name of employee " + emp.name);
			System.out.println("Address of employee " + emp.Adress);
		}

	}

}
