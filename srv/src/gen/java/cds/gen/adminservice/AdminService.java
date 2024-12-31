package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.cds.RemoteService;
import com.sap.cds.services.draft.DraftService;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
@CdsName(AdminService_.CDS_NAME)
public interface AdminService extends CqnService {
  interface Application extends ApplicationService, AdminService {
  }

  interface Remote extends RemoteService, AdminService {
  }

  interface Draft extends DraftService, AdminService {
  }
}
