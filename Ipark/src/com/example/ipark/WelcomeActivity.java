package com.example.ipark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class WelcomeActivity extends Activity {

	private final long SPLASH_LENGTH = 2000;    
    Handler handler = new Handler();  
    public void onCreate(Bundle savedInstanceState) {  
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_welcome);  
    handler.postDelayed(new Runnable() {  //使用handler的postDelayed实现延时跳转  
          
        public void run() {    
            Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);    
            startActivity(intent);    
            finish();       
        }    
    }, SPLASH_LENGTH);//2秒后跳转至应用主界面MainActivity  
      
}  
}
