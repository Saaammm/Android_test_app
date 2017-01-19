package junit2.example.com.junitsample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Eegasampath_Kumar on 12/22/2016.
 */
public class WelcomeActivity extends Activity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        textView = (TextView) findViewById(R.id.greeting_text);
        Bundle extras = getIntent().getExtras();
        if(extras !=null) {
            String name = extras.getString("name");
            textView.setText(name);
        }
    }
}
