package com.flight.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FlightApiController {
    private final FlightApiService flightApiService;

    @Autowired
    public FlightApiController(FlightApiService flightApiService) {
        this.flightApiService = flightApiService;
    }

    @GetMapping("/flights")
    public String getFlights(@RequestParam String airport, Model model) {
        // 1. APIからレスポンス全体を取得
        FlightApiResponse response = flightApiService.getFlights(airport);

        // 2. data 部分だけを取り出す
        List<FlightApiResponse.FlightData> flights = response.getData();

        // 航空会社名 → ロゴファイル名 のマッピング
        for (FlightApiResponse.FlightData f : flights) {
            String airline = f.getAirline().getName();
            String logoFile = "default.png"; // デフォルト

            if ("Japan Airlines".equalsIgnoreCase(airline)) {
                logoFile = "JAL-logo.jpg";
            } else if ("ANA".equalsIgnoreCase(airline) || "All Nippon Airways".equalsIgnoreCase(airline)) {
                logoFile = "ANA-logo.jpg";
            } else if ("Peach Aviation".equalsIgnoreCase(airline)) {
                logoFile = "Peach-logo.jpg";
            } else if ("Hawaiian Airlines".equalsIgnoreCase(airline)) {
                logoFile = "Hawaiian-logo.jpg";
            } else if ("American Airlines".equalsIgnoreCase(airline)) {
                logoFile = "American-logo.jpg";
            } else if ("Delta Air Lines".equalsIgnoreCase(airline)) {
                logoFile = "Delta-logo.jpg";
            } else if ("United Airlines".equalsIgnoreCase(airline)) {
                logoFile = "United-logo.jpg";
            } else if ("Air France".equalsIgnoreCase(airline)) {
                logoFile = "AirFrance-logo.jpg";
            } else if ("Cathay Pacific".equalsIgnoreCase(airline)) {
                logoFile = "CathayPacific-logo.jpg";
            } else if("Singapore Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Singapore-logo.jpg";
            } else if("Turkish Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Turkish-logo.jpg";
            } else if("Virgin Australia".equalsIgnoreCase(airline)) {
            	logoFile = "VirginAustralia-logo.jpg";
            } else if("Finnair".equalsIgnoreCase(airline)) {
            	logoFile = "Finnair-logo.jpg";
            } else if("Thai Airways International".equalsIgnoreCase(airline)) {
            	logoFile = "Thai-logo.jpg";
            } else if("Vietnam Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Vietnam-logo.jpg";
            } else if("Korean Air".equalsIgnoreCase(airline)) {
            	logoFile = "Korean-logo.jpg";
            } else if("Asiana Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Asiana-logo.jpg";
            } else if("Skymark Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Skymark-logo.jpg";
            } else if("StarFlyer".equalsIgnoreCase(airline)) {
            	logoFile = "StarFlyer-logo.jpg";
            } else if("Jetstar".equalsIgnoreCase(airline)) {
            	logoFile = "Jetstar-logo.jpg";
            } else if("China Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "China-logo.jpg";
            } else if("Philippine Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Philippine-logo.jpg";
            } else if("Malaysia Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Malaysia-logo.jpg";
            } else if("British Airways".equalsIgnoreCase(airline)) {
            	logoFile = "British-logo.jpg";
            } else if("Finnair".equalsIgnoreCase(airline)) {
            	logoFile = "Finnair-logo.jpg";
            } else if("FedEx".equalsIgnoreCase(airline)) {
            	logoFile = "Fedex-logo.jpg";
            } else if("Air Asia".equalsIgnoreCase(airline)) {
            	logoFile = "AirAsia-logo.jpg";
            } else if("Jetstar Japan".equalsIgnoreCase(airline)) {
            	logoFile = "Jetstar-logo.jpg";
            } else if("Japan Transocean Air".equalsIgnoreCase(airline)) {
            	logoFile = "JapanTransoceanAir-logo.jpg";
            } else if("Spring Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Spring-logo.jpg";
            } else if("Thai Vietjet Air".equalsIgnoreCase(airline)) {
            	logoFile = "ThaiVietjet-logo.jpg";
            } else if("El Al".equalsIgnoreCase(airline)) {
            	logoFile = "El_Al-logo.jpg";
            } else if("Emirates".equalsIgnoreCase(airline)) {
            	logoFile = "Emirates-logo.jpg";
            } else if("Austrian Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Austrian-logo.jpg";
            } else if("KLM".equalsIgnoreCase(airline)) {
            	logoFile = "KLM-logo.jpg";
            } else if("Qantas".equalsIgnoreCase(airline)) {
            	logoFile = "Qantas-logo.jpg";
            } else if("Qatar Airways".equalsIgnoreCase(airline)) {
            	logoFile = "Qatar-logo.jpg";
            } else if("Air Do".equalsIgnoreCase(airline)) {
            	logoFile = "AirDo-logo.jpg";
            } else if("Air Busan".equalsIgnoreCase(airline)) {
            	logoFile = "AirBusan-logo.jpg";
            } else if("Iberia".equalsIgnoreCase(airline)) {
            	logoFile = "Iberia-logo.jpg";
            } else if("Hong Kong Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Hongkong-logo.jpg";
            } else if("AlphaSky".equalsIgnoreCase(airline)) {
            	logoFile = "Alphasky-logo.jpg";
            } else if("Air India".equalsIgnoreCase(airline)) {
            	logoFile = "AirIndia-logo.jpg";
            } else if("Garuda Indonesia".equalsIgnoreCase(airline)) {
            	logoFile = "GarudaIndonesia-logo.jpg";
            } else if("ITA Airways".equalsIgnoreCase(airline)) {
            	logoFile = "ITA-Airways-logo.jpg";
            } else if("Jeju Air".equalsIgnoreCase(airline)) {
            	logoFile = "Jeju_Air-logo.jpg";
            } else if("Shanghai Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Shanghai-logo.jpg";
            } else if("Solaseed Air".equalsIgnoreCase(airline)) {
            	logoFile = "SolaseedAir-logo.jpg";
            } else if("Ethiopian Airlines".equalsIgnoreCase(airline)) {
            	logoFile = "Ethiopian-logo.jpg";
            } else if("Fiji Airways".equalsIgnoreCase(airline)) {
            	logoFile = "Fiji-logo.jpg";
            } else if("Air Canada".equalsIgnoreCase(airline)) {
            	logoFile = "AirCanada-logo.jpg";
            } else if("Bangkok Airways".equalsIgnoreCase(airline)) {
            	logoFile = "Bangkok-logo.jpg";
            } else if("IndiGo".equalsIgnoreCase(airline)) {
            	logoFile = "IndiGo-logo.jpg";
            } else if("Hong Kong Express".equalsIgnoreCase(airline)) {
            	logoFile = "HK_Express-logo.jpg";
            } else if("Air Hong Kong".equalsIgnoreCase(airline)) {
            	logoFile = "AirHongkong-logo.jpg";
            } 

            f.getAirline().setLogo(logoFile);
        }

        model.addAttribute("flights", flights);
        return "flights";
    }
}

