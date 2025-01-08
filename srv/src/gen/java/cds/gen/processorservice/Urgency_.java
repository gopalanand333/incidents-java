package cds.gen.processorservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.processing.Generated;

/**
 * Aspect for a code list with name and description
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-codelist
 */
@CdsName("ProcessorService.Urgency")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-06T10:39:40.681936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface Urgency_ extends StructuredType<Urgency_> {
  String CDS_NAME = "ProcessorService.Urgency";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  UrgencyTexts_ texts();

  UrgencyTexts_ texts(Function<UrgencyTexts_, CqnPredicate> filter);

  UrgencyTexts_ localized();

  UrgencyTexts_ localized(Function<UrgencyTexts_, CqnPredicate> filter);
}
