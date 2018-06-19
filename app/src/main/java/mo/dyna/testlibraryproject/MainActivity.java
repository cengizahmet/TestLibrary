package mo.dyna.testlibraryproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import mo.dyna.testlibrary.TestLibrary;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "" +TestLibrary.multiple(1,2), Toast.LENGTH_SHORT).show();

    }
}
