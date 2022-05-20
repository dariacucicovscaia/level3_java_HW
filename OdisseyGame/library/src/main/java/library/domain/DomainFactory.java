package library.domain;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DomainFactory {

	public static Component create(String fqcn) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Component component = null;
		String FQCN = "library.domain." + fqcn;

		ClassLoader classLoader = DomainFactory.class.getClassLoader();
		Class<Component> clazz = (Class<Component>) classLoader.loadClass(FQCN);
		Constructor<Component> constructor = clazz.getConstructor();
		component = (Component) constructor.newInstance();
		return component;
	}
}