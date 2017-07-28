package chapter24_day01.demo5_more_state_more;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {

	public static Map<String, Object> backupProp(Object bean) {
		Map<String, Object> result = new HashMap<>();

		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor descriptor : descriptors) {
				String name = descriptor.getName();
				Method getter = descriptor.getReadMethod();
				Object fieldValue = getter.invoke(bean, new Object[] {});
				if (name.equalsIgnoreCase("class")) {
					result.put(name, fieldValue);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public static void restoreProp(Object bean, Map<String, Object> propMap) {

		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor descriptor : descriptors) {
				String name = descriptor.getName();

				if (propMap.containsKey(name)) {
					Method setter = descriptor.getWriteMethod();
					setter.invoke(bean, new Object[] { propMap.get(name) });
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
