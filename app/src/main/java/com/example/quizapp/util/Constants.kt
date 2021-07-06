package com.example.quizapp.util

import com.example.quizapp.model.Question

class Constants {
        companion object {
            const val BASE_URL = "http://10.0.2.2:8080"
            private val questionList = ArrayList<Question>()

            fun getQuestion(): Question {
                return questionList[((0 until questionList.size).random())]
            }

            fun setQuestion(newQuestion: Question) {
                questionList.add(newQuestion)
            }

            fun initQuestions() {
                val q1 = Question(
                    1,
                    "In welchem Jahr kam der Toyota GT-86 auf den deutschen Markt?",
                    "2012",
                    "2010",
                    "2014",
                    "2009",
                    1
                )
                questionList.add(q1)

                val q2 = Question(
                    2,
                    "Wofür steht das BRZ beim Subaru BRZ?",
                    "Boxer, Rearwheel-Drive, Zenit",
                    "Blue Raceing Zap",
                    "Big Rear Zoom",
                    "Boss Race Zero",
                    1
                )
                questionList.add(q2)

                val q3 = Question(
                    3,
                    "Mit welchem Auto schlägt Brian O'Conner Dom Toretto auf der 1/4 Meile?",
                    "Toyota Supra MK4",
                    "Nissan Skyline R32 GTR",
                    "Mitsubishi Eclipse D50",
                    "Honda S2000",
                    1
                )
                questionList.add(q3)

                val q4 = Question(
                    4,
                    "Welchen Lochkreis hat ein Toyota Yaris P1F?",
                    "100/4",
                    "104/5",
                    "108/4",
                    "102/4",
                    3
                )
                questionList.add(q4)

                val q5 = Question(
                    5,
                    "Wie viel PS hat ein Renault Clio RS Phase 3?",
                    "200PS",
                    "210PS",
                    "190PS",
                    "212PS",
                    2
                )
                questionList.add(q5)

                val q6 = Question(
                    6,
                    "In welcher Generation befindet sich der aktuelle Volkswagen Golf? (Stand 2021)",
                    "8",
                    "9",
                    "7",
                    "5",
                    1
                )
                questionList.add(q6)

                val q7 = Question(
                    7,
                    "Wie viel PS hat ein VW Käfer(Zündapp Porsche Typ 12)?",
                    "26",
                    "22",
                    "29",
                    "31",
                    3
                )
                questionList.add(q7)

                val q8 = Question(
                    8,
                    "Welches Fahrzeug ist Frontangetrieben?",
                    "Peugeot RCZ",
                    "Golf R",
                    "Toyota GT86",
                    "Ford Focus RS MK3",
                    2
                )
                questionList.add(q8)

                val q9 = Question(
                    9,
                    "Wie viele Zylinder hat der 2020 GR Yaris?",
                    "3",
                    "4 Boxer",
                    "5",
                    "4 Quer",
                    2
                )
                questionList.add(q9)

                val q10 = Question(
                    10,
                    "Welche Motorschmierung findet man in klassischen Porsche Modelen??",
                    "Trockensumpfschmierung",
                    "Gemischschmierung",
                    "Frischölschmierung",
                    "Nasssumpfschmierung",
                    2
                )
                questionList.add(q10)
            }

            fun clearList() {
                questionList.clear()
            }
        }
}