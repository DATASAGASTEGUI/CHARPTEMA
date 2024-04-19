let imagenes = [
    'imagenes/1.png',
    'imagenes/2.png',
    'imagenes/3.png',
    'imagenes/4.png'
]

let imagen = document.getElementById('id-imagen');
imagen.src = imagenes[0];

let contador = 0;

setInterval(moverDerecha, 2000);

function moverDerecha() {
    contador++;
    if(contador > imagenes.length - 1) {
       contador = 0; 
    }
    imagen.src = imagenes[contador];
}