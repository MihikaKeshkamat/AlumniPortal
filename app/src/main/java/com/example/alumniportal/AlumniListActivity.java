package com.example.alumniportal;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
public class AlumniListActivity extends AppCompatActivity{
    private ListView listViewAlumni;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> alumniList;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni_list);
        listViewAlumni = findViewById(R.id.listViewAlumni);
        alumniList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alumniList);
        listViewAlumni.setAdapter(adapter); alumniList.add("John Doe");
        alumniList.add("Jane Smith");
        alumniList.add("Michael Brown");
        adapter.notifyDataSetChanged();
    }
}
