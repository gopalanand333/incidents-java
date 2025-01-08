package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("AdminService.Urgency.texts")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-06T10:39:40.681936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface UrgencyTexts_ extends StructuredType<UrgencyTexts_> {
  String CDS_NAME = "AdminService.Urgency.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
