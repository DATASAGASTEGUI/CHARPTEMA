//CREAR UN ELEMENTO HTML
const elemento_h1 = document.createElement('h1');
elemento_h1.innerHTML = 'TITULO 1';

const elemento_h1_1 = document.createElement('h1');
elemento_h1_1.innerHTML = 'TITULO 2';

const elemento_a = document.createElement('a');
elemento_a.innerHTML = "ENLACE 1";
elemento_a.setAttribute('href', '');

const elemento_a_1 = document.createElement('a');
elemento_a_1.innerHTML = "ENLACE 2";
elemento_a_1.setAttribute('href', '');

const contenedor = document.getElementById('id-contenedor');

contenedor.appendChild(elemento_h1);
contenedor.appendChild(elemento_h1_1);
contenedor.appendChild(elemento_a);
contenedor.appendChild(elemento_a_1);
