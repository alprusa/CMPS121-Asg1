package com.dealfaro.luca.lclicker;

    import android.os.Bundle;
    import android.support.v7.app.ActionBarActivity;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.Button;
    import android.widget.TextView;

    import java.util.ArrayList;
    import java.util.List;


    public class MainActivity extends ActionBarActivity {
        private List<String> phoneNum = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View v) {
        Button b = (Button) v;
        String t = b.getText().toString();
        TextView tv = (TextView) findViewById(R.id.textView);
        phoneNum.add(t);
        String values = "";
        for(int i = 0; i < phoneNum.size(); ++i) {
            values += phoneNum.get(i);
            if(i > 12) break;
        }
        tv.setText(values);
    }

    public void clickDel(View v){
        if(phoneNum.size() > 0) {
            Button b = (Button) v;
            String t = b.getText().toString();
            TextView tv = (TextView) findViewById(R.id.textView);
            phoneNum.remove(phoneNum.size() - 1);
            String values = "";
            for(int i = 0; i < phoneNum.size(); ++i) {
                values += phoneNum.get(i);
            }
            tv.setText(values);
        }
    }

    public void clickCall(View v){
         if(phoneNum.size() > 0) {
             //String deleteValue = phoneNum.get(phoneNum.size() - 1);
             Button b = (Button) v;
             String t = b.getText().toString();
             TextView tv = (TextView) findViewById(R.id.textView);
             String values = "";
            // for(int i = phoneNum.size() - 1; i > 0; ++i) {
                 phoneNum.clear();
             //}
             tv.setText(values);
         }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
