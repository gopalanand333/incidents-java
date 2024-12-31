package cds.gen.processorservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.time.Instant;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("ProcessorService.Incidents")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface Incidents_ extends StructuredType<Incidents_> {
  String ID = "ID";

  String CUSTOMER_ID = "customer_ID";

  String URGENCY_CODE = "urgency_code";

  String STATUS_CODE = "status_code";

  String IS_ACTIVE_ENTITY = "IsActiveEntity";

  String HAS_ACTIVE_ENTITY = "HasActiveEntity";

  String HAS_DRAFT_ENTITY = "HasDraftEntity";

  String DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID = "DraftAdministrativeData_DraftUUID";

  String CDS_NAME = "ProcessorService.Incidents";

  @CdsName(ID)
  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  Customers_ customer();

  Customers_ customer(Function<Customers_, CqnPredicate> filter);

  @CdsName(CUSTOMER_ID)
  ElementRef<String> customer_ID();

  ElementRef<String> title();

  Urgency_ urgency();

  Urgency_ urgency(Function<Urgency_, CqnPredicate> filter);

  @CdsName(URGENCY_CODE)
  ElementRef<String> urgency_code();

  Status_ status();

  Status_ status(Function<Status_, CqnPredicate> filter);

  @CdsName(STATUS_CODE)
  ElementRef<String> status_code();

  Conversation_ conversation();

  Conversation_ conversation(Function<Conversation_, CqnPredicate> filter);

  @CdsName(IS_ACTIVE_ENTITY)
  ElementRef<Boolean> IsActiveEntity();

  @CdsName(HAS_ACTIVE_ENTITY)
  ElementRef<Boolean> HasActiveEntity();

  @CdsName(HAS_DRAFT_ENTITY)
  ElementRef<Boolean> HasDraftEntity();

  DraftAdministrativeData_ DraftAdministrativeData();

  DraftAdministrativeData_ DraftAdministrativeData(
      Function<DraftAdministrativeData_, CqnPredicate> filter);

  @CdsName(DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID)
  ElementRef<String> DraftAdministrativeData_DraftUUID();

  Incidents_ SiblingEntity();

  Incidents_ SiblingEntity(Function<Incidents_, CqnPredicate> filter);

  interface Conversation_ extends StructuredType<Conversation_> {
    String ID = "ID";

    @CdsName(ID)
    ElementRef<String> ID();

    ElementRef<Instant> timestamp();

    ElementRef<String> author();

    ElementRef<String> message();
  }
}
