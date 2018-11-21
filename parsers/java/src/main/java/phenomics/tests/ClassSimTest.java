/**
 * 
 */
package phenomics.tests;

/**
 * @author Sebastian Köhler (dr.sebastian.koehler@gmail.com)
 *
 */
public class ClassSimTest {
	private String name;
	private String class1;
	private String class2;
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
	 * @return the class1
	 */
	public String getClass1() {
		return class1;
	}

	/**
	 * @param class1
	 *            the class1 to set
	 */
	public void setClass1(String class1) {
		this.class1 = class1;
	}

	/**
	 * @return the class2
	 */
	public String getClass2() {
		return class2;
	}

	/**
	 * @param class2
	 *            the class2 to set
	 */
	public void setClass2(String class2) {
		this.class2 = class2;
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
		builder.append("ClassSimTest [name=");
		builder.append(name);
		builder.append(", class1=");
		builder.append(class1);
		builder.append(", class2=");
		builder.append(class2);
		builder.append(", sim=");
		builder.append(sim);
		builder.append("]");
		return builder.toString();
	}

}
