package nimsara66.fhir;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.DataFormatException;
import ca.uhn.fhir.parser.IParser;
import org.hl7.fhir.instance.model.api.IBaseResource;

import io.ballerina.runtime.api.values.BXml;

public class FHIRParser {
    // private static boolean toXml = false;

    private static final FhirContext context = FhirContext.forR4();

    public static String convertXmlToJsonFhir(final String content) throws DataFormatException {
        IParser source = context.newXmlParser(); // new XML parser
        IBaseResource resource = source.parseResource(content); // parse the resource
        IParser target = context.newJsonParser(); // new JSON parser
        return target.setPrettyPrint(true).encodeResourceToString(resource); // output JSON
    }

    public static Object convertXmlToJsonBal(final BXml content) throws DataFormatException {
        IParser source = context.newXmlParser(); // new XML parser
        // System.out.println(content.getTextValue());
        IBaseResource resource = source.parseResource(content.toString()); // parse the resource
        IParser target = context.newJsonParser(); // new JSON parser
        System.out.println(target.setPrettyPrint(true).encodeResourceToString(resource));
        return target.setPrettyPrint(true).encodeResourceToString(resource); // output JSON
    }
}
