
package us.kbase.setapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import us.kbase.common.service.Tuple11;


/**
 * <p>Original spec-file type: SetInfo</p>
 * <pre>
 * dp_ref - optional reference to DataPalette container in case given set object
 *     is coming from DataPalette.
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "ref",
    "info",
    "items",
    "dp_ref"
})
public class SetInfo {

    @JsonProperty("ref")
    private java.lang.String ref;
    @JsonProperty("info")
    private Tuple11 <Long, String, String, String, Long, String, Long, String, String, Long, Map<String, String>> info;
    @JsonProperty("items")
    private List<SetItemInfo> items;
    @JsonProperty("dp_ref")
    private java.lang.String dpRef;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("ref")
    public java.lang.String getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(java.lang.String ref) {
        this.ref = ref;
    }

    public SetInfo withRef(java.lang.String ref) {
        this.ref = ref;
        return this;
    }

    @JsonProperty("info")
    public Tuple11 <Long, String, String, String, Long, String, Long, String, String, Long, Map<String, String>> getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Tuple11 <Long, String, String, String, Long, String, Long, String, String, Long, Map<String, String>> info) {
        this.info = info;
    }

    public SetInfo withInfo(Tuple11 <Long, String, String, String, Long, String, Long, String, String, Long, Map<String, String>> info) {
        this.info = info;
        return this;
    }

    @JsonProperty("items")
    public List<SetItemInfo> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<SetItemInfo> items) {
        this.items = items;
    }

    public SetInfo withItems(List<SetItemInfo> items) {
        this.items = items;
        return this;
    }

    @JsonProperty("dp_ref")
    public java.lang.String getDpRef() {
        return dpRef;
    }

    @JsonProperty("dp_ref")
    public void setDpRef(java.lang.String dpRef) {
        this.dpRef = dpRef;
    }

    public SetInfo withDpRef(java.lang.String dpRef) {
        this.dpRef = dpRef;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((("SetInfo"+" [ref=")+ ref)+", info=")+ info)+", items=")+ items)+", dpRef=")+ dpRef)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
