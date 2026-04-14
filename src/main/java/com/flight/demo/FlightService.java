package com.flight.demo;

import org.springframework.stereotype.Service;
import java.util.List;

// Flightエンティティのビジネスロジックを担当するサービスクラス
@Service
public class FlightService {
    private final FlightRepository repository;

    public FlightService(FlightRepository repository) {
        this.repository = repository;
    }

    // データベースからすべてのフライト情報を取得するメソッド
    public List<Flight> getAllFlights() {
        return repository.findAll(); // データベースからすべてのフライト情報を取得して返す
    }
}

