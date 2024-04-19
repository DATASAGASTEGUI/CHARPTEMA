// USAR
use('personasDB');

db.dropDatabase();

// CREAR ÍNDICE ÚNICO
db.createCollection('persona'); //Asegura que la colección exista
db.getCollection('persona').createIndex({ idPersona: 1 }, { unique: true })

// BORRAR TODOS LOS DOCUMENTOS EN LA COLECCION 'PERSONA'
//db.getCollection('persona').deleteMany({});

// INSERTAR
db.getCollection('persona').insertMany([
        {
            "idPersona": "P1",
            "nombre": "Juan",
            "edad": 25,
            "estatura": 1.72,
            "casado": true,
            "sexo": "H",
            "direccion": {
                "calle": "Av América",
                "numero": 123,
                "ciudad": "Madrid"
            },
            "hobbies": ["Fútbol", "Pintura", "Viajar"]
        },
        {
            "idPersona": "P2",
            "nombre": "Carmen",
            "edad": 21,
            "estatura": 1.71,
            "casado": false,
            "sexo": "M",
            "direccion": {
                "calle": "Av. Ejercito",
                "numero": 456,
                "ciudad": "Trujillo"
            },
            "hobbies": ["Cine", "Leer"]
        },
        {
            "idPersona": "P3",
            "nombre": "Ana",
            "edad": 30,
            "estatura": 1.65,
            "casado": false,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Luna",
                "numero": 45,
                "ciudad": "Sevilla"
            },
            "hobbies": ["Correr", "Bailar"]
        },
        {
            "idPersona": "P4",
            "nombre": "Luis",
            "edad": 28,
            "estatura": 1.80,
            "casado": true,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Sol",
                "numero": 89,
                "ciudad": "Valencia"
            },
            "hobbies": ["Leer", "Cocinar"]
        },
        {
            "idPersona": "P5",
            "nombre": "Maria",
            "edad": 35,
            "estatura": 1.60,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Libertad",
                "numero": 101,
                "ciudad": "Barcelona"
            },
            "hobbies": ["Yoga", "Viajar"]
        },
        {
            "idPersona": "P6",
            "nombre": "Carlos",
            "edad": 22,
            "estatura": 1.75,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Paz",
                "numero": 67,
                "ciudad": "Bilbao"
            },
            "hobbies": ["Videojuegos", "Fútbol"]
        },
        {
            "idPersona": "P7",
            "nombre": "Lucia",
            "edad": 27,
            "estatura": 1.68,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Mar",
                "numero": 23,
                "ciudad": "Málaga"
            },
            "hobbies": ["Natación", "Lectura"]
        },
        {
            "idPersona": "P8",
            "nombre": "David",
            "edad": 31,
            "estatura": 1.82,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Jardín",
                "numero": 12,
                "ciudad": "Zaragoza"
            },
            "hobbies": ["Ciclismo", "Pintura"]
        },
        {
            "idPersona": "P9",
            "nombre": "Sofia",
            "edad": 26,
            "estatura": 1.70,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Flores",
                "numero": 34,
                "ciudad": "Granada"
            },
            "hobbies": ["Fotografía", "Viajes"]
        },
        {
            "idPersona": "P10",
            "nombre": "Miguel",
            "edad": 24,
            "estatura": 1.78,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Av Ronda",
                "numero": 76,
                "ciudad": "Alicante"
            },
            "hobbies": ["Tenis", "Música"]
        },
        {
            "idPersona": "P11",
            "nombre": "Elena",
            "edad": 29,
            "estatura": 1.63,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Verde",
                "numero": 88,
                "ciudad": "Córdoba"
            },
            "hobbies": ["Cine", "Teatro"]
        },
        {
            "idPersona": "P12",
            "nombre": "Jorge",
            "edad": 32,
            "estatura": 1.85,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Azul",
                "numero": 90,
                "ciudad": "Valladolid"
            },
            "hobbies": ["Fútbol", "Lectura"]
        },
        {
            "idPersona": "P13",
            "nombre": "Laura",
            "edad": 23,
            "estatura": 1.69,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Rojo",
                "numero": 57,
                "ciudad": "Murcia"
            },
            "hobbies": ["Danza", "Viajes"]
        },
        {
            "idPersona": "P14",
            "nombre": "Pedro",
            "edad": 36,
            "estatura": 1.76,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Blanca",
                "numero": 42,
                "ciudad": "Salamanca"
            },
            "hobbies": ["Pesca", "Cocina"]
        },
        {
            "idPersona": "P15",
            "nombre": "Isabel",
            "edad": 28,
            "estatura": 1.62,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Negra",
                "numero": 35,
                "ciudad": "León"
            },
            "hobbies": ["Fotografía", "Cine"]
        },
        {
            "idPersona": "P16",
            "nombre": "Alberto",
            "edad": 33,
            "estatura": 1.80,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Amarilla",
                "numero": 29,
                "ciudad": "Oviedo"
            },
            "hobbies": ["Escalada", "Viajes"]
        },
        {
            "idPersona": "P17",
            "nombre": "Marta",
            "edad": 25,
            "estatura": 1.64,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Naranja",
                "numero": 14,
                "ciudad": "Pamplona"
            },
            "hobbies": ["Pintura", "Lectura"]
        },
        {
            "idPersona": "P18",
            "nombre": "Roberto",
            "edad": 30,
            "estatura": 1.77,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Gris",
                "numero": 78,
                "ciudad": "Burgos"
            },
            "hobbies": ["Fútbol", "Música"]
        },
        {
            "idPersona": "P19",
            "nombre": "Sara",
            "edad": 27,
            "estatura": 1.66,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Verde",
                "numero": 53,
                "ciudad": "Almería"
            },
            "hobbies": ["Yoga", "Fotografía"]
        },
        {
            "idPersona": "P20",
            "nombre": "Diego",
            "edad": 22,
            "estatura": 1.79,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Rosa",
                "numero": 66,
                "ciudad": "Logroño"
            },
            "hobbies": ["Ciclismo", "Cine"]
        },
        {
            "idPersona": "P21",
            "nombre": "Patricia",
            "edad": 26,
            "estatura": 1.70,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Morada",
                "numero": 87,
                "ciudad": "Huesca"
            },
            "hobbies": ["Viajes", "Teatro"]
        },
        {
            "idPersona": "P22",
            "nombre": "Oscar",
            "edad": 31,
            "estatura": 1.74,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Blanca",
                "numero": 92,
                "ciudad": "Santander"
            },
            "hobbies": ["Pesca", "Leer"]
        },
        {
            "idPersona": "P23",
            "nombre": "Alicia",
            "edad": 24,
            "estatura": 1.65,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Azul",
                "numero": 11,
                "ciudad": "Toledo"
            },
            "hobbies": ["Bailar", "Cine"]
        },
        {
            "idPersona": "P24",
            "nombre": "Raul",
            "edad": 34,
            "estatura": 1.81,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Negra",
                "numero": 39,
                "ciudad": "Segovia"
            },
            "hobbies": ["Videojuegos", "Escalada"]
        },
        {
            "idPersona": "P25",
            "nombre": "Natalia",
            "edad": 28,
            "estatura": 1.68,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Blanca",
                "numero": 27,
                "ciudad": "Guadalajara"
            },
            "hobbies": ["Correr", "Fotografía"]
        },
        {
            "idPersona": "P26",
            "nombre": "Hector",
            "edad": 29,
            "estatura": 1.73,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Azul",
                "numero": 55,
                "ciudad": "Cuenca"
            },
            "hobbies": ["Pintura", "Música"]
        },
        {
            "idPersona": "P27",
            "nombre": "Rosa",
            "edad": 32,
            "estatura": 1.71,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Roja",
                "numero": 49,
                "ciudad": "Lugo"
            },
            "hobbies": ["Leer", "Yoga"]
        },
        {
            "idPersona": "P28",
            "nombre": "Pablo",
            "edad": 30,
            "estatura": 1.78,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Negra",
                "numero": 73,
                "ciudad": "Huelva"
            },
            "hobbies": ["Cocina", "Cine"]
        },
        {
            "idPersona": "P29",
            "nombre": "Angela",
            "edad": 25,
            "estatura": 1.67,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Verde",
                "numero": 64,
                "ciudad": "Badajoz"
            },
            "hobbies": ["Danza", "Teatro"]
        },
        {
            "idPersona": "P30",
            "nombre": "Ricardo",
            "edad": 27,
            "estatura": 1.79,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Av Azul",
                "numero": 99,
                "ciudad": "Jaén"
            },
            "hobbies": ["Fútbol", "Leer"]
        },
        {
            "idPersona": "P31",
            "nombre": "Beatriz",
            "edad": 22,
            "estatura": 1.63,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Roja",
                "numero": 77,
                "ciudad": "Palencia"
            },
            "hobbies": ["Música", "Yoga"]
        },
        {
            "idPersona": "P32",
            "nombre": "Victor",
            "edad": 35,
            "estatura": 1.83,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Av Verde",
                "numero": 88,
                "ciudad": "Teruel"
            },
            "hobbies": ["Pesca", "Videojuegos"]
        },
        {
            "idPersona": "P33",
            "nombre": "Clara",
            "edad": 29,
            "estatura": 1.68,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Amarilla",
                "numero": 12,
                "ciudad": "Soria"
            },
            "hobbies": ["Cine", "Viajes"]
        },
        {
            "idPersona": "P34",
            "nombre": "Andres",
            "edad": 23,
            "estatura": 1.70,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Naranja",
                "numero": 36,
                "ciudad": "Melilla"
            },
            "hobbies": ["Fútbol", "Ciclismo"]
        },
        {
            "idPersona": "P35",
            "nombre": "Eva",
            "edad": 31,
            "estatura": 1.64,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Blanca",
                "numero": 78,
                "ciudad": "Ceuta"
            },
            "hobbies": ["Fotografía", "Danza"]
        },
        {
            "idPersona": "P36",
            "nombre": "Daniel",
            "edad": 26,
            "estatura": 1.76,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Rosa",
                "numero": 95,
                "ciudad": "Ciudad Real"
            },
            "hobbies": ["Teatro", "Escalada"]
        },
        {
            "idPersona": "P37",
            "nombre": "Teresa",
            "edad": 33,
            "estatura": 1.66,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Negra",
                "numero": 11,
                "ciudad": "Zamora"
            },
            "hobbies": ["Viajes", "Yoga"]
        },
        {
            "idPersona": "P38",
            "nombre": "Enrique",
            "edad": 30,
            "estatura": 1.74,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Roja",
                "numero": 54,
                "ciudad": "Avila"
            },
            "hobbies": ["Pintura", "Música"]
        },
        {
            "idPersona": "P39",
            "nombre": "Adriana",
            "edad": 27,
            "estatura": 1.65,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Azul",
                "numero": 38,
                "ciudad": "Segovia"
            },
            "hobbies": ["Danza", "Teatro"]
        },
        {
            "idPersona": "P40",
            "nombre": "Javier",
            "edad": 25,
            "estatura": 1.80,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Av Amarilla",
                "numero": 73,
                "ciudad": "Huesca"
            },
            "hobbies": ["Fútbol", "Cine"]
        },
        {
            "idPersona": "P41",
            "nombre": "Cristina",
            "edad": 22,
            "estatura": 1.70,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Blanca",
                "numero": 20,
                "ciudad": "Guadalajara"
            },
            "hobbies": ["Leer", "Viajar"]
        },
        {
            "idPersona": "P42",
            "nombre": "Ivan",
            "edad": 24,
            "estatura": 1.77,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Roja",
                "numero": 92,
                "ciudad": "Teruel"
            },
            "hobbies": ["Ciclismo", "Música"]
        },
        {
            "idPersona": "P43",
            "nombre": "Monica",
            "edad": 29,
            "estatura": 1.68,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Azul",
                "numero": 50,
                "ciudad": "Avila"
            },
            "hobbies": ["Cine", "Fotografía"]
        },
        {
            "idPersona": "P44",
            "nombre": "Manuel",
            "edad": 32,
            "estatura": 1.82,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Av Verde",
                "numero": 85,
                "ciudad": "Melilla"
            },
            "hobbies": ["Pesca", "Escalada"]
        },
        {
            "idPersona": "P45",
            "nombre": "Susana",
            "edad": 27,
            "estatura": 1.61,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Negra",
                "numero": 33,
                "ciudad": "Ceuta"
            },
            "hobbies": ["Pintura", "Cine"]
        },
        {
            "idPersona": "P46",
            "nombre": "Gonzalo",
            "edad": 25,
            "estatura": 1.75,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Roja",
                "numero": 29,
                "ciudad": "Ciudad Real"
            },
            "hobbies": ["Correr", "Leer"]
        },
        {
            "idPersona": "P47",
            "nombre": "Ariana",
            "edad": 34,
            "estatura": 1.69,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Blanca",
                "numero": 58,
                "ciudad": "Palencia"
            },
            "hobbies": ["Cine", "Yoga"]
        },
        {
            "idPersona": "P48",
            "nombre": "Tomas",
            "edad": 23,
            "estatura": 1.76,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Azul",
                "numero": 19,
                "ciudad": "Segovia"
            },
            "hobbies": ["Fútbol", "Música"]
        },
        {
            "idPersona": "P49",
            "nombre": "Vanesa",
            "edad": 28,
            "estatura": 1.64,
            "casado": true,
            "sexo": "M",
            "direccion": {
                "calle": "Av Verde",
                "numero": 97,
                "ciudad": "Lugo"
            },
            "hobbies": ["Cine", "Danza"]
        },
        {
            "idPersona": "P50",
            "nombre": "Fernando",
            "edad": 26,
            "estatura": 1.78,
            "casado": false,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Negra",
                "numero": 21,
                "ciudad": "Huelva"
            },
            "hobbies": ["Ciclismo", "Teatro"]
        },
        {
            "idPersona": "P51",
            "nombre": "Luisa",
            "edad": 30,
            "estatura": 1.70,
            "casado": false,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Amarilla",
                "numero": 88,
                "ciudad": "Badajoz"
            },
            "hobbies": ["Pintura", "Viajar"]
        },
        {
            "idPersona": "P52",
            "nombre": "Marcos",
            "edad": 29,
            "estatura": 1.75,
            "casado": true,
            "sexo": "H",
            "direccion": {
                "calle": "Av Roja",
                "numero": 56,
                "ciudad": "Toledo"
            },
            "hobbies": ["Cine", "Fotografía"]
        },
        {
            "idPersona": "P53",
            "nombre": "Laura",
            "edad": 28,
            "estatura": 1.65,
            "casado": false,
            "sexo": "M",
            "direccion": {
                "calle": "Av Azul",
                "numero": 45,
                "ciudad": "Ciudad Real"
            },
            "hobbies": ["Leer", "Escalada"]
        },
        {
            "idPersona": "P54",
            "nombre": "Miguel",
            "edad": 33,
            "estatura": 1.80,
            "casado": true,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Verde",
                "numero": 70,
                "ciudad": "Santander"
            },
            "hobbies": ["Fútbol", "Yoga"]
        },
        {
            "idPersona": "P55",
            "nombre": "Sara",
            "edad": 26,
            "estatura": 1.68,
            "casado": false,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Blanca",
                "numero": 34,
                "ciudad": "Lugo"
            },
            "hobbies": ["Cine", "Danza"]
        },
        {
            "idPersona": "P56",
            "nombre": "Roberto",
            "edad": 32,
            "estatura": 1.78,
            "casado": true,
            "sexo": "H",
            "direccion": {
                "calle": "Av Amarilla",
                "numero": 43,
                "ciudad": "Jaén"
            },
            "hobbies": ["Música", "Teatro"]
        },
        {
            "idPersona": "P57",
            "nombre": "Elena",
            "edad": 27,
            "estatura": 1.66,
            "casado": false,
            "sexo": "M",
            "direccion": {
                "calle": "Av Morada",
                "numero": 22,
                "ciudad": "Teruel"
            },
            "hobbies": ["Viajar", "Ciclismo"]
        },
        {
            "idPersona": "P58",
            "nombre": "Pedro",
            "edad": 31,
            "estatura": 1.82,
            "casado": true,
            "sexo": "H",
            "direccion": {
                "calle": "Calle Naranja",
                "numero": 15,
                "ciudad": "Zamora"
            },
            "hobbies": ["Pesca", "Escalada"]
        },
        {
            "idPersona": "P59",
            "nombre": "Isabel",
            "edad": 29,
            "estatura": 1.67,
            "casado": false,
            "sexo": "M",
            "direccion": {
                "calle": "Calle Negra",
                "numero": 78,
                "ciudad": "Huesca"
            },
            "hobbies": ["Fotografía", "Yoga"]
        },
        {
            "idPersona": "P60",
            "nombre": "Carlos",
            "edad": 28,
            "estatura": 1.79,
            "casado": true,
            "sexo": "H",
            "direccion": {
                "calle": "Av Azul",
                "numero": 51,
                "ciudad": "Melilla"
            },
            "hobbies": ["Leer", "Cine"]
        }
]);


Buscar: {"idPersona": "P3"}
Filtro: {"$set": {"nombre": "Isabel", "edad": 31}}
db.persona.updateOne({"idPersona": "P3"},{"$set": {"nombre": "Isabel", "edad": 31}});