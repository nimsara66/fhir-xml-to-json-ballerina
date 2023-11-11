package nimsara66.fhir;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String xml = "<Patient xmlns=\"http://hl7.org/fhir\">\n" + //
                "  <id value=\"example\"/> \n" + //
                "      <!--     MRN assigned by ACME healthcare on 6-May 2001     -->\n" + //
                "  <text> <status value=\"generated\"/> <div xmlns=\"http://www.w3.org/1999/xhtml\"><p style=\"border: 1px #661aff solid; background-color: #e6e6ff; padding: 10px;\"><b> Jim </b>  male, DoB: 1974-12-25 ( Medical record number: 12345 (use: USUAL, period: 2001-05-06\n" + //
                "         --&gt; (ongoing)))</p> <hr/>  <table class=\"grid\"><tr> <td style=\"background-color: #f3f5da\" title=\"Record is active\">Active:</td> <td> true</td> <td style=\"background-color: #f3f5da\" title=\"Known status of Patient\">Deceased:</td> <td colspan=\"3\">false</td> </tr> <tr> <td style=\"background-color: #f3f5da\" title=\"Alternate names (see the one above)\">Alt Names:</td> <td colspan=\"3\"><ul> <li> Peter James Chalmers (OFFICIAL)</li> <li> Peter James Windsor (MAIDEN)</li> </ul> </td> </tr> <tr> <td style=\"background-color: #f3f5da\" title=\"Ways to contact the Patient\">Contact Details:</td> <td colspan=\"3\"><ul> <li> -unknown-(HOME)</li> <li> ph: (03) 5555 6473(WORK)</li> <li> ph: (03) 3410 5613(MOBILE)</li> <li> ph: (03) 5555 8834(OLD)</li> <li> 534 Erewhon St PeasantVille, Rainbow, Vic  3999(HOME)</li> </ul> </td> </tr> <tr> <td style=\"background-color: #f3f5da\" title=\"Nominated Contact: Next-of-Kin\">Next-of-Kin:</td> <td colspan=\"3\"><ul> <li> Bénédicte du Marché  (female)</li> <li> 534 Erewhon St PleasantVille Vic 3999 (HOME)</li> <li> <a href=\"tel:+33(237)998327\">+33 (237) 998327</a> </li> <li> Valid Period: 2012 --&gt; (ongoing)</li> </ul> </td> </tr> <tr> <td style=\"background-color: #f3f5da\" title=\"Patient Links\">Links:</td> <td colspan=\"3\"><ul> <li> Managing Organization: <a href=\"organization-example-gastro.html\">Organization/1</a>  &quot;Gastroenterology&quot;</li> </ul> </td> </tr> </table> </div> </text> <identifier> \n" + //
                "    <use value=\"usual\"/> \n" + //
                "    <type> \n" + //
                "      <coding> \n" + //
                "        <system value=\"http://terminology.hl7.org/CodeSystem/v2-0203\"/> \n" + //
                "        <code value=\"MR\"/> \n" + //
                "      </coding> \n" + //
                "    </type> \n" + //
                "    <system value=\"urn:oid:1.2.36.146.595.217.0.1\"/> \n" + //
                "    <value value=\"12345\"/> \n" + //
                "    <period> \n" + //
                "      <start value=\"2001-05-06\"/> \n" + //
                "    </period> \n" + //
                "    <assigner> \n" + //
                "      <display value=\"Acme Healthcare\"/> \n" + //
                "    </assigner> \n" + //
                "  </identifier> \n" + //
                "  <active value=\"true\"/> \n" + //
                "      <!--     Peter James Chalmers, but called \"Jim\"     -->\n" + //
                "  <name> \n" + //
                "    <use value=\"official\"/> \n" + //
                "    <family value=\"Chalmers\"/> \n" + //
                "    <given value=\"Peter\"/> \n" + //
                "    <given value=\"James\"/> \n" + //
                "  </name> \n" + //
                "  <name> \n" + //
                "    <use value=\"usual\"/> \n" + //
                "    <given value=\"Jim\"/> \n" + //
                "  </name> \n" + //
                "  <name> \n" + //
                "        <!--    Maiden names apply for anyone whose name changes as a result of marriage - irrespective\n" + //
                "     of gender    -->\n" + //
                "    <use value=\"maiden\"/> \n" + //
                "    <family value=\"Windsor\"/> \n" + //
                "    <given value=\"Peter\"/> \n" + //
                "    <given value=\"James\"/> \n" + //
                "    <period> \n" + //
                "      <end value=\"2002\"/> \n" + //
                "    </period> \n" + //
                "  </name> \n" + //
                "  <telecom> \n" + //
                "    <use value=\"home\"/> \n" + //
                "        <!--     home communication details aren't known     -->\n" + //
                "  </telecom> \n" + //
                "  <telecom> \n" + //
                "    <system value=\"phone\"/> \n" + //
                "    <value value=\"(03) 5555 6473\"/> \n" + //
                "    <use value=\"work\"/> \n" + //
                "    <rank value=\"1\"/> \n" + //
                "  </telecom> \n" + //
                "  <telecom> \n" + //
                "    <system value=\"phone\"/> \n" + //
                "    <value value=\"(03) 3410 5613\"/> \n" + //
                "    <use value=\"mobile\"/> \n" + //
                "    <rank value=\"2\"/> \n" + //
                "  </telecom> \n" + //
                "  <telecom> \n" + //
                "    <system value=\"phone\"/> \n" + //
                "    <value value=\"(03) 5555 8834\"/> \n" + //
                "    <use value=\"old\"/> \n" + //
                "    <period> \n" + //
                "      <end value=\"2014\"/> \n" + //
                "    </period> \n" + //
                "  </telecom> \n" + //
                "      <!--     use FHIR code system for male / female     -->\n" + //
                "  <gender value=\"male\"/> \n" + //
                "  <birthDate value=\"1974-12-25\">\n" + //
                "    <extension url=\"http://hl7.org/fhir/StructureDefinition/patient-birthTime\">\n" + //
                "      <valueDateTime value=\"1974-12-25T14:35:45-05:00\"/> \n" + //
                "    </extension> \n" + //
                "  </birthDate> \n" + //
                "  <deceasedBoolean value=\"false\"/> \n" + //
                "  <address> \n" + //
                "    <use value=\"home\"/> \n" + //
                "    <type value=\"both\"/> \n" + //
                "    <text value=\"534 Erewhon St PeasantVille, Rainbow, Vic  3999\"/> \n" + //
                "    <line value=\"534 Erewhon St\"/> \n" + //
                "    <city value=\"PleasantVille\"/> \n" + //
                "    <district value=\"Rainbow\"/> \n" + //
                "    <state value=\"Vic\"/> \n" + //
                "    <postalCode value=\"3999\"/> \n" + //
                "    <period> \n" + //
                "      <start value=\"1974-12-25\"/> \n" + //
                "    </period> \n" + //
                "  </address> \n" + //
                "  <contact> \n" + //
                "    <relationship> \n" + //
                "      <coding> \n" + //
                "        <system value=\"http://terminology.hl7.org/CodeSystem/v2-0131\"/> \n" + //
                "        <code value=\"N\"/> \n" + //
                "      </coding> \n" + //
                "    </relationship> \n" + //
                "    <name> \n" + //
                "      <family value=\"du Marché\">\n" + //
                "            <!--     the \"du\" part is a family name prefix (VV in iso 21090)     -->\n" + //
                "        <extension url=\"http://hl7.org/fhir/StructureDefinition/humanname-own-prefix\">\n" + //
                "          <valueString value=\"VV\"/> \n" + //
                "        </extension> \n" + //
                "      </family> \n" + //
                "      <given value=\"Bénédicte\"/> \n" + //
                "    </name> \n" + //
                "    <telecom> \n" + //
                "      <system value=\"phone\"/> \n" + //
                "      <value value=\"+33 (237) 998327\"/> \n" + //
                "    </telecom> \n" + //
                "    <address> \n" + //
                "      <use value=\"home\"/> \n" + //
                "      <type value=\"both\"/> \n" + //
                "      <line value=\"534 Erewhon St\"/> \n" + //
                "      <city value=\"PleasantVille\"/> \n" + //
                "      <district value=\"Rainbow\"/> \n" + //
                "      <state value=\"Vic\"/> \n" + //
                "      <postalCode value=\"3999\"/> \n" + //
                "      <period> \n" + //
                "        <start value=\"1974-12-25\"/> \n" + //
                "      </period> \n" + //
                "    </address> \n" + //
                "    <gender value=\"female\"/> \n" + //
                "    <period> \n" + //
                "          <!--     The contact relationship started in 2012     -->\n" + //
                "      <start value=\"2012\"/> \n" + //
                "    </period> \n" + //
                "  </contact> \n" + //
                "  <managingOrganization> \n" + //
                "    <reference value=\"Organization/1\"/> \n" + //
                "  </managingOrganization> \n" + //
                "</Patient> ";

                String json = FHIRParser.convertXmlToJsonFhir(xml);
                System.out.println(json);
    }
}