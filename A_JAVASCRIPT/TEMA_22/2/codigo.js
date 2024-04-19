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

//CAMBIAR ESTILO------------------------------------

let btnCambiarEstilo1 = document.getElementById('btnCambiarEstilo1');
let btnCambiarEstilo2 = document.getElementById('btnCambiarEstilo2');

btnCambiarEstilo1.addEventListener('click', cambiarEstiloCirculo);
btnCambiarEstilo2.addEventListener('click', cambiarEstiloRectangulo);

function cambiarEstiloCirculo() {
    sliderCentro.style.borderRadius = '90px';
    sliderCentro.style.width = '180px';
    sliderCentro.style.height = '180px';
}

function cambiarEstiloRectangulo() {
    sliderCentro.style.borderRadius = '12px';
    sliderCentro.style.width = '180px';
    sliderCentro.style.height = '360px';
}