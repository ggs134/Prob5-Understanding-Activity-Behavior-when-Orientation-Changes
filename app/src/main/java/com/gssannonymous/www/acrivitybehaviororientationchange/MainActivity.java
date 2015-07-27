package com.gssannonymous.www.acrivitybehaviororientationchange;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("상태 정보", "onCreate");

        //현재 디스플레이 정보
        WindowManager wm=getWindowManager();
        Display d=wm.getDefaultDisplay();

        //getSize()와 getWidth()는 삭제됨
        //getRotaion()메소드 사용
        if(d.getRotation()== Surface.ROTATION_0){
            Log.d("디스플레이상태","0도 돌아감");
        }
        else if(d.getRotation()== Surface.ROTATION_90){
            Log.d("디스플레이상태","90도 돌아감");
        }
        else if(d.getRotation()== Surface.ROTATION_180){
            Log.d("디스플레이상태","180도 돌아감");
        }
        else if(d.getRotation()== Surface.ROTATION_270){
            Log.d("디스플레이상태","270도 돌아감");
        }

        //특정 화면모드로 동작하도록 세팅
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    public void onStart(){
        Log.d("상태정보", "onStart");
        super.onStart();
    }
    public void onResume(){
        Log.d("상태정보", "onRsume");
        super.onResume();
    }
    public void onPause(){
        Log.d("상태정보", "onPause");
        super.onPause();
    }
    public void onStop(){
        Log.d("상태정보", "onStop");
        super.onStop();
    }
    public void onDestroy(){
        Log.d("상태정보", "onDestroy");
        super.onDestroy();
    }
    public void onRestart(){
        Log.d("상태정보", "onResrart");
        super.onRestart();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d("상태정보", "onSaveInstanceState");
        outState.putString("ID", "1234567");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d("상태정보", "onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        String ID=savedInstanceState.getString("ID");
        Log.d("살아난뒤",ID);
    }

//    onRetainNonConfigurationInstance는
//    http://regularmotion.kr/android-handling-configuration-changes-with-fragments/
//    에서 다시 공부해서 해야함. 쓰레드, 소켓, 싱크 등의 개체를 저장하는 법에 관한 내용용
}
