package com.example.quizapp.util

import com.example.quizapp.model.Question
import kotlin.random.Random

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
                val q2 = Question(
                    2,
                    "Wofür steht das BRZ beim Subaru BRZ?",
                    "Boxer, Rearwheel-Drive, Zenit",
                    "Blue Raceing Zap",
                    "Big Rear Zoom",
                    "Boss Race Zero",
                    1
                )
                val q3 = Question(
                    3,
                    "Mit welchem Auto schlägt Brian O'Conner Dom Toretto auf der 1/4 Meile?",
                    "Toyota Supra MK4",
                    "Nissan Skyline R32 GTR",
                    "Mitsubishi Eclipse D50",
                    "Honda S2000",
                    1
                )
                val q4 = Question(
                    4,
                    "Welchen Lochkreis hat ein Toyota Yaris P1F?",
                    "100/4",
                    "104/5",
                    "108/4",
                    "102/4",
                    3
                )
                val q5 = Question(
                    5,
                    "Wie viel PS hat ein Renault Clio RS Phase 3?",
                    "200PS",
                    "210PS",
                    "190PS",
                    "212PS",
                    2
                )
                val q6 = Question(
                    6,
                    "In welcher Generation befindet sich der aktuelle Volkswagen Golf? (Stand 2021)",
                    "8",
                    "9",
                    "7",
                    "5",
                    1
                )
                val q7 = Question(
                    7,
                    "Wie viel PS hat ein VW Käfer(Zündapp Porsche Typ 12)?",
                    "26",
                    "22",
                    "29",
                    "31",
                    3
                )
                val q8 = Question(
                    8,
                    "Welches Fahrzeug ist Frontangetrieben?",
                    "Peugeot RCZ",
                    "Golf R",
                    "Toyota GT86",
                    "Ford Focus RS MK3",
                    2
                )
                val q9 = Question(
                    9,
                    "Wie viele Zylinder hat der 2020 GR Yaris?",
                    "3",
                    "4 Boxer",
                    "5",
                    "4 Quer",
                    2
                )
                val q10 = Question(
                    10,
                    "Welche Motorschmierung findet man in klassischen Porsche Modelen?",
                    "Trockensumpfschmierung",
                    "Gemischschmierung",
                    "Frischölschmierung",
                    "Nasssumpfschmierung",
                    2
                )
                val q11 = Question(
                    Random.nextLong(),
                    "Welcher Porsche 911 Generation hat \"Spiegeleierlichter\"?",
                    "996",
                    "993",
                    "997",
                    "930",
                    1
                )

                val q12 = Question(
                    Random.nextLong(),
                    "Im Jahr 2005 war der Bugatti Veyron der schnellste Sportwagen der Welt. Wie schnell wurde er?",
                    "408 kmh",
                    "412 kmh",
                    "402 kmh",
                    "415 kmh",
                    3
                )

                val q13 = Question(
                    Random.nextLong(),
                    "Welche Automarke gehört nicht zum Volkswagen Konzern?",
                    "Fiat",
                    "Seat",
                    "Skoda",
                    "Lamborghini",
                    1
                )

                val q14 = Question(
                    Random.nextLong(),
                    "Welche Twingo Generation gab es auch als Renault Sport Variante?",
                    "2",
                    "1",
                    "3",
                    "4",
                    2
                )

                val q15 = Question(
                    Random.nextLong(),
                    "Wie lang ist die Nordschleife (ohne GP-Strecke)?",
                    "20,83 km",
                    "20,97 km",
                    "19,65 km",
                    "20,03 km",
                    2
                )

                val q16 = Question(
                    Random.nextLong(),
                    "In welchem Streckenabschnitt der Nordschleife ist Nikki Lauda verunglückt?",
                    "Bergwerk",
                    "Exmühle",
                    "Wehrseifen",
                    "Schwalbenschwanz",
                    2
                )

                val q17 = Question(
                    Random.nextLong(),
                    "Welche Kurve wird fortan Sabine Schmitz Kurve heißen?",
                    "Kleines Karussel",
                    "Arenbergkurve",
                    "Dunlopkehre",
                    "Advanbogen",
                    2
                )

                val q18 = Question(
                    Random.nextLong(),
                    "Den Yaris TS P1F gab es auch limitiert als Turbo. Wie viel PS hatte dieser?",
                    "150 PS",
                    "125 PS",
                    "180 PS",
                    "133 PS",
                    3
                )

                val q19 = Question(
                    Random.nextLong(),
                    "Der Audi S8 Typ D2 hat in der 360 PS Variante wie viele Ventile pro Zylinder?",
                    "5",
                    "6",
                    "4",
                    "3",
                    3
                )

                val q20 = Question(
                    Random.nextLong(),
                    "Wie viel Hubraum bietet der RB26DETT im Skyline GT-R R32?",
                    "2,6l",
                    "2,8l",
                    "3,0l",
                    "2,5l",
                    2
                )

                val q21 = Question(
                    Random.nextLong(),
                    "Telsa's erster Roadster wurde unter Anderem mit welcher Firma entwickelt?",
                    "Lotus",
                    "Opel",
                    "Aston Martin",
                    "BMW",
                    2
                )

                val q22 = Question(
                    Random.nextLong(),
                    "Wofür steht die Akkürzung SDI von Volkswagen?",
                    "Saugdieseldirekteinspritzung",
                    "Superdirekteinspritzung",
                    "SingleTurbodirekteinspritzung",
                    "SingleTurbodirekteinspritzung",
                    3
                )

                val q23 = Question(
                    Random.nextLong(),
                    "Mit welchem Auto fährt man quer und sieht so mehr?\t",
                    "Alle drei",
                    "BMW M4 F82",
                    "Madzda RX7",
                    "AMG C204",
                    1
                )

                val q24 = Question(
                    Random.nextLong(),
                    "Warum hört sich der Madzda 787B so gut an?",
                    "4-Rotor-Wankelmotor ohne Turbo",
                    "Sauger V12",
                    "Biturbo V8",
                    "W16",
                    2
                )

                val q25 = Question(
                    Random.nextLong(),
                    "Welcher Porsche ist bekannt unter dem Namen \"Moby Dick\"?",
                    "935/78",
                    "935/2.0",
                    "935/80",
                    "935/79",
                    3
                )

                val q26 = Question(
                    Random.nextLong(),
                    "Welchen Preis hat der Megane IV RS Trophy-R der den Rekord als schnellstes Frontangetriebenes Fahrzeug auf der Nordschleife hat?",
                    "ca 80.000€",
                    "ca 45.000€",
                    "ca 62.500€",
                    "ca 39.999€",
                    2
                )

                val q27 = Question(
                    Random.nextLong(),
                    "Welcher Tuning Trend ist seit 2015 sehr beliebt?\t",
                    "Breitbauten",
                    "Lackierte Tribals",
                    "Kleine Momo Lenkräder",
                    "Rallyereifen",
                    1
                )

                val q28 = Question(
                    Random.nextLong(),
                    "Was ist das Tuning Standard Paket?",
                    "Fahrwerk, Felgen, Folie",
                    "Auspuff, Spoiler, Bremsen",
                    "PlayStation, Bassboxen, Sticker",
                    "Getönte Scheiben, Karbonhaube, Tribals",
                    2
                )

                val q29 = Question(
                    Random.nextLong(),
                    "Was sollte man beim Gewindefahrwerk auf jeden Fall vermeiden?",
                    "Restgewinde",
                    "Schnell fahren",
                    "Kurvenfahrten",
                    "Rote Federn",
                    1
                )

                val q30 = Question(
                    Random.nextLong(),
                    "Woran erkennt man idealerweise einen AMG am Grill?",
                    "Doppelspeiche",
                    "Sportlichere Form",
                    "Dunkler Mercedes Stern",
                    "Gibt keinen Unterschied",
                    3
                )

                val q31 = Question(
                    Random.nextLong(),
                    "Von welchem Hersteller wir das Fahrgestell Des Lamborghini Huracan hergestellt?",
                    "Audi",
                    "Volkswagen",
                    "Pagani",
                    "Bugatti",
                    2
                )

                val q32 = Question(
                    Random.nextLong(),
                    "Der bekannte 2.0l Motor aus Golf GTI, Audi S3, TTRS EA888 hat welche Ventilsteuerung?",
                    "DOHC und Steuerkette",
                    "DOHC und Zahnriemen",
                    "OHC und Steuerkette",
                    "OHV",
                    3
                )

                val q33 = Question(
                    Random.nextLong(),
                    "Welche Motorbaureihe ist im Golf GTI 2.0l verbaut?",
                    "VW EA855",
                    "VW EA288",
                    "VW EA855evo",
                    "VW EA839",
                    3
                )

                val q34 = Question(
                    Random.nextLong(),
                    "Welche Firma stellte die Zylinderköpfe Des Supra MK4 her?",
                    "Yamaha",
                    "Honda",
                    "Kawasaki",
                    "Subaru",
                    2
                )

                val q35 = Question(
                    Random.nextLong(),
                    "Die 98Spec des Honda Integra DC2 bekam bei der Japanischen Version etwas, was die Europäsche Version nicht erhielt. Was war es?",
                    "Größere Felgen",
                    "Größere Bremsanlage",
                    "Neuer Lochkreis",
                    "Andere Reifen",
                    3
                )

                val q36 = Question(
                    Random.nextLong(),
                    "Der Honda Civic Type R EK9 ist nur ...",
                    "als Rechtslenker erhältlich",
                    "in zwei Farben erhältlich",
                    "mit OMP Lenkrad erhältlich",
                    "mit Schaltknauf aus Alu erhältlich",
                    2
                )

                val q37 = Question(
                    Random.nextLong(),
                    "Um wie viele mm ist der Honda Civic Type R FN2 Tiefer als die normale Version?",
                    "15mm",
                    "12mm",
                    "18mm",
                    "10mm",
                    3
                )

                val q38 = Question(
                    Random.nextLong(),
                    "VTEC wurde ursprünglich für ... eingeführt",
                    "Motorräder",
                    "Autos",
                    "Motorbote",
                    "Rasenmäher",
                    2
                )

                val q39 = Question(
                    Random.nextLong(),
                    "Wanna läuft der Honda S2000 in den Drehzahlbegrenzer?",
                    "8800/min",
                    "9200/min",
                    "9000/min",
                    "8500/min",
                    3
                )

                val q40 = Question(
                    Random.nextLong(),
                    "In welchem Jahr lief der letzte Lancer Evolution X vom Band?",
                    "2016",
                    "2015",
                    "2018",
                    "2014",
                    2
                )

                val q41 = Question(
                    Random.nextLong(),
                    "Der Subaru Impreza 22B Sti Version braucht wie lange von 0 auf 100 kmh?",
                    "4,2s",
                    "3,9s",
                    "4,8s",
                    "3,7s",
                    3
                )

                val q42 = Question(
                    Random.nextLong(),
                    "Welches Fahrzeug war das erste Serienauto mit vollständiger selbsttragender Alu Karosserie?",
                    "Honda NSX",
                    "Toyota Celica",
                    "Porsche 993",
                    "Ferrari 348",
                    3
                )

                val q43 = Question(
                    Random.nextLong(),
                    "Wer ist der sogenannte Drift King?",
                    "Keiichi Tsuchiya",
                    "Keichi Tsuchiya",
                    "Keiichi Tsuchia",
                    "Keichi Tsuchya",
                    3
                )

                val q44 = Question(
                    Random.nextLong(),
                    "Welches Teil stammt bei dem Porsche 996 offentsichtlich aus dem Volkswagen Baukasten?",
                    "Lichtschalter",
                    "Blinker",
                    "Schaltknauf",
                    "Türöffner",
                    2
                )

                val q45 = Question(
                    Random.nextLong(),
                    "Welche von den genannten OZ Felgen sind die leichtesten?",
                    "OZ Ultraleggera 18 zoll",
                    "OZ Leggera HLT 19 zoll",
                    "OZ Superturismo LM 18 zoll",
                    "OZ Formula HLT 18 zoll",
                    2
                )

                val q46 = Question(
                    Random.nextLong(),
                    "",
                    "",
                    "",
                    "",
                    "",
                    2
                )

                val q47 = Question(
                    Random.nextLong(),
                    "",
                    "",
                    "",
                    "",
                    "",
                    2
                )

                val q48 = Question(
                    Random.nextLong(),
                    "",
                    "",
                    "",
                    "",
                    "",
                    2
                )

                val q49 = Question(
                    Random.nextLong(),
                    "",
                    "",
                    "",
                    "",
                    "",
                    2
                )

                val q50 = Question(
                    Random.nextLong(),
                    "",
                    "",
                    "",
                    "",
                    "",
                    2
                )

                val q51 = Question(
                    Random.nextLong(),
                    "",
                    "",
                    "",
                    "",
                    "",
                    2
                )
                questionList.addAll(listOf(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26, q27, q28,
                q29, q30, q31, q32, q33, q34, q35, q36, q37, q38, q39, q40, q41, q42, q43, q44, q45))
            }

            fun addElements() {
            }

            fun clearList() {
                questionList.clear()
            }
        }
}