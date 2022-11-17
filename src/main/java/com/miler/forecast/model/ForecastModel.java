
package com.miler.forecast.model;

import java.util.HashMap;
import java.util.List;
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
    "region",
    "currentConditions",
    "next_days",
    "contact_author",
    "data_source"
})
@Generated("jsonschema2pojo")
public class ForecastModel {

    @JsonProperty("region")
    private String region;
    @JsonProperty("currentConditions")
    private CurrentConditions currentConditions;
    @JsonProperty("next_days")
    private List<NextDay> nextDays = null;
    @JsonProperty("contact_author")
    private ContactAuthor contactAuthor;
    @JsonProperty("data_source")
    private String dataSource;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
