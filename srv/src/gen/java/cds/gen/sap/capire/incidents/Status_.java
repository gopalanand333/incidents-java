package cds.gen.sap.capire.incidents;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("sap.capire.incidents.Status")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface Status_ extends StructuredType<Status_> {
  String CDS_NAME = "sap.capire.incidents.Status";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  ElementRef<Integer> criticality();

  StatusTexts_ texts();

  StatusTexts_ texts(Function<StatusTexts_, CqnPredicate> filter);

  StatusTexts_ localized();

  StatusTexts_ localized(Function<StatusTexts_, CqnPredicate> filter);
}
