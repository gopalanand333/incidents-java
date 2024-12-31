package cds.gen.sap.common;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("sap.common.CodeList")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-12-31T10:48:06.363936Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface CodeList extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  static CodeList create() {
    return Struct.create(CodeList.class);
  }

  static CodeList of(Map<String, Object> map) {
    return Struct.access(map).as(CodeList.class);
  }
}
