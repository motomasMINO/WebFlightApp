package com.flight.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightApiResponse {
    private List<FlightData> data;

    public List<FlightData> getData() { return data; }
    public void setData(List<FlightData> data) { this.data = data; }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FlightData {
        private Flight flight;
        private Airline airline;
        private Departure departure;
        private Arrival arrival;

        public Flight getFlight() { return flight; }
        public void setFlight(Flight flight) { this.flight = flight; }

        public Airline getAirline() { return airline; }
        public void setAirline(Airline airline) { this.airline = airline; }

        public Departure getDeparture() { return departure; }
        public void setDeparture(Departure departure) { this.departure = departure; }

        public Arrival getArrival() { return arrival; }
        public void setArrival(Arrival arrival) { this.arrival = arrival; }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Flight {
            @JsonProperty("iata")
            private String iataCode;

            @JsonProperty("number")
            private String flightNumber;

            public String getIataCode() { return iataCode; }
            public void setIataCode(String iataCode) { this.iataCode = iataCode; }

            public String getFlightNumber() { return flightNumber; }
            public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Airline {
            private String name;
            private String logo;

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public String getLogo() { return logo; }
            public void setLogo(String logo) { this.logo = logo; }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Departure {
            private String airport;

            @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
            private LocalDateTime scheduled;

            public String getAirport() { return airport; }
            public void setAirport(String airport) { this.airport = airport; }

            public LocalDateTime getScheduled() { return scheduled; }
            public void setScheduled(LocalDateTime scheduled) { this.scheduled = scheduled; }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Arrival {
            private String airport;

            @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
            private LocalDateTime scheduled;

            public String getAirport() { return airport; }
            public void setAirport(String airport) { this.airport = airport; }

            public LocalDateTime getScheduled() { return scheduled; }
            public void setScheduled(LocalDateTime scheduled) { this.scheduled = scheduled; }
        }
    }
}