package javax.xml.bean;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for BeanIntrospector.
 */
public class BeanInstrospectorTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public BeanInstrospectorTest(String testName) {
		super(testName);
	}

	@Test
	public void testGetPropertiesDescriptorsLength(){
		final Employee employee = new Employee();
		final BeanIntrospector<Employee> beanIntrospector = new BeanIntrospector<Employee>();
		try {
			PropertyDescriptor[] propertyDescriptors = beanIntrospector.getBeanProperties(employee);
			int totalProperties = propertyDescriptors.length;
			Assert.assertEquals(5, totalProperties);
		} catch (IntrospectionException e) {
			Assert.fail();
		}
	}
}
