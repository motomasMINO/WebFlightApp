package com.flight.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// フライト情報をAPIから取得するサービスクラス
@Service
public class FlightApiService {
    private final RestTemplate restTemplate = new RestTemplate(); // RestTemplateを使用してHTTPリクエストを送信
    private final String API_KEY = "ca650a0a92b7a10024fe33c6f8013953"; // ←取得したAPIキーを設定

    // 指定した空港コードに基づいてフライト情報をAPIから取得するメソッド
    public FlightApiResponse getFlights(String depAirportCode) {
        // APIエンドポイントURLを構築
        String url = "http://api.aviationstack.com/v1/flights"
                   + "?access_key=" + API_KEY
                   + "&dep_iata=" + depAirportCode; // 例: HND, KIX
        return restTemplate.getForObject(url, FlightApiResponse.class); // APIからレスポンスを取得し、FlightApiResponseクラスにマッピングして返す
    }
}
