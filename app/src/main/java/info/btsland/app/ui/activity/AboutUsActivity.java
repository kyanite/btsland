package info.btsland.app.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import info.btsland.app.R;
import info.btsland.app.ui.fragment.HeadFragment;

public class AboutUsActivity extends AppCompatActivity {

    private HeadFragment headFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        fillInHead();
        init();
    }

    /**
     * 初始化
     */
    private void init() {
    }

    /**
     * 装载顶部导航
     */
    private void fillInHead() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (headFragment == null) {
            headFragment = new HeadFragment();
            headFragment.setType(HeadFragment.HeadType.BACK_NULL);
            headFragment.setTitleName("关于我们");
            transaction.add(R.id.fra_about_head, headFragment);
        }
        transaction.commit();
    }


}
