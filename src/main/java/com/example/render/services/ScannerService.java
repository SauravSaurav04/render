package com.example.render.services;

import java.util.List;

public interface ScannerService {
    List<String> scanStocks(String interval, double threshold, int ema);
}
