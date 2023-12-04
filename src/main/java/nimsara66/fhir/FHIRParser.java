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
import io.ballerina.runtime.api.values.BArray;
import io.ballerina.runtime.api.values.BMap;
import io.ballerina.runtime.api.values.BString;
import io.ballerina.runtime.api.utils.StringUtils;
import io.ballerina.runtime.api.PredefinedTypes;
import io.ballerina.runtime.api.creators.TypeCreator;
import io.ballerina.runtime.api.creators.ValueCreator;
import io.ballerina.runtime.api.utils.JsonUtils;

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
        // IParser source = context.newXmlParser(); // new XML parser
        // // System.out.println(content.getTextValue());
        // IBaseResource resource = source.parseResource(content.toString()); // parse the resource
        // IParser target = context.newJsonParser(); // new JSON parser
        // System.out.println(target.setPrettyPrint(true).encodeResourceToString(resource));
        // return target.setPrettyPrint(true).encodeResourceToString(resource); // output JSON
        BMap<BString, Object> bmap = ValueCreator.createMapValue(TypeCreator.createMapType(PredefinedTypes.TYPE_JSON));
        BMap<BString, Object> i_bmap = ValueCreator.createMapValue(TypeCreator.createMapType(PredefinedTypes.TYPE_JSON));
        BArray arr = ValueCreator.createArrayValue(TypeCreator.createArrayType(PredefinedTypes.TYPE_INT));
        arr.append((long) 1);
        // bmap.put(StringUtils.fromString("name"), StringUtils.fromString("Nimsara"));
        bmap.put(StringUtils.fromString("name"), i_bmap);
        // i_bmap.put(StringUtils.fromString("name"), (long) 1);
        // i_bmap.put(StringUtils.fromString("name"), true);
        i_bmap.put(StringUtils.fromString("name"), (double) 1.23);
        BArray arrj = ValueCreator.createArrayValue(TypeCreator.createArrayType(PredefinedTypes.TYPE_JSON));
        return bmap;
    }

    public static Object convertTest(final BXml content) throws DataFormatException {
        IParser source = context.newXmlParser(); // new XML parser
        // System.out.println(content.getTextValue());
        IBaseResource resource = source.parseResource(content.toString()); // parse the resource
        IParser target = context.newJsonParser(); // new JSON parser
        String jsonString = target.setPrettyPrint(true).encodeResourceToString(resource); // output JSON
        BString bstring = StringUtils.fromString(jsonString);
        System.out.println(bstring);
        return JsonUtils.parse(bstring);
    }

    public static Object hello() {
        return StringUtils.fromString("Hello World!");
    }
}
