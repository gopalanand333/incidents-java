package cds.gen.sap.capire.incidents;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-06T10:39:40.681936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
@CdsName("sap.capire.incidents")
public interface IncidentsModel_ {
  String CDS_NAME = "sap.capire.incidents";

  Class<Urgency_> URGENCY = Urgency_.class;

  Class<StatusTexts_> STATUS_TEXTS = StatusTexts_.class;

  Class<Status_> STATUS = Status_.class;

  Class<Incidents_> INCIDENTS = Incidents_.class;

  Class<UrgencyTexts_> URGENCY_TEXTS = UrgencyTexts_.class;

  Class<Addresses_> ADDRESSES = Addresses_.class;

  Class<Customers_> CUSTOMERS = Customers_.class;
}
