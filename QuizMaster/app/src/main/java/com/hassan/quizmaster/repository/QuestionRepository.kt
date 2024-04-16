package com.hassan.quizmaster.repository

import com.hassan.quizmaster.data.DataOrException
import com.hassan.quizmaster.model.QuestionItem
import javax.inject.Inject

class QuestionRepository<QuestionApi> @Inject constructor(private val api: QuestionApi) {
    private val listOfQuestions = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()
}