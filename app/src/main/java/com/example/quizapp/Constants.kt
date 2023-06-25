package com.example.quizapp

object Constants {
    fun getQuestions() : ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // question 1
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Austria",
            "Armenia",
            1
        )
        questionsList.add(que1)

        // question 2
        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belarus",
            "Belgium",
            "Bangladesh",
            "Bulgaria",
            2
        )
        questionsList.add(que2)

        // question 3
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Austria",
            "Armenia",
            "Argentina",
            "Australia",
            4
        )
        questionsList.add(que3)

        // question 4
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Spain",
            "Portugal",
            "Bulgaria",
            1
        )
        questionsList.add(que4)

        // question 5
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "England",
            "Netherlands",
            "Latvia",
            1
        )
        questionsList.add(que5)

        // question 6
        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Denmark",
            "Belgium",
            "Germany",
            "Moldova",
            3
        )
        questionsList.add(que6)

        // question 7
        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "New Zealand",
            "Australia",
            "Fiji",
            "Philippines",
            3
        )
        questionsList.add(que7)

        // question 8
        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland",
            "Niger",
            "Bangladesh",
            "India",
            4
        )
        questionsList.add(que8)

        // question 9
        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Palestine",
            "Sudan",
            "UAE",
            "Kuwait",
            4
        )
        questionsList.add(que9)

        // question 10
        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "Australia",
            "Malaysia",
            "Cook Islands",
            1
        )
        questionsList.add(que10)

        return questionsList
    }
}