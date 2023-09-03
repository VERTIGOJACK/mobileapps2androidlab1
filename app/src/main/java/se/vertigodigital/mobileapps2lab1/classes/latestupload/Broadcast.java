
package se.vertigodigital.mobileapps2lab1.classes.latestupload;

import java.util.LinkedHashMap;
import java.util.List;
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
    "availablestoputc",
    "playlist",
    "broadcastfiles"
})
@Generated("jsonschema2pojo")
public class Broadcast {

    @JsonProperty("availablestoputc")
    private String availablestoputc;
    @JsonProperty("playlist")
    private Playlist playlist;
    @JsonProperty("broadcastfiles")
    private List<Broadcastfile> broadcastfiles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("availablestoputc")
    public String getAvailablestoputc() {
        return availablestoputc;
    }

    @JsonProperty("availablestoputc")
    public void setAvailablestoputc(String availablestoputc) {
        this.availablestoputc = availablestoputc;
    }

    @JsonProperty("playlist")
    public Playlist getPlaylist() {
        return playlist;
    }

    @JsonProperty("playlist")
    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    @JsonProperty("broadcastfiles")
    public List<Broadcastfile> getBroadcastfiles() {
        return broadcastfiles;
    }

    @JsonProperty("broadcastfiles")
    public void setBroadcastfiles(List<Broadcastfile> broadcastfiles) {
        this.broadcastfiles = broadcastfiles;
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
