package customer.incident_management.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
import com.sap.cds.services.mt.DependenciesEventContext;
import com.sap.cds.services.mt.DeploymentService;
import com.sap.cds.services.mt.;
@Component
@Profile("cloud")
@ServiceName(DeploymentService.DEFAULT_NAME)
public class SubscriptionHandler implements EventHandler {

    @Value("${vcap.services.incident-management-html5-repo-runtime.credentials.uaa.xsappname}")
    private String html5AppsRepoXsappname;

    @On
    public void onDependencies(DependenciesEventContext context) {
        List<Map<String, Object>> dependencies = new ArrayList<>();
//        dependencies.add(SaasRegistryDependency.create(html5AppsRepoXsappname));
        context.setResult(dependencies);
    }

}