package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
@CdsName("AdminService")
public interface AdminService_ {
  String CDS_NAME = "AdminService";

  Class<Incidents_> INCIDENTS = Incidents_.class;

  Class<Status_> STATUS = Status_.class;

  Class<Addresses_> ADDRESSES = Addresses_.class;

  Class<Urgency_> URGENCY = Urgency_.class;

  Class<StatusTexts_> STATUS_TEXTS = StatusTexts_.class;

  Class<Customers_> CUSTOMERS = Customers_.class;

  Class<UrgencyTexts_> URGENCY_TEXTS = UrgencyTexts_.class;
}
