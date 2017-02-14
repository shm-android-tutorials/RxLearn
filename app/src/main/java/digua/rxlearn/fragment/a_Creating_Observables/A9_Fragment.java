package digua.rxlearn.fragment.a_Creating_Observables;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import digua.rxlearn.R;
import digua.rxlearn.fragment.other.BaseFragment;
import digua.rxlearn.fragment.other.NoScrollListView;
import rx.Observable;
import rx.Observer;
import rx.Subscription;

/**
 * @author digua
 *         <p>
 *         on 2017/2/7.(^ ^)
 */

public class A9_Fragment extends BaseFragment {

    @BindView(R.id.textview) TextView textview;

    Subscription subscribe;

    @BindView(R.id.list_threading_log) NoScrollListView _logsList;

    @Override
    public NoScrollListView setupListView() {
        return _logsList;
    }

    @Override
    public View setupView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a9, container, false);
        return view;
    }

    /**
     * 点击事件
     */
    @OnClick({R.id.start})
    public void clickEvent(View view) {
        clear();
        switch (view.getId()) {
            case R.id.start:
                sample1();
                break;
        }
    }

    private void sample1() {




    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if(subscribe != null){
            subscribe.unsubscribe();
        }
    }
}
