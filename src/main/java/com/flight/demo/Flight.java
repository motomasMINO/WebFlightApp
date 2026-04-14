package com.flight.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// フライト情報を表すエンティティクラス
@Entity
@Table(name = "flight") // テーブル名を "flight" に指定
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDは自動生成
    private Long id;

    @Column(name = "flight_number")
    private String flightNumber; // フライト番号

    private String airline; // 航空会社名

    @Column(name = "departure_airport")
    private String departureAirport; // 出発空港コード

    @Column(name = "arrival_airport")
    private String arrivalAirport; // 到着空港コード

    @Column(name = "departure_time")
    private String departureTime; // 出発時間

    @Column(name = "arrival_time")
    private String arrivalTime; // 到着時間

    // ゲッターとセッター
    public Long getId() {
        return id; // IDを取得
    }

    public void setId(Long id) {
        this.id = id; // IDを設定(自動)
    }

    public String getFlightNumber() {
        return flightNumber; // フライト番号を取得
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber; // フライト番号を設定
    }

    public String getAirline() {
        return airline; // 航空会社名を取得
    }

    public void setAirline(String airline) {
        this.airline = airline; // 航空会社名を設定
    }

    public String getDepartureAirport() {
        return departureAirport; // 出発空港コードを取得
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport; // 出発空港コードを設定
    }

    public String getArrivalAirport() {
        return arrivalAirport; // 到着空港コードを取得
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport; // 到着空港コードを設定
    }

    public String getDepartureTime() {
        return departureTime; // 出発時間を取得
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime; // 出発時間を設定
    }

    public String getArrivalTime() {
        return arrivalTime; // 到着時間を取得
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime; // 到着時間を設定
    }
}
