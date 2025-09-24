package com.flight.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    // 必要に応じて検索メソッド追加
}
