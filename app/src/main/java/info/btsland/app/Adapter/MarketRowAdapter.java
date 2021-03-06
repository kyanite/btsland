package info.btsland.app.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

import info.btsland.app.R;
import info.btsland.app.model.Market;
import info.btsland.app.ui.fragment.MarketSimpleKFragment;

/**
 * Created by Administrator on 2017/10/16.
 */

public class MarketRowAdapter extends BaseAdapter {
    private MarketSimpleKFragment simpleKFragment;
    private List<Market> markets;
    private LayoutInflater inflater;
    private Context context;

    public MarketRowAdapter(MarketSimpleKFragment simpleKFragment, Context context, List<Market> markets) {
        this.simpleKFragment = simpleKFragment;
        this.markets = markets;
        Log.e("marketAdaper", "MarketRowAdapter:  "+markets.size());
        for(int i=0;i<markets.size();i++){
            Log.e("marketAdaper", "MarketRowAdapter:  "+markets.get(i).toString());
        }
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return markets.size();
    }

    @Override
    public Object getItem(int i) {
        return markets.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup viewGroup) {
        final Market market = markets.get(i);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.fragment_market_row, null);
            TextView tvCoin = convertView.findViewById(R.id.tv_coin);
            TextView tvFluctuation = convertView.findViewById(R.id.tv_fluctuation);
            TextView tvNewPrice = convertView.findViewById(R.id.tv_newPrice);
            TextView tvBestAskNum = convertView.findViewById(R.id.tv_bestAskNum);
            TextView tvBestBidNum = convertView.findViewById(R.id.tv_bestBidNum);

            String fluctuation= String.valueOf(market.getFluctuation())+"%";
            Log.e("getView", "fluctuation: "+ fluctuation);
            tvFluctuation.setText(fluctuation);
            DecimalFormat df = new DecimalFormat();
            df.applyPattern("0.00000000");
            tvNewPrice.setText(df.format(market.getNewPrice()));
            tvBestAskNum.setText(df.format(market.getBestAsk()));
            tvBestBidNum.setText(df.format(market.getBestBid()));
            if (market.getFluctuation() >= 0) {
                ;
                tvFluctuation.setTextColor(context.getResources().getColor(R.color.color_green));
                tvNewPrice.setTextColor(context.getResources().getColor(R.color.color_green));
            } else {
                tvFluctuation.setTextColor(context.getResources().getColor(R.color.color_font_red));
                tvNewPrice.setTextColor(context.getResources().getColor(R.color.color_font_red));
            }

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("onClick", "onClick: market1:" + market.getLeftCoin() + ":" + market.getRightCoin());
                    simpleKFragment.startReceiveMarkets(market);
                }
            });
        }else{
            TextView tvCoin = convertView.findViewById(R.id.tv_coin);
            TextView tvFluctuation = convertView.findViewById(R.id.tv_fluctuation);
            TextView tvNewPrice = convertView.findViewById(R.id.tv_newPrice);
            TextView tvBestAskNum = convertView.findViewById(R.id.tv_bestAskNum);
            TextView tvBestBidNum = convertView.findViewById(R.id.tv_bestBidNum);

            tvCoin.setText(market.getLeftCoin());
            String fluctuation= String.valueOf(market.getFluctuation())+"%";
            Log.e("getView", "fluctuation: "+ fluctuation);
            tvFluctuation.setText(fluctuation);
            DecimalFormat df = new DecimalFormat();
            df.applyPattern("0.00000000");
            tvNewPrice.setText(df.format(market.getNewPrice()));
            tvBestAskNum.setText(df.format(market.getBestAsk()));
            tvBestAskNum.setText(df.format(market.getBestBid()));
            if (market.getFluctuation() >= 0) {
                ;
                tvFluctuation.setTextColor(context.getResources().getColor(R.color.color_green));
                tvNewPrice.setTextColor(context.getResources().getColor(R.color.color_green));
            } else {
                tvFluctuation.setTextColor(context.getResources().getColor(R.color.color_font_red));
                tvNewPrice.setTextColor(context.getResources().getColor(R.color.color_font_red));
            }

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("onClick", "onClick: market1:" + market.getLeftCoin() + ":" + market.getRightCoin());
                    simpleKFragment.startReceiveMarkets(market);
                }
            });
        }
        return convertView;
    }
}
