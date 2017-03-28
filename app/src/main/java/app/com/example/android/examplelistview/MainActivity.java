package app.com.example.android.examplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listView;
    ArrayAdapter<CharSequence> adapter;
    /*
    ArrayAdapter<String> adapter;
    private String[] countries_name={
            "Indonesia","Malaysia","Singapura","Thailand"
    };
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        adapter = ArrayAdapter.createFromResource(this,R.array.countries_arry,android.R.layout.simple_list_item_1);
        //adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list, menu);
        return true;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //String message="kamu memilih "+((TextView)view).getText();
        //Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show();

    }
}
