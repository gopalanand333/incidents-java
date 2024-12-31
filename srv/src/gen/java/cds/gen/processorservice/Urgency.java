package cds.gen.processorservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("ProcessorService.Urgency")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface Urgency extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  List<UrgencyTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  UrgencyTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  Urgency_ ref();

  static Urgency create() {
    return Struct.create(Urgency.class);
  }

  static Urgency of(Map<String, Object> map) {
    return Struct.access(map).as(Urgency.class);
  }

  static Urgency create(String code) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(CODE, code);
    return Struct.access(keys).as(Urgency.class);
  }
}
