package www.ittepic.edu.objectanimator;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private LinearLayout canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
        //canvas = (LinearLayout) findViewById(R.id.animationCanvas);
        final Animation animAccelerate = AnimationUtils.loadAnimation(this, R.anim.accelerate);
        final Animation animBounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        final Animation animDecelerate = AnimationUtils.loadAnimation(this, R.anim.decelerate);
        Button btnAccelerate = (Button)findViewById(R.id.accelerate);
        Button btnBounce = (Button)findViewById(R.id.bounce);
        Button btnDecelerate = (Button)findViewById(R.id.decelerate);

        btnAccelerate.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                imageView.startAnimation(animAccelerate);

            }});

        btnBounce.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                 imageView.startAnimation(animBounce);
            }
        });

        btnDecelerate.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                imageView.startAnimation(animDecelerate);

            }});
    }

    //public void accelerate(View v){
        //ObjectAnimator animacion = ObjectAnimator
      //  animacion.setInterpolator(new AccelerateInterpolator());
    //}
    /*public void onButtonClick(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getHeight();
        //int targetY = screenHeight - imageView.getHeight();

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, "y", 100, -targetY)
                .setDuration(1000);
        animator.reverse();
        animator.setInterpolator(new BounceInterpolator());
        animator.start();
    }*/


}
