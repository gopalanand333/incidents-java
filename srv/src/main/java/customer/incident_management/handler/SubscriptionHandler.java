package customer.incident_management.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
import com.sap.cds.services.mt.DependenciesEventContext;
import com.sap.cds.services.mt.DeploymentService;
import com.sap.cds.services.mt.SaasRegistryDependency;
import com.sap.cds.services.runtime.CdsRuntime;
import com.sap.cloud.environment.servicebinding.api.ServiceBinding;

@Component
@Profile("cloud")
@ServiceName(DeploymentService.DEFAULT_NAME)
public class SubscriptionHandler implements EventHandler {

    private static final Logger logger = LoggerFactory.getLogger(SubscriptionHandler.class);

    @Autowired
    private CdsRuntime cdsRuntime;


    private String html5AppsRepoXsappname;


    @On
    public void onDependencies(DependenciesEventContext context) {
        List<Map<String, Object>> dependencies = new ArrayList<>();
        html5AppsRepoXsappname= getServiceUaaCredential("html5-apps-repo");
        dependencies.add(SaasRegistryDependency.create(html5AppsRepoXsappname));
        context.setResult(dependencies);
    }

    public String getServiceUaaCredential(String instanceName) {

        String xsAppName;
        Optional<ServiceBinding> service = cdsRuntime.getEnvironment().getServiceBindings().filter( binding -> binding.getServiceName().get().equals(instanceName))
                .findFirst();
        if (service.isPresent()) {
            Object uaaObject = service.get().getCredentials().get("uaa");
                Map<String, Object> uaaMap = (Map<String, Object>) uaaObject;
                xsAppName = (String) uaaMap.get("xsappname");
                return xsAppName;
        } else {
            return null;
        }
    }

}