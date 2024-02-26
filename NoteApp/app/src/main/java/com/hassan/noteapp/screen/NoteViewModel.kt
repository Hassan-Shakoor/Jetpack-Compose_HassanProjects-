package com.hassan.noteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.hassan.noteapp.data.NoteDataSource
import com.hassan.noteapp.model.Note

class NoteViewModel: ViewModel() {
    private var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NoteDataSource().loadNotes())
    }
    fun addNote(note: Note) {
        noteList.add(note)
    }

    fun remove(note: Note) {
        noteList.remove(note)
    }

    fun getAllNotes(): List<Note> {
        return noteList
    }
}