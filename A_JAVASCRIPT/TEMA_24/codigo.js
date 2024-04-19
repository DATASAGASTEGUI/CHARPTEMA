//DECLARAR UNA CLASE PERSONA

// UNA FORMA

function ejemplo1() {
  let persona = {
    idPersona: "P1",
    nombre: "Luis",
    apellido: "Rabanal",
    edad: 23,
    estatura: 1.72,
    casado: true,

    nombreCompleto: function () {
      return this.nombre + " " + this.apellido;
    },

    mayorEdad: function () {
      if (this.edad >= 18) {
        return true;
      } else {
        return false;
      }
    },
  };

  console.log("IdPersona: " + persona.idPersona);
  console.log("Nombre: " + persona.nombre);

  console.log("Nombre completo: " + persona.nombreCompleto());

  console.log("Es mayor de edad: " + persona.mayorEdad());
}

function ejemplo2() {
     class Direccion {
        constructor(calle, numero, ciudad) {
           this.calle = calle;
           this.numero = numero;
           this.ciudad = ciudad; 
        }

        toString() {
            return this.calle + ";" + this.numero + ";" + this.ciudad;
        }
     }

     class Persona {
        constructor(idPersona, nombre, apellido, edad, estatura, casado, hobbies, direccion) {
            this.idPersona = idPersona,
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.estatura = estatura;
            this.casado = casado;
            this.hobbies = hobbies;
            this.direccion = direccion;
        }
        toString() {
            return this.idPersona + ';' +
                   this.nombre + ';' +
                   this.apellido + ';' +
                   this.edad + ';' +
                   this.estatura + ';' +
                   this.casado + ';' +
                   this.hobbies + ';' +
                   this.direccion;
        }

     }

     const direccion = new Direccion('C/. Gamarra', 245, 'Madrid');
     const persona = new Persona('Pi','Luis','Rabanal', 23, 1.72, true,['Leer','Pasea'],direccion);
    
     console.log(persona.toString());
    }

    ejemplo2();

// OTRA FORMA
