package cds.gen.processorservice;

import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.String;
import javax.annotation.processing.Generated;

@EventName("draftActivate")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface IncidentsDraftActivateContext extends EventContext {
  String CDS_NAME = "draftActivate";

  CqnSelect getCqn();

  void setCqn(CqnSelect select);

  static IncidentsDraftActivateContext create() {
    return EventContext.create(IncidentsDraftActivateContext.class, "ProcessorService.Incidents");
  }

  void setResult(Incidents result);

  Incidents getResult();

  static IncidentsDraftActivateContext create(String entityName) {
    return EventContext.create(IncidentsDraftActivateContext.class, entityName);
  }
}
