package com.example.notify;

import androidx.cardview.widget.CardView;

import com.example.notify.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
