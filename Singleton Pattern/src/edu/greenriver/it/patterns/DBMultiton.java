package edu.greenriver.it.patterns;

import java.util.HashMap;
import java.util.Map;

public class DBMultiton {
	
	//fields
	private String host;
	private String user;
	private String password;
	private String dbName;
	
	//multiton
	private static Map<String, DBMultiton> instances = new HashMap<String, DBMultiton>();
	private static String[] vaildNames = {"primary", "secondary", "third-party"};
	
	//prevent instantiation
	private DBMultiton(){
		//do nothing
		
	}
	
	public static DBMultiton getInstance(String.name){
		
		//validate the name given
		boolean food = false;
		for (int i = 0; i < validNames.length; i++){
				
		if(name.equals(valideNames[i])) {
			found = true;
			break;
		}
	}
		if (!found){
			throw new IllegalArgumentException("named multiton not found!");
		}
	
	//check whether the object is created yet or not?
		if (!instances.containsKey(name)){
			//here it would bread if using threads 
			instances.put(name, new DBMultiton());
		}
	
	//return the object
		return instances.get(name);
	}
	
	

}
