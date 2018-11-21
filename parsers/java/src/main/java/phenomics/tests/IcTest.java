/**
 * 
 */
package phenomics.tests;

/**
 * @author Sebastian Köhler (dr.sebastian.koehler@gmail.com)
 *
 */
public class IcTest {
	private String classId;
	private double ic;

	/**
	 * @return the classId
	 */
	public String getClassId() {
		return classId;
	}

	/**
	 * @param classId
	 *            the classId to set
	 */
	public void setClassId(String classId) {
		this.classId = classId;
	}

	/**
	 * @return the ic
	 */
	public double getIc() {
		return ic;
	}

	/**
	 * @param ic
	 *            the ic to set
	 */
	public void setIc(double ic) {
		this.ic = ic;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IcTest [classId=");
		builder.append(classId);
		builder.append(", ic=");
		builder.append(ic);
		builder.append("]");
		return builder.toString();
	}

}