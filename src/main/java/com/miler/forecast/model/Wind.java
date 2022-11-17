
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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "km",
    "mile"
})
@Generated("jsonschema2pojo")
public class Wind {

    @JsonProperty("km")
    private Integer km;
    @JsonProperty("mile")
    private Integer mile;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("km")
    public Integer getKm() {
        return km;
    }

    @JsonProperty("km")
    public void setKm(Integer km) {
        this.km = km;
    }

    @JsonProperty("mile")
    public Integer getMile() {
        return mile;
    }

    @JsonProperty("mile")
    public void setMile(Integer mile) {
        this.mile = mile;
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
