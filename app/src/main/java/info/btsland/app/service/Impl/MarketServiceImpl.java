package info.btsland.app.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import info.btsland.app.model.Market;
import info.btsland.app.service.MarketService;

/**
 * author：
 * function：
 * 2017/9/27.
 */

public class MarketServiceImpl implements MarketService {

    @Override
    public Map<String,List<Market>> getallinformation() {

    /*    Market market =new Market();
        market.setLeftCoin("BTS");
        market.setRightCoin("BTC");
        market.setNewPrice("0.00002109");
        market.setBestBid("0.00002105");
        market.setBestAsk("0.00002121");
        market.setVolume("20.734");
        market.setTurnover("1.02M");
        market.setFluctuation("+3.11%");

        List<Market> list=new ArrayList<Market>();
        list.add(market);*/
/**
 * BTS测试数据
 */
        List<Market> listBTC=new ArrayList<Market>();
        listBTC.add(new Market("BTS","BTC","0.00002109","0.00002105","0.00002121","7.808",-0.88f));
        listBTC.add(new Market("bitCNY","BTC","0.00003593","0.00001987","0.00002000","3.634",-4.72f));
        listBTC.add(new Market("bitUSD","BTC","0.00024433","0.00024433","0.00024804","2.588",22.17f));
        listBTC.add(new Market("ETH","BTC","0.7018957","0.06978142","0.07018208","0.147",-0.48f));
        listBTC.add(new Market("IMIAO","BTC","1","1","1","1",0f));
        listBTC.add(new Market("BTS","BTC","0.00002109","0.00002105","0.00002121","7.808",-0.88f));
        listBTC.add(new Market("bitCNY","BTC","0.00003593","0.00001987","0.00002000","3.634",-4.72f));
        listBTC.add(new Market("bitUSD","BTC","0.00024433","0.00024433","0.00024804","2.588",22.17f));
        listBTC.add(new Market("ETH","BTC","0.7018957","0.06978142","0.07018208","0.147",-0.48f));
        listBTC.add(new Market("IMIAO","BTC","1","1","1","1",0f));
        listBTC.add(new Market("BTS","BTC","0.00002109","0.00002105","0.00002121","7.808",-0.88f));
        listBTC.add(new Market("bitCNY","BTC","0.00003593","0.00001987","0.00002000","3.634",-4.72f));
        listBTC.add(new Market("bitUSD","BTC","0.00024433","0.00024433","0.00024804","2.588",22.17f));
        listBTC.add(new Market("ETH","BTC","0.7018957","0.06978142","0.07018208","0.147",-0.48f));
        listBTC.add(new Market("IMIAO","BTC","1","1","1","1",0f));
        /**
         * bitCNY测试数据
         */
        List<Market> listbitCNY =new ArrayList<Market>();
        listbitCNY.add(new Market("BTC","bitCNY","27490.00171","26999.99919","27489.99802","156.95k",10.27f));
        listbitCNY.add(new Market("BTS","bitCNY","0.576000","0.573000","0.576300","3.44M",13.18f));
        listbitCNY.add(new Market("bitUSD","bitCNY","6.80921","6.78063","6.80850","94.02k",1.76f));
        listbitCNY.add(new Market("ETH","bitCNY","2000.00000","1998.62926","2000.00000","113.84k",7.94f));
        listbitCNY.add(new Market("IMIAO","bitCNY","1","1","1","1",0f));
        listbitCNY.add(new Market("BTC","bitCNY","27490.00171","26999.99919","27489.99802","156.95k",10.27f));
        listbitCNY.add(new Market("BTS","bitCNY","0.576000","0.573000","0.576300","3.44M",13.18f));
        listbitCNY.add(new Market("bitUSD","bitCNY","6.80921","6.78063","6.80850","94.02k",1.76f));
        listbitCNY.add(new Market("ETH","bitCNY","2000.00000","1998.62926","2000.00000","113.84k",7.94f));
        listbitCNY.add(new Market("IMIAO","bitCNY","1","1","1","1",0f));
        listbitCNY.add(new Market("BTC","bitCNY","27490.00171","26999.99919","27489.99802","156.95k",10.27f));
        listbitCNY.add(new Market("BTS","bitCNY","0.576000","0.573000","0.576300","3.44M",13.18f));
        listbitCNY.add(new Market("bitUSD","bitCNY","6.80921","6.78063","6.80850","94.02k",1.76f));
        listbitCNY.add(new Market("ETH","bitCNY","2000.00000","1998.62926","2000.00000","113.84k",7.94f));
        listbitCNY.add(new Market("IMIAO","bitCNY","1","1","1","1",0f));
        /**
         * BTC测试数据
         */

        List<Market> listBTS =new ArrayList<Market>();
        listBTS.add(new Market("BTC","BTS","48167.88078","47508.33115","48167.56325","1.02M",-1.72f));
        listBTS.add(new Market("bitCNY","BTS","1.70000","1.72554","1.74664","6.68M",-11.84f));
        listBTS.add(new Market("bitUSD","BTS","11.78503","11.78503","11.90351","366.58k",-10.14f));
        listBTS.add(new Market("ETH","BTS","3518.64900","3476.00237","3518.64867","176.46k",-4.28f));
        listBTS.add(new Market("IMIAO","BTS","1","1","1","1",0f));
        listBTS.add(new Market("BTC","BTS","48167.88078","47508.33115","48167.56325","1.02M",-1.72f));
        listBTS.add(new Market("bitCNY","BTS","1.70000","1.72554","1.74664","6.68M",-11.84f));
        listBTS.add(new Market("bitUSD","BTS","11.78503","11.78503","11.90351","366.58k",-10.14f));
        listBTS.add(new Market("ETH","BTS","3518.64900","3476.00237","3518.64867","176.46k",-4.28f));
        listBTS.add(new Market("IMIAO","BTS","1","1","1","1",0f));
        listBTS.add(new Market("BTC","BTS","48167.88078","47508.33115","48167.56325","1.02M",-1.72f));
        listBTS.add(new Market("bitCNY","BTS","1.70000","1.72554","1.74664","6.68M",-11.84f));
        listBTS.add(new Market("bitUSD","BTS","11.78503","11.78503","11.90351","366.58k",-10.14f));
        listBTS.add(new Market("ETH","BTS","3518.64900","3476.00237","3518.64867","176.46k",-4.28f));
        listBTS.add(new Market("IMIAO","BTS","1","1","1","1",0f));
        /**
         * bitUSD测试数据
         */
        List<Market> listbitUSD =new ArrayList<Market>();
        listbitUSD.add(new Market("BTS","bitUSD","10.084100","0.084114","0.084848","29.80k",10.30f));
        listbitUSD.add(new Market("bitCNY","bitUSD","0.14749","0.14600","0.14748","14.12k",-0.85f));
        listbitUSD.add(new Market("BTC","bitUSD","4051.07188","4028.05566","4049.99978","15.52k",7.20f));
        listbitUSD.add(new Market("ETH","bitUSD","301.16279","284.39281","301.44213","308.734k",50.58f));
        listbitUSD.add(new Market("IMIAO","bitUSD","1","1","1","1",0f));
        listbitUSD.add(new Market("BTS","bitUSD","10.084100","0.084114","0.084848","29.80k",10.30f));
        listbitUSD.add(new Market("bitCNY","bitUSD","0.14749","0.14600","0.14748","14.12k",-0.85f));
        listbitUSD.add(new Market("BTC","bitUSD","4051.07188","4028.05566","4049.99978","15.52k",7.20f));
        listbitUSD.add(new Market("ETH","bitUSD","301.16279","284.39281","301.44213","308.734k",50.58f));
        listbitUSD.add(new Market("IMIAO","bitUSD","1","1","1","1",0f));
        listbitUSD.add(new Market("BTS","bitUSD","10.084100","0.084114","0.084848","29.80k",10.30f));
        listbitUSD.add(new Market("bitCNY","bitUSD","0.14749","0.14600","0.14748","14.12k",-0.85f));
        listbitUSD.add(new Market("BTC","bitUSD","4051.07188","4028.05566","4049.99978","15.52k",7.20f));
        listbitUSD.add(new Market("ETH","bitUSD","301.16279","284.39281","301.44213","308.734k",50.58f));
        listbitUSD.add(new Market("IMIAO","bitUSD","1","1","1","1",0f));


        List<Market> listETH =new ArrayList<Market>();
        listETH.add(new Market("BTC","ETH","13.99164550","14.0074603","14.28569275","3.358",-0.63f));
        listETH.add(new Market("bitUSD","ETH","0.00354500","0.00347075","20.00353766","4.052",3.68f));
        listETH.add(new Market("bitCNY","ETH","0.00028378","0.00028327","0.00028503","26.012",-0.70f));
        listETH.add(new Market("BTS","ETH","301.16279","284.39281","301.44213","308.734k",50.58f));
        listETH.add(new Market("IMIAO","ETH","1","1","1","1",0f));
        listETH.add(new Market("BTC","ETH","13.99164550","14.0074603","14.28569275","3.358",-0.63f));
        listETH.add(new Market("bitUSD","ETH","0.00354500","0.00347075","20.00353766","4.052",3.68f));
        listETH.add(new Market("bitCNY","ETH","0.00028378","0.00028327","0.00028503","26.012",-0.70f));
        listETH.add(new Market("BTS","ETH","301.16279","284.39281","301.44213","308.734k",50.58f));
        listETH.add(new Market("IMIAO","ETH","1","1","1","1",0f));
        listETH.add(new Market("BTC","ETH","13.99164550","14.0074603","14.28569275","3.358",-0.63f));
        listETH.add(new Market("bitUSD","ETH","0.00354500","0.00347075","20.00353766","4.052",3.68f));
        listETH.add(new Market("bitCNY","ETH","0.00028378","0.00028327","0.00028503","26.012",-0.70f));
        listETH.add(new Market("BTS","ETH","301.16279","284.39281","301.44213","308.734k",50.58f));
        listETH.add(new Market("IMIAO","ETH","1","1","1","1",0f));

        Map<String,List<Market>>  map=new HashMap<String,List<Market>>();
        map.put("BTS",listBTS);
        map.put("bitCNY",listbitCNY);
        map.put("BTC",listBTC);
        map.put("bitUSD",listbitUSD);
        map.put("ETH",listETH);

        return map;
    }


    @Override
    public List getnewprice() {

        List list =new ArrayList();
        list.add(1000);

        return list;
    }


}
