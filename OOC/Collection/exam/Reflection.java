package socket;
import java.lang.reflect.*;

public class Reflection {
	
	public static void main(String[] args) {
				
				
				Class server=Server.class;
				System.out.println("Class: "+server.getName());
				System.out.println("");
				
				
				
				Method[] methods=server.getDeclaredMethods();
				System.out.println("Methods: ");
				for(Method method:methods) {
					Parameter[] parameters=method.getParameters();
					System.out.print(method.getReturnType()+"\t"+method.getName()+"\t(");
					for(Parameter parameter: parameters) {
						System.out.print(parameter.getType()+"  "+parameter.getName()+", ");
					}
					
				}
			
				
				Field[] fields=server.getDeclaredFields();
				System.out.println("Fields: ");
				for(Field field:fields) {
					System.out.println(field.getType()+"\t"+field.getName());
				}
				System.out.println("");
				
				Constructor[] constructors=server.getDeclaredConstructors();
				System.out.println("Constructors: ");
				for(Constructor constructor:constructors) {
					Parameter[] parameters=constructor.getParameters();
					System.out.print(constructor.getName()+"\t(");
					for(Parameter parameter: parameters) {
						System.out.print(parameter.getType()+"  "+parameter.getName()+", ");
					}
				}
				
				


		
	}

}
