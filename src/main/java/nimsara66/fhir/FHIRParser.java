package nimsara66.fhir;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.DataFormatException;
import ca.uhn.fhir.parser.IParser;

import org.hl7.fhir.instance.model.api.IBaseResource;

import io.ballerina.runtime.api.values.BXml;
import io.ballerina.runtime.api.values.BString;
import io.ballerina.runtime.api.values.BTypedesc;
import io.ballerina.runtime.api.utils.StringUtils;
import io.ballerina.runtime.api.utils.JsonUtils;
import io.ballerina.runtime.internal.ValueConverter;

public class FHIRParser {
    private static final FhirContext context = FhirContext.forR4();

    public static Object convertFhirXmlToJson(final BXml content) throws DataFormatException {
        IParser source = context.newXmlParser(); // new XML parser
        IBaseResource resource = source.parseResource(content.toString()); // parse the resource
        IParser target = context.newJsonParser(); // new JSON parser
        String jsonString = target.setPrettyPrint(true).encodeResourceToString(resource); // output JSON
        BString bstring = StringUtils.fromString(jsonString);
        return JsonUtils.parse(bstring);
    }

    public static Object convertFhirXmlToRecord(final BXml content, BTypedesc t) throws DataFormatException {
        IParser source = context.newXmlParser(); // new XML parser
        IBaseResource resource = source.parseResource(content.toString()); // parse the resource
        IParser target = context.newJsonParser(); // new JSON parser
        String jsonString = target.setPrettyPrint(true).encodeResourceToString(resource); // output JSON
        BString bstring = StringUtils.fromString(jsonString);
        return ValueConverter.convert(JsonUtils.parse(bstring), t); // Convert to JSON and then to RECORD
    }
}
