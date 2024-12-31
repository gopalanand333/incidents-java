package cds.gen.sap.common;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("sap.common.Languages")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface Languages_ extends StructuredType<Languages_> {
  String CDS_NAME = "sap.common.Languages";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  LanguagesTexts_ texts();

  LanguagesTexts_ texts(Function<LanguagesTexts_, CqnPredicate> filter);

  LanguagesTexts_ localized();

  LanguagesTexts_ localized(Function<LanguagesTexts_, CqnPredicate> filter);
}