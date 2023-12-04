import ballerina/jballerina.java;

# Convert FHIR XML to JSON
#
# + xmlValue - FHIR XML to be converted to JSON
# + return - Converted JSON or Error
public isolated function fhirXmlToJson(xml xmlValue) returns json|Error = @java:Method {
    'class: "nimsara66.fhir.FHIRParser"
} external;

# Convert FHIR XML to Record
#
# + xmlValue - FHIR XML to be converted to Record
# + t - Record type to be returned
# + return - Converted Record or Error
public isolated function fhirXmlToRecord(xml xmlValue, typedesc<anydata> t = <>) returns t|Error = @java:Method {
    'class: "nimsara66.fhir.FHIRParser"
} external;