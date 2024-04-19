let cajitaReloj;
let botonInicio;
let botonDetener;

let intervalo;

function inicio() {
    cajitaReloj = document.getElementById('txtReloj')
    botonInicio = document.getElementById('btnInicio');
    botonDetener = document.getElementById('btnDetener');

    botonInicio.addEventListener('click', iniciarReloj);
    botonDetener.addEventListener('click', detenerReloj);
}

function iniciarReloj() {
    let reloj = () => {
        let fecha = new Date();
        let datofecha = fecha.getHours() + ':' + fecha.getMinutes() + ":" + fecha.getSeconds();
        cajitaReloj.value = datofecha;
    }

    intervalo = setInterval(reloj, 1000);
}

function detenerReloj() {
    clearInterval(intervalo);
}

window.addEventListener('load', inicio);