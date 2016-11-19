package javax.xml.bean;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * @author sandesh mutha<mailto:mutha.sandesh@gmail.com>.
 * This class lists down all the properties of the bean class.
 */
public class BeanIntrospector<T extends Object> {
	public PropertyDescriptor[] getBeanProperties(final T bean) throws IntrospectionException {
		final BeanInfo beanProperties = Introspector.getBeanInfo(bean.getClass());
		return beanProperties.getPropertyDescriptors();

	}
}
