let imagenes = [];

//LLENAR LISTA DE IMAGENES
for(let i=0; i<20; i++) {
    imagenes[i] = 'imagenes/' + (i+1) + '.png';
}

let sliderCentro = document.querySelector('.slider-centro');
let sliderIzquierda = document.querySelector('.slider-izquierda');
let sliderDerecha = document.querySelector('.slider-derecha');

sliderCentro.src = imagenes[0];

sliderIzquierda.addEventListener('click', moverIzquierda);
sliderDerecha.addEventListener('click', moverDerecha);

let contador = 0;

function moverDerecha() {
    contador++;
    if(contador > imagenes.length - 1) {
        contador = 0;
    }
    sliderCentro.src = imagenes[contador];
}

function moverIzquierda() {
    contador--;
    if(contador < 0) {
        contador = imagenes.length - 1;
    }
    sliderCentro.src = imagenes[contador];
}