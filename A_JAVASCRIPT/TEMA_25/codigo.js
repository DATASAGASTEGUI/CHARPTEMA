/*
let alumno = {
    id: "A1",
    nombre: "Luis",
    edad: 23
};

for(const [atributo, valor] of Object.entries(alumno)) {
    console.log(atributo);
    console.log(valor);
}
*/

function evaluarTest() {
  const respuestaCorrectas = {
    p1: "c",
    p2: "b"
  };

  let score = 0;

  for (const [pregunta, respuestaCorrecta] of Object.entries(respuestaCorrectas)) {
    const respuestaUsuario = document.querySelector(`input[name="${pregunta}"]:checked`);
    if(respuestaUsuario) {
      if(respuestaUsuario.value === respuestaCorrecta) {
        score = score + 1;
      }else {
        score = score - 0.25;
      }
    }else {
        score = score + 0;
    }
  }

  const resultado = document.getElementById('id-resultado')
  resultado.innerHTML = "RESULTADO: " + (score<0 ? 0 : score);
}












/*
    if(respuestaUsuario == null) {
        console.log("SI ES NULO");
    }else {
        console.log("NO ES NULO");
        console.log(respuestaUsuario);
        console.log(respuestaUsuario.value);
    }

*/
