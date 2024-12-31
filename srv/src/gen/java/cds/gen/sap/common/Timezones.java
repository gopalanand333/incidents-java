package cds.gen.sap.common;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("sap.common.Timezones")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface Timezones extends CdsData {
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

  List<TimezonesTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  TimezonesTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  Timezones_ ref();

  static Timezones create() {
    return Struct.create(Timezones.class);
  }

  static Timezones of(Map<String, Object> map) {
    return Struct.access(map).as(Timezones.class);
  }

  static Timezones create(String code) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(CODE, code);
    return Struct.access(keys).as(Timezones.class);
  }
}