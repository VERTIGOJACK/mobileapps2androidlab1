
package se.vertigodigital.mobileapps2lab1.classes.latestupload;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "page",
    "size",
    "totalhits",
    "totalpages",
    "nextpage"
})
@Generated("jsonschema2pojo")
public class Pagination {

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("totalhits")
    private Integer totalhits;
    @JsonProperty("totalpages")
    private Integer totalpages;
    @JsonProperty("nextpage")
    private String nextpage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("totalhits")
    public Integer getTotalhits() {
        return totalhits;
    }

    @JsonProperty("totalhits")
    public void setTotalhits(Integer totalhits) {
        this.totalhits = totalhits;
    }

    @JsonProperty("totalpages")
    public Integer getTotalpages() {
        return totalpages;
    }

    @JsonProperty("totalpages")
    public void setTotalpages(Integer totalpages) {
        this.totalpages = totalpages;
    }

    @JsonProperty("nextpage")
    public String getNextpage() {
        return nextpage;
    }

    @JsonProperty("nextpage")
    public void setNextpage(String nextpage) {
        this.nextpage = nextpage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
