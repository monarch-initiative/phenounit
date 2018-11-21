/**
 * 
 */
package phenomics;

/**
 * @author Sebastian Köhler (dr.sebastian.koehler@gmail.com)
 *
 */
public class Data {

	private String name;
	private String ontologyVersion;
	private String annotationVersion;

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
	 * @return the ontologyVersion
	 */
	public String getOntologyVersion() {
		return ontologyVersion;
	}

	/**
	 * @param ontologyVersion
	 *            the ontologyVersion to set
	 */
	public void setOntologyVersion(String ontologyVersion) {
		this.ontologyVersion = ontologyVersion;
	}

	/**
	 * @return the annotationVersion
	 */
	public String getAnnotationVersion() {
		return annotationVersion;
	}

	/**
	 * @param annotationVersion
	 *            the annotationVersion to set
	 */
	public void setAnnotationVersion(String annotationVersion) {
		this.annotationVersion = annotationVersion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data [name=");
		builder.append(name);
		builder.append(", ontologyVersion=");
		builder.append(ontologyVersion);
		builder.append(", annotationVersion=");
		builder.append(annotationVersion);
		builder.append("]");
		return builder.toString();
	}

}
