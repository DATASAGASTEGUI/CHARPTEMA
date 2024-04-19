print("EJEMPLO 01: MOSTRAR TODAS LAS PERSONAS");
print("--------------------------------------");
{
  use("personasDB");
  let cursor = db.persona.find();
  cursor.forEach((x) => {
    print(x);
  });
}

print("EJEMPLO 02: MOSTRAR TODAS LAS PERSONAS DE UNA CIUDAD DADA");
print("---------------------------------------------------------");
{
  use("personasDB");
  let ciudad = "Zamora";
  let cursor = db.persona.find(
    { "direccion.ciudad": ciudad },
    { nombre: 1, _id: 0 }
  );
  cursor.forEach((x) => {
    print(x);
  });
}

print("EJEMPLO 03: MOSTRAR TODAS LAS PERSONAS DE UNA CIUDAD DADA");
print("---------------------------------------------------------");
{
  use("personasDB");
  let ciudad = "Zamora";
  let cursor = db.persona.find({ "direccion.ciudad": ciudad });
  cursor.forEach((doc) => {
    print("IdPersona: " + doc.idPersona);
    print("Nombre   : " + doc.nombre);
  });
}

print("EJEMPLO 04: MOSTRAR TODOS LOS HOBBIES DISTINTOS");
print("-----------------------------------------------");
{
  use("personasDB");
  let cursor = db.persona.distinct("hobbies");
  cursor.forEach((x) => print(x));
}

print("EJEMPLO 05: INSERTAR UN DOCUMENTO");
print("---------------------------------");
{
  use("personasDB");
  const persona = {
    idPersona: "P62",
    nombre: "Gerson",
    edad: 23,
    estatura: 1.72,
    casado: true,
    sexo: "H",
    direccion: {
      calle: "Call Esperanza",
      numero: 123,
      ciudad: "Trujill",
    },
    hobbies: ["Ludo", "Ajedrez", "Tenis"],
  };
  db.persona.insertOne(persona);
  print("PERSONA INSERTADA CORRECTAMENTE");
}

print("EJEMPLO 06: MOSTRAR TODAS LAS PERSONAS CON UN HOBBY DADO");
print("--------------------------------------------------------");
{
  use("personasDB");
  let hobby = "Leer";
  let cursor = db.persona.find({"hobbies": hobby });
  cursor.forEach((doc) => {
     printjson(doc);
    /*
    print("IdPersona: " + doc.idPersona);
    print("Nombre   : " + doc.nombre);
    */
  });
}

print("EJEMPLO 07: ELIMINAR PERSONA POR SU ID");
print("--------------------------------------");
{
  use("personasDB");
  let objeto = db.persona.deleteOne({"idPersona":"P61"});
  if(objeto.deletedCount == 0) {
     print("NO EXISTE PERSONA CON DICHO ID")
  }else {
     print("OK: ELIMINAR PERSONA");
  }
}


