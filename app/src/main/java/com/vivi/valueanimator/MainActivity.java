package com.vivi.valueanimator;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator animator = ValueAnimator.ofObject(new TypeEvaluator<PointF>() {
                    @Override
                    public PointF evaluate(float fraction, PointF startValue, PointF endValue) {
                        return null;
                    }
                });
                //ValueAnimator.ofInt方法
                /*ValueAnimator animator = ValueAnimator.ofInt(0, 100);
                animator.setDuration(5000);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        Integer value = (Integer) animation.getAnimatedValue();
                        button.setText(""+value);
                    }
                });
                animator.start(); */
            }
        });
    }
}
