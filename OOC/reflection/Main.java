package reflection;

import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Person p=new Person();

		p.name="Turna";
		p.setAge(22);
		
		Class cls=p.getClass();
		System.out.println("Class name: "+ cls);
		
		System.out.println("All constructor: ");
		Constructor[] constructor=p.getClass().getConstructors();
		for(Constructor c: constructor) {
			System.out.println(c);
		}
		
		Constructor cons=p.getClass().getConstructor();
		System.out.println("Constructor: "+ cons);
		
		Method method=p.getClass().getDeclaredMethod("setAge",int.class);
		System.out.println("Metod: "+ method);
		try {
			method.invoke(p, 13);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(p);
		
		
		
		Method[] methods=p.getClass().getDeclaredMethods();
		System.out.println("All methods: ");
		for(Method m: methods) {
			System.out.println(m);
		}
		
		try {
			Field field=p.getClass().getDeclaredField("age");
			field.setAccessible(true);
			try {
				field.set(p,34);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(p);
		
		Method m3=p.getClass().getDeclaredMethod("method3");
		m3.setAccessible(true);
		try {
			m3.invoke(p);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
