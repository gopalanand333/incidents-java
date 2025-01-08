package cds.gen.processorservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.cds.RemoteService;
import com.sap.cds.services.draft.DraftService;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-06T10:39:40.681936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
@CdsName(ProcessorService_.CDS_NAME)
public interface ProcessorService extends CqnService {
  interface Application extends ApplicationService, ProcessorService {
  }

  interface Remote extends RemoteService, ProcessorService {
  }

  interface Draft extends DraftService, ProcessorService {
  }
}
