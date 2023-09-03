
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
    "id",
    "title",
    "description",
    "dateutc",
    "starttimeutc",
    "endtimeutc",
    "type",
    "imageurl",
    "imageurltemplate",
    "broadcast",
    "program",
    "listenpodfile",
    "downloadpodfile"
})
@Generated("jsonschema2pojo")
public class Show {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("dateutc")
    private String dateutc;
    @JsonProperty("starttimeutc")
    private String starttimeutc;
    @JsonProperty("endtimeutc")
    private String endtimeutc;
    @JsonProperty("type")
    private String type;
    @JsonProperty("imageurl")
    private String imageurl;
    @JsonProperty("imageurltemplate")
    private String imageurltemplate;
    @JsonProperty("broadcast")
    private Broadcast broadcast;
    @JsonProperty("program")
    private Program program;
    @JsonProperty("listenpodfile")
    private Listenpodfile listenpodfile;
    @JsonProperty("downloadpodfile")
    private Downloadpodfile downloadpodfile;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("dateutc")
    public String getDateutc() {
        return dateutc;
    }

    @JsonProperty("dateutc")
    public void setDateutc(String dateutc) {
        this.dateutc = dateutc;
    }

    @JsonProperty("starttimeutc")
    public String getStarttimeutc() {
        return starttimeutc;
    }

    @JsonProperty("starttimeutc")
    public void setStarttimeutc(String starttimeutc) {
        this.starttimeutc = starttimeutc;
    }

    @JsonProperty("endtimeutc")
    public String getEndtimeutc() {
        return endtimeutc;
    }

    @JsonProperty("endtimeutc")
    public void setEndtimeutc(String endtimeutc) {
        this.endtimeutc = endtimeutc;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("imageurl")
    public String getImageurl() {
        return imageurl;
    }

    @JsonProperty("imageurl")
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @JsonProperty("imageurltemplate")
    public String getImageurltemplate() {
        return imageurltemplate;
    }

    @JsonProperty("imageurltemplate")
    public void setImageurltemplate(String imageurltemplate) {
        this.imageurltemplate = imageurltemplate;
    }

    @JsonProperty("broadcast")
    public Broadcast getBroadcast() {
        return broadcast;
    }

    @JsonProperty("broadcast")
    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    @JsonProperty("program")
    public Program getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(Program program) {
        this.program = program;
    }

    @JsonProperty("listenpodfile")
    public Listenpodfile getListenpodfile() {
        return listenpodfile;
    }

    @JsonProperty("listenpodfile")
    public void setListenpodfile(Listenpodfile listenpodfile) {
        this.listenpodfile = listenpodfile;
    }

    @JsonProperty("downloadpodfile")
    public Downloadpodfile getDownloadpodfile() {
        return downloadpodfile;
    }

    @JsonProperty("downloadpodfile")
    public void setDownloadpodfile(Downloadpodfile downloadpodfile) {
        this.downloadpodfile = downloadpodfile;
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
