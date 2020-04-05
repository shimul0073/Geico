package getCode.Geico;

import java.io.IOException;
import java.util.ArrayList;

import ins.geico.management.DataDriven;

public class TestSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataDriven d= new DataDriven();
		ArrayList data=d.getData("HomePageLogin");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		
		
	}

}
