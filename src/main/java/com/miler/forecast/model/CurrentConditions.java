
package com.miler.forecast.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.miler.forecast.model.Temp;
import com.miler.forecast.model.Wind;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dayhour",
    "temp",
    "precip",
    "humidity",
    "wind",
    "iconURL",
    "comment"
})
@Generated("jsonschema2pojo")
public class CurrentConditions {

    @JsonProperty("dayhour")
    private String dayhour;
    @JsonProperty("temp")
    private Temp temp;
    @JsonProperty("precip")
    private String precip;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("wind")
    private Wind wind;
    @JsonProperty("iconURL")
    private String iconURL;
    @JsonProperty("comment")
    private String comment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dayhour")
    public String getDayhour() {
        return dayhour;
    }

    @JsonProperty("dayhour")
    public void setDayhour(String dayhour) {
        this.dayhour = dayhour;
    }

    @JsonProperty("temp")
    public Temp getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    @JsonProperty("precip")
    public String getPrecip() {
        return precip;
    }

    @JsonProperty("precip")
    public void setPrecip(String precip) {
        this.precip = precip;
    }

    @JsonProperty("humidity")
    public String getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonProperty("iconURL")
    public String getIconURL() {
        return iconURL;
    }

    @JsonProperty("iconURL")
    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
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
