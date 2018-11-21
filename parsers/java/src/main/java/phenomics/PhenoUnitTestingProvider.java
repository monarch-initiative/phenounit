/**
 * 
 */
package phenomics;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

/**
 * @author Sebastian Köhler (dr.sebastian.koehler@gmail.com)
 *
 */
public class PhenoUnitTestingProvider {

	private TestSetDefinition testSetDefintion;

	/**
	 * @param testFile
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 */
	public PhenoUnitTestingProvider(String testFile) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		testSetDefintion = mapper.readValue(new File(testFile), TestSetDefinition.class);

	}

	/**
	 * @return the testSetDefintion
	 */
	public TestSetDefinition getTestSetDefintion() {
		return testSetDefintion;
	}
}
