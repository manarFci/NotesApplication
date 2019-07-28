package com.example.android.notesapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.example.android.notesapp.data.NotesContract.NotesEntry;
import com.example.android.notesapp.data.NotesDbHelper;

/**
 * Created by macbook on 7/24/19.
 */

public class NotesCursorAdapter extends CursorAdapter {
    private NotesDbHelper mDbHelper;

    public NotesCursorAdapter(Context context, Cursor c) {
        super(context, c,0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_notes,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView noteTitle=(TextView) view.findViewById(R.id.titles_of_notes);

                  // The sort order
        String noteString=cursor.getString(cursor.getColumnIndex(NotesEntry.COLUMN_Note_Title));
        noteTitle.setText(noteString);



    }
}
