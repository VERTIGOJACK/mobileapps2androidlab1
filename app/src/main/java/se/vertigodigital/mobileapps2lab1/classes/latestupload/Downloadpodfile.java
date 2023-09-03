
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
    "title",
    "description",
    "filesizeinbytes",
    "program",
    "availablefromutc",
    "duration",
    "publishdateutc",
    "id",
    "url",
    "statkey"
})
@Generated("jsonschema2pojo")
public class Downloadpodfile {

    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("filesizeinbytes")
    private Integer filesizeinbytes;
    @JsonProperty("program")
    private Program__2 program;
    @JsonProperty("availablefromutc")
    private String availablefromutc;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("publishdateutc")
    private String publishdateutc;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("statkey")
    private String statkey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

    @JsonProperty("filesizeinbytes")
    public Integer getFilesizeinbytes() {
        return filesizeinbytes;
    }

    @JsonProperty("filesizeinbytes")
    public void setFilesizeinbytes(Integer filesizeinbytes) {
        this.filesizeinbytes = filesizeinbytes;
    }

    @JsonProperty("program")
    public Program__2 getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(Program__2 program) {
        this.program = program;
    }

    @JsonProperty("availablefromutc")
    public String getAvailablefromutc() {
        return availablefromutc;
    }

    @JsonProperty("availablefromutc")
    public void setAvailablefromutc(String availablefromutc) {
        this.availablefromutc = availablefromutc;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("publishdateutc")
    public String getPublishdateutc() {
        return publishdateutc;
    }

    @JsonProperty("publishdateutc")
    public void setPublishdateutc(String publishdateutc) {
        this.publishdateutc = publishdateutc;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("statkey")
    public String getStatkey() {
        return statkey;
    }

    @JsonProperty("statkey")
    public void setStatkey(String statkey) {
        this.statkey = statkey;
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
