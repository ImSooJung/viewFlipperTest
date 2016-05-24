package kr.hs.emirim.sjung.viewflippertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper viewwFlip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butPrev=(Button)findViewById(R.id.but_prev);
        Button butNext=(Button)findViewById(R.id.but_next);
        butPrev.setOnClickListener(this);
        butNext.setOnClickListener(this);
        viewwFlip=(ViewFlipper)findViewById(R.id.view_flip);//요소이름과 똑같은 클래스가 메모리에 적재되는 것

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        //버튼이랑 핸들러를 연결해주는 메소드
        switch(v.getId()){
            case R.id.but_prev:
                viewwFlip.showPrevious();//이전화면 보여줌
                break;
            case R.id.but_next:
                viewwFlip.showNext();
                break;
    }
}
