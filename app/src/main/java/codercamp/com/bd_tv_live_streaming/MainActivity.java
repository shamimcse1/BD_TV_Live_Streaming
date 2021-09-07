package codercamp.com.bd_tv_live_streaming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import codercamp.com.bd_tv_live_streaming.About.AboutActivity;
import codercamp.com.bd_tv_live_streaming.Adapter.RecyclerviewAdapter;
import codercamp.com.bd_tv_live_streaming.Model.ModelView;

public class MainActivity extends AppCompatActivity  {

    RecyclerView recyclerView;
    RecyclerviewAdapter adapter;
    private List<ModelView> list = new ArrayList<>();


    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.RecyclerviewID);
        adapter = new RecyclerviewAdapter(list,this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3, GridLayout.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        LoadData();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:

                //Toast.makeText(this, "About Me", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, AboutActivity.class));
                break;
            case R.id.share:
                //Toast.makeText(this, "Share it", Toast.LENGTH_SHORT).show();
                String Messages = "Please Share This App.";
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, Messages);
                startActivity(Intent.createChooser(intent, "Share text via"));
                break;

        }
        return true;
    }


    private void LoadData() {


        ModelView modelView = new ModelView("BTV World", R.drawable.btv);
        list.add(modelView);//1

        modelView = new ModelView("Somoy News", R.drawable.somoynews);
        list.add(modelView);//2
        modelView = new ModelView("Jamuna TV", R.drawable.jamuna);
        list.add(modelView);//3
        modelView = new ModelView("Atn Islamic", R.drawable.atnislamictv);
        list.add(modelView);//4
        modelView = new ModelView("ATN News ", R.drawable.atn);
        list.add(modelView);//5
        modelView = new ModelView("Boishakhi TV", R.drawable.boishakhi);
        list.add(modelView);//6
        modelView = new ModelView("CHANNEL 24", R.drawable.channel24);
        list.add(modelView);//7
        modelView = new ModelView("CHANNEL 9", R.drawable.ch9);
        list.add(modelView);//8
        modelView = new ModelView("CHANNEL I", R.drawable.chi);
        list.add(modelView);//9
        modelView = new ModelView("DBC News", R.drawable.dbc);
        list.add(modelView);//10
        modelView = new ModelView("Desh TV", R.drawable.deshtv);
        list.add(modelView);//11

        modelView = new ModelView("Ekattor TV", R.drawable.ekattor);
        list.add(modelView);//12
        modelView = new ModelView("Independent", R.drawable.inds);
        list.add(modelView);//13
        modelView = new ModelView("Mohona TV", R.drawable.mohona);
        list.add(modelView);//14
        modelView = new ModelView("My TV", R.drawable.mytv);
        list.add(modelView);//15
        modelView = new ModelView("News 24", R.drawable.news24);
        list.add(modelView);//16
        modelView = new ModelView("SaTV", R.drawable.satvs);
        list.add(modelView);//17
        modelView = new ModelView("R Tv", R.drawable.rtvbd);
        list.add(modelView);//18
    }


}