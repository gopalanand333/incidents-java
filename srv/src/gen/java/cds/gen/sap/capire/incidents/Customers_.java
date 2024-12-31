package cds.gen.sap.capire.incidents;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.time.Instant;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("sap.capire.incidents.Customers")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface Customers_ extends StructuredType<Customers_> {
  String ID = "ID";

  String CDS_NAME = "sap.capire.incidents.Customers";

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  @CdsName(ID)
  ElementRef<String> ID();

  ElementRef<String> firstName();

  ElementRef<String> lastName();

  ElementRef<String> name();

  ElementRef<String> email();

  ElementRef<String> phone();

  Incidents_ incidents();

  Incidents_ incidents(Function<Incidents_, CqnPredicate> filter);

  ElementRef<String> creditCardNo();

  Addresses_ addresses();

  Addresses_ addresses(Function<Addresses_, CqnPredicate> filter);
}
