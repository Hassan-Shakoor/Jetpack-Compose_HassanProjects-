package com.hassan.noteapp.data

import com.hassan.noteapp.model.Note

class NoteDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "A good day", description = "We went on a vacation to America"),
            Note(title = "Meeting with client", description = "Discussed project requirements and deadlines"),
            Note(title = "Grocery List", description = "Milk, eggs, bread, fruits"),
            Note(title = "Workout Plan", description = "30 minutes of cardio, 20 minutes of strength training"),
            Note(title = "Book Recommendation", description = "Finished reading 'The Alchemist' by Paulo Coelho. Highly recommended!"),
            Note(title = "Recipe: Spaghetti Carbonara", description = "Ingredients: spaghetti, bacon, eggs, Parmesan cheese, black pepper"),
            Note(title = "Movie Recommendation", description = "Watched 'Inception'. Mind-bending plot with stunning visuals!"),
            Note(title = "Hiking Adventure", description = "Explored a new trail in the mountains. Spectacular views!"),
            Note(title = "Coding Challenge", description = "Solved a complex algorithm problem on LeetCode"),
            Note(title = "Family Gathering", description = "Celebrated grandma's birthday with a delicious homemade cake"),
            Note(title = "Learning Spanish", description = "Practiced conjugating regular verbs in Spanish"),
            Note(title = "DIY Project", description = "Built a bookshelf from scratch using reclaimed wood"),
            Note(title = "Travel Plans", description = "Planning a trip to Europe next summer. Excited!")
        )
    }
}