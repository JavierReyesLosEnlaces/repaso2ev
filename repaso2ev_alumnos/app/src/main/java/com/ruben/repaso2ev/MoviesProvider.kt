package com.ruben.repaso2ev

class MoviesProvider {
    companion object {
        fun getMovies(): List<Movie> {
            return movies
        }

        private val movies: List<Movie> = listOf(
            Movie(
                title = "Beekeeper: El protector",
                releaseDate = "12/01/2024",
                duration = "1h 45m",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/bHZQYKJV1rV01S3kNZ3hEYz8VNM.jpg",
                synopsis = "La brutal campaña de venganza de Adam Clay adquiere tintes nacionales tras revelarse que es un antiguo agente de una poderosa organización clandestina conocida como 'Beekeeper'.",
                genre = "Acción",
                director = "David Ayer",
                leadActor = "Jason Statham",
                writer1 = "Kurt Wimmer"
            ),
            Movie(
                title = "Cazadores en tierra inhóspita",
                releaseDate = "25/01/2024",
                duration = "1h 47m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jPGbcbMlzGUECukPhkEMVt1Kvs5.jpg",
                synopsis = "Después de un terremoto que convierte Seúl en una tierra inhóspita y sin ley, un cazador entra en acción para rescatar a una chica en manos de un médico trastornado. Secuela del film de 2023 “Concrete Utopia”",
                genre = "Acción",
                director = "Heo Myeong-haeng",
                leadActor = "Ma Dong-seok",
                writer1 = "Kim Bo-tong",
                writer2 = "Kwak Jae-min"
            ),
            Movie(
                title = "The Marvels",
                releaseDate = "9/11/2023",
                duration = "1h 45m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vpuuFM032yiX8tox4L84Wl9MGjG.jpg",
                synopsis = "Cuando sus obligaciones la envían a un agujero de gusano vinculado a un revolucionario kree, los poderes de Carol Danvers, la capitana Marvel, se entremezclan con los de Kamala Khan, también conocida como la Sra. Marvel y la sobrina de Carol, ahora astronauta de S.A.B.E.R., Monica Rambeau. Juntas, deberán salvar el universo como \"The Marvels\".",
                genre = "Ciencia ficción",
                director = "Nia DaCosta",
                leadActor = "Brie Larson",
                writer1 = "Megan McDonnell",
                writer2 = "Elissa Karasik"
            ),
            Movie(
                title = "Los Juegos del Hambre: Balada de pájaros cantores y serpientes",
                releaseDate = "17/11/2023",
                duration = "2h 37m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lQS3Owbte49Mkz5nFach4UgSZDF.jpg",
                synopsis = "Ambientada en un Panem postapocalíptico, nos hace retroceder varias décadas antes del comienzo de las aventuras de Katniss Everdeen. El joven Coriolanus Snow será el mentor de Lucy Gray Baird, la niña seleccionada como tributo del empobrecido Distrito 12. La joven sorprenderá a todos al cantar en la ceremonia de inauguración de los Décimos Juegos del Hambre en los que Snow intentará aprovecharse de su talento y encanto para sobrevivir.",
                genre = "Drama",
                director = "Francis Lawrence",
                leadActor = "Tom Blyth",
                writer1 = "Suzanne Collins"
            ),
            Movie(
                title = "El aprendiz de tigre",
                releaseDate = "2/02/2024",
                duration = "1h 24m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6AgafVcJ03sbxpOebGDGwsZWT9R.jpg",
                synopsis = "Película de animación que adapta la serie de novelas de fantasía tituladas The Tiger's Apprentice, del escritor Laurence Yep. La historia sigue a un niño que se convierte en el aprendiz mágico del Sr. Hu, un tigre que habla y que es el último de una larga lista de guardianes, cuyo trabajo es proteger al antiguo Fénix de Vatten de aquellos malhechores que desean usar sus poderes para hacer el mal. En su tarea descubrirán la importancia de la lealtad, el deber y la valentía.",
                genre = "Aventura",
                director = "Raman Hui",
                leadActor = "Brandon Soo Hoo",
                writer1 = "Lawrence Yep"
            ),
            Movie(
                title = "The Painter",
                releaseDate = "5/01/2024",
                duration = "1h 40m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/UZ0ydgbXtnrq8xZCI5lHVXVcH9.jpg",
                synopsis = "An ex-CIA operative is thrown back into a dangerous world when a mysterious woman from his past resurfaces. Now exposed and targeted by a relentless killer and a rogue black ops program, he must rely on skills he thought he left behind in a high-stakes game of survival.",
                genre = "Acción",
                director = "Kimani Ray Smith",
                leadActor = "Charlie Weber",
                writer1 = "Brian Buccellato"
            ),
            Movie(
                title = "Juego de roles",
                releaseDate = "12/01/2024",
                duration = "1h 41m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bnG0VwIw9oBFVn58Z9cixVLsn93.jpg",
                synopsis = "La historia gira en torno a una pareja casada (Cuoco y Oyelowo) cuyas vidas se ponen del revés cuando salen a la luz ciertos secretos del pasado. Emma tiene un marido maravilloso y dos hijos en los suburbios de Nueva Jersey; también tiene una vida secreta como asesina a sueldo, un secreto que su marido David descubre cuando la pareja decide darle vida a su matrimonio con un pequeño juego de roles.",
                genre = "Romance",
                director = "Thomas Vincent",
                leadActor = "Kaley Cuoco",
                writer1 = "Andrew Baldwin"
            ),
            Movie(
                title = "Con todos menos contigo",
                releaseDate = "19/01/2024",
                duration = "1h 44m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3ltpe5KJt8c8hxHiF2u4jCinD4U.jpg",
                synopsis = "Después de una primera cita increíble, la ardiente atracción entre ambos se enfría. Parecían la pareja perfecta, pero algo sucede y la cosa no va a más. Hasta que se reencuentran inesperadamente en una boda en Australia. Allí hacen lo que haría cualquier adulto: fingir que son una pareja.",
                genre = "Comedia",
                director = "Will Gluck",
                leadActor = "Sydney Sweeney",
                writer1 = "Ilana Wolpert"
            ),
            Movie(
                title = "Napoleón",
                releaseDate = "24/11/2023",
                duration = "2h 38m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/re6SSQS1HgBGG9AMiNuPGISOfMx.jpg",
                synopsis = "Una mirada personal a los orígenes del líder militar francés y su rápido y despiadado ascenso a emperador. La historia se ve a través de la lente de la relación adictiva y volátil de Napoleón Bonaparte con su esposa y único amor verdadero, Josefina.",
                genre = "Historia",
                director = "Ridley Scott",
                leadActor = "Joaquin Phoenix",
                writer1 = "David Scarpa"
            ),
            Movie(
                title = "Plan en familia",
                releaseDate = "15/12/2023",
                duration = "1h 58m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7mEX07jWRYrjarW84sBeFghGMfa.jpg",
                synopsis = "Dan Morgan es muchas cosas: un marido devoto, un padre cariñoso, un reputado vendedor de coches. También es un exasesino. Y, cuando su pasado alcanza su presente, se ve obligado a embarcar a su ingenua familia en un viaje por carretera sin igual.",
                genre = "Comedia",
                director = "Simon Cellan Jones",
                leadActor = "Mark Wahlberg",
                writer1 = "David Coggeshall"
            ),
            Movie(
                title = "Borderlands",
                releaseDate = "9/08/2024",
                duration = "Desconocida",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qXpQBgsasf60CBkevYJReZzbkDU.jpg",
                synopsis = "Borderlands se desarrolla en el planeta Pandora. Atraídas por las aparentemente vastos yacimientos minerales, muchas naves colonizadores de la Dahl Corporation (una de las muchas diversas megacorporaciones que aparentemente controlan y gobiernan planetas enteros) viajan al planeta para construir asentamientos. Las operaciones de minería son llevadas a cabo por una cantidad enorme de convictos llevados al planeta por la propia corporación.",
                genre = "Aventura",
                director = "Eli Roth",
                leadActor = "Cate Blanchett",
                writer1 = "Joe Crombie"
            ),
            Movie(
                title = "Deadpool 3",
                releaseDate = "26/07/2024",
                duration = "Desconocida",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3e9RToA9tGMl1T994T9T8zLW3CU.jpg",
                synopsis = "Tercera entrega del mercenario bocazas.",
                genre = "Acción",
                director = "Shawn Levy",
                leadActor = "Ryan Reynolds",
                writer1 = "Shawn Levy"
            ),
            Movie(
                title = "Wonka",
                releaseDate = "6/12/2023",
                duration = "1h 57m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tFyQa5WQqldIL44HBLaCmn5eERD.jpg",
                synopsis = "Basada en el personaje que protagoniza \"Charlie y la fábrica de chocolate\", el libro infantil más emblemático de Roald Dahl y uno de los más vendidos de todos los tiempos, \"Wonka\" cuenta la historia de cómo el mayor inventor, mago y chocolatero del mundo se convirtió en el querido Willy Wonka que conocemos hoy en día.",
                genre = "Fantasía",
                director = "Paul King",
                leadActor = "Timothée Chalamet",
                writer1 = "Roald Dahl"
            ),
            Movie(
                title = "Wish: El poder de los deseos",
                releaseDate = "24/11/2023",
                duration = "1h 35m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1VXMrUioKfPAPSsezHKexx77Dbz.jpg",
                synopsis = "Asha y una pequeña bola de energía ilimitada llamada Star demuestran que cuando la voluntad de un ser humano valiente se conecta con la magia de las estrellas, pueden suceder cosas maravillosas.",
                genre = "Fantasía",
                director = "Chris Buck",
                leadActor = "Ariana DeBose",
                writer1 = "Jennifer Lee",
                writer2 = "Allison Moore",
                writer3 = "Chris Buck",
                writer4 = "Fawn Veerasunthorn"
            ),
            Movie(
                title = "Migración: un viaje patas arriba",
                releaseDate = "22/12/2023",
                duration = "1h 23m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/brAqSBoSXzxEYV6rGYwbRvhlXCE.jpg",
                synopsis = "Una familia de patos intenta convencer a su sobreprotector padre para que se vayan a las vacaciones de su vida",
                genre = "Animación",
                director = "Benjamin Renner",
                leadActor = "Kumail Nanjiani",
                writer1 = "Benjamin Renner",
                writer2 = "Mike White"
            ),
            Movie(
                title = "Rebel Moon (Parte uno): La niña del fuego",
                releaseDate = "22/12/2023",
                duration = "2h 14m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2R7RUo3EGs3T3UdKPlfVQWkyUCD.jpg",
                synopsis = "Cuando una pacífica colonia en los confines de la galaxia se ve amenazada por un poder tiránico, su mejor baza para sobrevivir es la misteriosa Kora. Esta reúne a un grupo dispuesto a luchar, formado por forasteros, insurgentes, campesinos y huérfanos de guerra de varios planetas unidos por una causa común: la redención y la venganza. Mientras la sombra de todo un reino se cierne sobre la más improbable de las lunas, se libra una batalla por el destino de una galaxia y se forja un nuevo ejército de héroes.",
                genre = "Ciencia ficción",
                director = "Zack Snyder",
                leadActor = "Sofia Boutella",
                writer1 = "Zack Snyder"
            ),
            Movie(
                title = "Los Mercen4rios",
                releaseDate = "29/09/2023",
                duration = "1h 43m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2jmE7xH0R0dikmc8iplCPCit4MD.jpg",
                synopsis = "Cuarta entrega de la saga Los Mercenarios. El veterano mercenario Barney “Esquizo” Ross (Sylvester Stallone) y su equipo de estrellas, formado por los hombres más duros (Jason Statham, Dolph Lundgren, 50 Cent, Megan Fox…), afrontan un nuevo desafío, en una trama cargada de acción. Para superarlo y salir airosos, deberán recurrir a su ingenio, experiencia y a la fuerza bruta que los caracteriza.",
                genre = "Acción",
                director = "Scott Waugh",
                leadActor = "Jason Statham",
                writer1 = "Kurt Wimmer",
                writer2 = "Tad Daggerhart"
            ),
            Movie(
                title = "Oppenheimer",
                releaseDate = "20/07/2023",
                duration = "3h 1m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ncKCQVXgk4BcQV6XbvesgZ2zLvZ.jpg",
                synopsis = "Película sobre el físico J. Robert Oppenheimer y su papel como desarrollador de la bomba atómica. Basada en el libro 'American Prometheus: The Triumph and Tragedy of J. Robert Oppenheimer' de Kai Bird y Martin J. Sherwin.",
                genre = "Drama",
                director = "Christopher Nolan",
                leadActor = "Cillian Murphy",
                writer1 = "Christopher Nolan"
            ),
            Movie(
                title = "El chico y la garza",
                releaseDate = "27/10/2023",
                duration = "2h 4m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/kUT2nTjJfccfmpoOG4sUWmHyCZY.jpg",
                synopsis = "La película muestra el crecimiento psicológico de un adolescente a través de interacciones con sus amigos y su tío. Está basada en el libro de 1937 del mismo nombre escrito por Genzaburo Yoshino.",
                genre = "Aventura",
                director = "Hayao Miyazaki",
                leadActor = "Soma Santoki",
                writer1 = "Hayao Miyazaki"
            ),
            Movie(
                title = "Pobres criaturas",
                releaseDate = "26/01/2024",
                duration = "2h 21m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xbfzQ7Q7qmDUf50eZH8C57Ygx6n.jpg",
                synopsis = "Bella Baxter es una joven revivida por el brillante y poco ortodoxo científico Dr. Godwin Baxter. Bajo la protección de Baxter, Bella está ansiosa por aprender. Hambrienta de la mundanidad que le falta, Bella se escapa con Duncan Wedderburn, un sofisticado y perverso abogado, en una aventura vertiginosa a través de los continentes. Libre de los prejuicios de su época, Bella se vuelve firme en su propósito de defender la igualdad y la liberación.",
                genre = "Romance",
                director = "Yorgos Lanthimos",
                leadActor = "Emma Stone",
                writer1 = "Alasdair Gray"
            ),
            Movie(
                title = "La sociedad de la nieve",
                releaseDate = "15/12/2023",
                duration = "2h 23m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zBW3eu851EBSw9GinzRfYXeNI9e.jpg",
                synopsis = "El 13 de octubre de 1972, el vuelo 571 de la Fuerza Aérea Uruguaya, fletado para llevar a un equipo de rugby a Chile, se estrella en un glaciar en el corazón de los Andes.",
                genre = "Drama",
                director = "J.A. Bayona",
                leadActor = "Enzo Vogrincic",
                writer1 = "-"
            ),
            Movie(
                title = "The Creator",
                releaseDate = "29/09/2023",
                duration = "2h 13m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xddifbxtO46XClG8wdyUySUqJA4.jpg",
                synopsis = "En medio de una guerra futura entre la raza humana y las fuerzas de la inteligencia artificial, Joshua, un duro ex-agente de las fuerzas especiales que llora la desaparición de su esposa, es reclutado para cazar y matar al Creador, el escurridizo arquitecto de la IA avanzada que ha desarrollado una misteriosa arma con el poder de acabar con la guerra... y con la propia humanidad.",
                genre = "Aventura",
                director = "Gareth Edwards",
                leadActor = "John David Washington",
                writer1 = "Gareth Edwards"
            ),
            Movie(
                title = "La maldición de Hannah Stevenson",
                releaseDate = "14/03/2022",
                duration = "1h 15m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/so05qY0sDY0348bRg0tK9tSnnEq.jpg",
                synopsis = "Hannah y Matt, una joven pareja en sus primeras vacaciones juntos, pronto descubren que es posible que no se vean cara a cara. Sintiéndose como si hubiera defraudado a su novio, Hannah solicita la ayuda de una misteriosa mujer gitana, con la esperanza de que los problemas de la pareja puedan superarse. Sin embargo, cuando Matt se despierta y descubre que su novia ha desaparecido, las siniestras intenciones de la mujer gitana se vuelven demasiado claras.",
                genre = "Terror",
                director = "Jason Parker",
                leadActor = "Tom Hogan",
                writer1 = "-"
            ),
            Movie(
                title = "Transformers: El despertar de las bestias",
                releaseDate = "9/06/2023",
                duration = "2h 7m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8HBYMQkF6cFpupgRDhsrrKskXOE.jpg",
                synopsis = "Cuando surge una nueva amenaza capaz de destruir todo el planeta, Optimus Prime y los Autobots deben unirse a una poderosa facción conocida como los Maximals. Con el destino de la humanidad en juego, los humanos Noah y Elena harán lo que sea necesario para ayudar a los Transformers mientras se involucran en la batalla final para salvar la Tierra.",
                genre = "Ciencia ficción",
                director = "Steven Caple Jr.",
                leadActor = "Anthony Ramos",
                writer1 = "Joby Harold"
            ),
            Movie(
                title = "Fast & Furious X",
                releaseDate = "19/05/2023",
                duration = "2h 21m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/x3zlm6VxPvVrYWE3bHkYUQMR798.jpg",
                synopsis = "Durante numerosas misiones más que imposibles, Dom Toretto y su familia han sido capaces de ser más listos, de tener más valor y de ir más rápido que cualquier enemigo que se cruzara con ellos. Pero ahora tendrán que enfrentarse al oponente más letal que jamás hayan conocido: Un terrible peligro que resurge del pasado, que se mueve por una sangrienta sed de venganza y que está dispuesto a destrozar a la familia y destruir para siempre todo lo que a Dom le importa.",
                genre = "Acción",
                director = "Louis Leterrier",
                leadActor = "Vin Diesel",
                writer1 = "Justin Lin",
                writer2 = "Dan Mazeau",
                writer3 = "Zach Dean"
            ),
            Movie(
                title = "Los segundones",
                releaseDate = "25/01/2024",
                duration = "1h 36m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3wu1W6bvNGPm2AvVDP7dkGYF8pd.jpg",
                synopsis = "Jaycen Jenning, una antigua superestrella de la NFL que, tras un encontronazo con la ley, acepta entrenar a un equipo de fútbol juvenil en lugar de ir a la cárcel con la esperanza de relanzar su incipiente carrera.",
                genre = "Comedia",
                director = "Charles Stone III",
                leadActor = "Snoop Dogg",
                writer1 = "Danny Segal",
                writer2 = "Isaac Schamis"
            ),
            Movie(
                title = "John Wick 4",
                releaseDate = "24/03/2023",
                duration = "2h 50m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gh2bmprLtUQ8oXCSluzfqaicyrm.jpg",
                synopsis = "John Wick descubre un camino para derrotar a la Alta Mesa. Pero para poder ganar su libertad, Wick deberá enfrentarse a un nuevo rival con poderosas alianzas en todo el mundo, capaz de convertir a viejos amigos en enemigos.",
                genre = "Acción",
                director = "Chad Stahelski",
                leadActor = "Keanu Reeves",
                writer1 = "Shay Hatten",
                writer2 = "Michael Finch"
            ),
            Movie(
                title = "Megalodón 2: La fosa",
                releaseDate = "4/08/2023",
                duration = "1h 56m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mBgynPDplmo5JTY9VfGqY35OjDu.jpg",
                synopsis = "Una exploración submarina en las profundidades del océano se convierte en una espiral de caos cuando una malévola operación minera amenaza la misión y obliga al equipo de investigación a librar una arriesgada batalla por la supervivencia. Secuela de 'The Meg' (2018).",
                genre = "Terror",
                director = "Ben Wheatley",
                leadActor = "Jason Statham",
                writer1 = "Steve Alten"
            ),
            Movie(
                title = "Avatar: El sentido del agua",
                releaseDate = "16/12/2022",
                duration = "3h 12m",
                image = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ckeTumMS4G31UQ9NNkmtW2QhfMF.jpg",
                synopsis = "Más de una década después de los acontecimientos de 'Avatar', los Na'vi Jake Sully, Neytiri y sus hijos viven en paz en los bosques de Pandora hasta que regresan los hombres del cielo. Entonces comienzan los problemas que persiguen sin descanso a la familia Sully, que decide hacer un gran sacrificio para mantener a su pueblo a salvo y seguir ellos con vida.",
                genre = "Ciencia ficción",
                director = "James Cameron",
                leadActor = "Sam Worthington",
                writer1 = "James Cameron",
                writer2 = "Rick Jaffa",
                writer3 = "Amanda Silver",
                writer4 = "Shane Salerno"
            )
        )
    }
}