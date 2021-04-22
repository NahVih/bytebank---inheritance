package au.com.bytebank.bank.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import au.com.bytebank.bank.main.RegularEmployee;

public class SerializationTryRead {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("regularEmployee.bin"));
			RegularEmployee regularEmployee = (RegularEmployee) ois.readObject();
			ois.close();
			System.out.println("Name:" + regularEmployee.getName()+ " Job:"+regularEmployee.getJob()+" TFN:"+regularEmployee.getTfn());

	}

}
