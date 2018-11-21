/**
 * 
 */
package phenomics;

import java.util.Arrays;

import phenomics.tests.ClassSimTest;
import phenomics.tests.IcTest;
import phenomics.tests.ItemSimTest;

/**
 * @author Sebastian Köhler (dr.sebastian.koehler@gmail.com)
 *
 */
public class TestSetDefinition {
	private Data data;
	private IcTest[] icTests;
	private ClassSimTest[] classsimTests;
	private ItemSimTest[] itemsimTests;

	/**
	 * @return the icTests
	 */
	public IcTest[] getIcTests() {
		return icTests;
	}

	/**
	 * @param icTests
	 *            the icTests to set
	 */
	public void setIcTests(IcTest[] icTests) {
		this.icTests = icTests;
	}

	/**
	 * @return the classsimTests
	 */
	public ClassSimTest[] getClasssimTests() {
		return classsimTests;
	}

	/**
	 * @param classsimTests
	 *            the classsimTests to set
	 */
	public void setClasssimTests(ClassSimTest[] classsimTests) {
		this.classsimTests = classsimTests;
	}

	/**
	 * @return the itemsimTests
	 */
	public ItemSimTest[] getItemsimTests() {
		return itemsimTests;
	}

	/**
	 * @param itemsimTests
	 *            the itemsimTests to set
	 */
	public void setItemsimTests(ItemSimTest[] itemsimTests) {
		this.itemsimTests = itemsimTests;
	}

	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestSetDefinition [data=");
		builder.append(data);
		builder.append(",\n icTests=");
		builder.append(Arrays.toString(icTests));
		builder.append(",\n classsimTests=");
		builder.append(Arrays.toString(classsimTests));
		builder.append(",\n itemsimTests=");
		builder.append(Arrays.toString(itemsimTests));
		builder.append("]");
		return builder.toString();
	}

}
