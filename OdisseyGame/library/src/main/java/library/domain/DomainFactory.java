package library.domain;

public class DomainFactory {

	public Object get(String fqcn) {
		Class clazz = null;
		try {
			clazz = Class.forName(fqcn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Object object = null;
		try {
			object = clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return object;
	}

}
