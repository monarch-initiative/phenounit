/**
 * 
 */
package phenomics.tests;

/**
 * @author Sebastian Köhler (dr.sebastian.koehler@gmail.com)
 *
 */
public class ItemSimTest {

	private String name;
	private String item1;
	private String item2;
	private double sim;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the item1
	 */
	public String getItem1() {
		return item1;
	}

	/**
	 * @param item1
	 *            the item1 to set
	 */
	public void setItem1(String item1) {
		this.item1 = item1;
	}

	/**
	 * @return the item2
	 */
	public String getItem2() {
		return item2;
	}

	/**
	 * @param item2
	 *            the item2 to set
	 */
	public void setItem2(String item2) {
		this.item2 = item2;
	}

	/**
	 * @return the sim
	 */
	public double getSim() {
		return sim;
	}

	/**
	 * @param sim
	 *            the sim to set
	 */
	public void setSim(double sim) {
		this.sim = sim;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItemSimTest [name=");
		builder.append(name);
		builder.append(", item1=");
		builder.append(item1);
		builder.append(", item2=");
		builder.append(item2);
		builder.append(", sim=");
		builder.append(sim);
		builder.append("]");
		return builder.toString();
	}

}
