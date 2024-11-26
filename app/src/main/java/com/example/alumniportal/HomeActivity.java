package com.example.alumniportal;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private EditText editTextEventName, editTextEventDetails;
    private Button buttonAddEvent;
    private RecyclerView recyclerViewEvents;
    private EventAdapter eventAdapter;
    private List<Event> eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        editTextEventName = findViewById(R.id.editTextEventName);
        editTextEventDetails = findViewById(R.id.editTextEventDetails);
        buttonAddEvent = findViewById(R.id.buttonAddEvent);
        recyclerViewEvents = findViewById(R.id.recyclerViewEvents);

        eventList = new ArrayList<>();
        eventAdapter = new EventAdapter(eventList);
        recyclerViewEvents.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewEvents.setAdapter(eventAdapter);

        buttonAddEvent.setOnClickListener(v -> {
            String name = editTextEventName.getText().toString().trim();
            String details = editTextEventDetails.getText().toString().trim();

            if (name.isEmpty() || details.isEmpty()) {
                Toast.makeText(HomeActivity.this, "Please enter event name and details", Toast.LENGTH_SHORT).show();
                return;
            }

            Event event = new Event(name, details, System.currentTimeMillis());
            eventList.add(0, event); // Add new event at the top
            eventAdapter.notifyDataSetChanged();

            // Clear input fields
            editTextEventName.setText("");
            editTextEventDetails.setText("");
        });
    }
}


