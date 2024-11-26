package com.example.alumniportal;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {
    private List<Event> eventList;
    public EventAdapter(List<Event> eventList) {
        this.eventList = eventList;
    }
    @NonNull @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event, parent, false);
        return new EventViewHolder(view);
    } @Override public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Event event = eventList.get(position);
        holder.textViewName.setText(event.getName());
        holder.textViewDetails.setText(event.getDetails());
    } @Override public int getItemCount()
    { return eventList.size(); }
    public static class EventViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName, textViewDetails;
        public EventViewHolder(@NonNull View itemView) {
            super(itemView); textViewName = itemView.findViewById(R.id.textViewName);
            textViewDetails = itemView.findViewById(R.id.textViewDetails);
        }
    }
}