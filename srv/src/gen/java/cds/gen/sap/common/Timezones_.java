package cds.gen.sap.common;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("sap.common.Timezones")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface Timezones_ extends StructuredType<Timezones_> {
  String CDS_NAME = "sap.common.Timezones";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  TimezonesTexts_ texts();

  TimezonesTexts_ texts(Function<TimezonesTexts_, CqnPredicate> filter);

  TimezonesTexts_ localized();

  TimezonesTexts_ localized(Function<TimezonesTexts_, CqnPredicate> filter);
}
