package vera.moon.com.b5_griddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Prases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prases);
    }

    public void taped(View v){

        //obtiene id del view del sistema
        int id = v.getId();
        String ourid = "";

        //Este nos da el id del objeto con base al id del sistema
        //usa v.getResources().getResourcesEntryName(id)
        ourid = v.getResources().getResourceEntryName(id);

        Log.i("Button tap",v.getId()+"");

        //Show
        Toast.makeText(this,ourid,Toast.LENGTH_SHORT).show();

    }
}
