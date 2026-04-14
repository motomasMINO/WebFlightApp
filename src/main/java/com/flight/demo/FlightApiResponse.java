package com.flight.demo;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// APIからのレスポンス全体を表すクラス
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightApiResponse {
    private List<FlightData> data; // APIからのフライトデータのリスト

    public List<FlightData> getData() { return data; } // フライトデータのリストを取得するゲッターメソッド
    public void setData(List<FlightData> data) { this.data = data; } // フライトデータのリストを設定するセッターメソッド

    // APIレスポンス内の個々のフライトデータを表すクラス
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FlightData {
        private Flight flight; // フライト情報
        private Airline airline; // 航空会社情報
        private Departure departure; // 出発情報
        private Arrival arrival; // 到着情報

        public Flight getFlight() { return flight; } // フライト情報を取得するゲッターメソッド
        public void setFlight(Flight flight) { this.flight = flight; } // フライト情報を設定するセッターメソッド

        public Airline getAirline() { return airline; } // 航空会社情報を取得するゲッターメソッド
        public void setAirline(Airline airline) { this.airline = airline; } // 航空会社情報を設定するセッターメソッド

        public Departure getDeparture() { return departure; } // 出発情報を取得するゲッターメソッド
        public void setDeparture(Departure departure) { this.departure = departure; } // 出発情報を設定するセッターメソッド

        public Arrival getArrival() { return arrival; } // 到着情報を取得するゲッターメソッド
        public void setArrival(Arrival arrival) { this.arrival = arrival; } // 到着情報を設定するセッターメソッド

        // APIレスポンス内のフライト情報を表すクラス
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Flight {
            // APIのJSONフィールド名とJavaフィールド名が異なる場合にマッピングするためのアノテーション
            @JsonProperty("iata") // JSONのフィールド名が "iata" の場合、Javaのフィールド名は "iataCode" とする
            private String iataCode; // IATAコード（例: "AA"）

            @JsonProperty("number")
            private String flightNumber; // フライト番号（例: "100"）

            public String getIataCode() { return iataCode; } // IATAコードを取得するゲッターメソッド
            public void setIataCode(String iataCode) { this.iataCode = iataCode; } // IATAコードを設定するセッターメソッド

            public String getFlightNumber() { return flightNumber; } // フライト番号を取得するゲッターメソッド
            public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; } // フライト番号を設定するセッターメソッド
        }

        // APIレスポンス内の航空会社情報を表すクラス
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Airline {
            private String name; // 航空会社名（例: "Japan Airlines"）
            private String logo; // 航空会社のロゴURL（例: "https://example.com/logo.png"）

            public String getName() { return name; } // 航空会社名を取得するゲッターメソッド
            public void setName(String name) { this.name = name; } // 航空会社名を設定するセッターメソッド

            public String getLogo() { return logo; } // 航空会社のロゴURLを取得するゲッターメソッド
            public void setLogo(String logo) { this.logo = logo; } // 航空会社のロゴURLを設定するセッターメソッド
        }

        // APIレスポンス内の出発情報を表すクラス
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Departure {
            private String airport; // 出発空港名（例: "Tokyo Haneda"）

            // APIの日時フォーマットに合わせて、JSONからLocalDateTimeに変換するためのアノテーション
            @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX") // 例: "2024-06-01T10:00:00+09:00"
            private LocalDateTime scheduled; // 出発予定日時

            public String getAirport() { return airport; } // 出発空港名を取得するゲッターメソッド
            public void setAirport(String airport) { this.airport = airport; } // 出発空港名を設定するセッターメソッド

            public LocalDateTime getScheduled() { return scheduled; } // 出発予定日時を取得するゲッターメソッド
            public void setScheduled(LocalDateTime scheduled) { this.scheduled = scheduled; } // 出発予定日時を設定するセッターメソッド
        }

        // APIレスポンス内の到着情報を表すクラス
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Arrival {
            private String airport; // 到着空港名（例: "Hawaii Honolulu HNL"）

            @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX") // 例: "2024-06-01T15:00:00+09:00"
            private LocalDateTime scheduled; // 到着予定日時

            public String getAirport() { return airport; } // 到着空港名を取得するゲッターメソッド
            public void setAirport(String airport) { this.airport = airport; } // 到着空港名を設定するセッターメソッド

            public LocalDateTime getScheduled() { return scheduled; } // 到着予定日時を取得するゲッターメソッド
            public void setScheduled(LocalDateTime scheduled) { this.scheduled = scheduled; } // 到着予定日時を設定するセッターメソッド
        }
    }
}