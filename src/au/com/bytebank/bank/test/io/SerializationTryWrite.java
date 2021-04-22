package au.com.bytebank.bank.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import au.com.bytebank.bank.main.RegularEmployee;

public class SerializationTryWrite {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		RegularEmployee regularEmployee = new RegularEmployee();
			regularEmployee.setName("Vittor");
			regularEmployee.setTfn("12489635790");
			regularEmployee.setJob("Developer");
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("regularEmployee.bin"));
			oos.writeObject(regularEmployee);
			oos.close();

	}

}
