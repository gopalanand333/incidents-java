package cds.gen.sap.capire.incidents;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("sap.capire.incidents.Status.texts")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-06T10:39:40.681936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface StatusTexts extends CdsData {
  String LOCALE = "locale";

  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  /**
   * Type for a language code
   */
  String getLocale();

  /**
   * Type for a language code
   */
  void setLocale(String locale);

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  StatusTexts_ ref();

  static StatusTexts create() {
    return Struct.create(StatusTexts.class);
  }

  static StatusTexts of(Map<String, Object> map) {
    return Struct.access(map).as(StatusTexts.class);
  }
}
