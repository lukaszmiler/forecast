package com.miler.forecast;

import com.miler.forecast.model.ForecastModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


@org.springframework.stereotype.Controller
public class Controller {


    private ForecastModel getForecast() {
        RestTemplate restTemplate = new RestTemplate();
        ForecastModel forecastModel = restTemplate.getForObject("https://weatherdbi.herokuapp.com/data/weather/gdansk", ForecastModel.class);
        return forecastModel;
    }

    @GetMapping("/forecast")
    public String get(Model model) {
        model.addAttribute("forecast", getForecast());
        System.out.println(model);
        return "forecast";
    }


}