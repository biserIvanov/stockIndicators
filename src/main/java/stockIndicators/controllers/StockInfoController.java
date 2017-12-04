package stockIndicators.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import stockIndicators.entities.StockInfo;

@RestController
public class StockInfoController {

    @RequestMapping("/getStockInfo")
    public StockInfo getStockInfo(@RequestParam(value="id", defaultValue="AAPL") String stockSymbol) {
        return new StockInfo(stockSymbol, 18, 6);
    }
}
