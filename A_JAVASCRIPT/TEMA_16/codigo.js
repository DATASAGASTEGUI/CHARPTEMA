// (01) DECLARAR FUNCIONES CLASICA

// FUNCION SIN PARAMETROS Y SIN RETORNO
function miFuncion1() {
    console.log("Función 1");
}

// FUNCION CON PARAMETROS Y CON RETORNO
function miFuncion2(numero) {
    return "Función " + numero;
}

miFuncion1();
console.log(miFuncion2(2));

// (02) DECLARAR UNA FUNCION ANONIMA

let miFuncion3 = function () {console.log('Función 3');}
let miFuncion4 = function (numero) {console.log('Función ' + numero);}
let miFuncion5Sumar = function (a,b) {return a+b;}

miFuncion3();
miFuncion4(4);
console.log(miFuncion5Sumar(5,6));
let x = miFuncion5Sumar(8,9);
console.log(x);

// (03) DECLARAR FUNCION FLECHA

const miFuncion6Suma = (a,b) => {return a+b;}
const miFuncion7Suma = (a,b) => a+b;
const miFuncion8 = () => console.log('Función 8');

console.log(miFuncion6Suma(1,2));
console.log(miFuncion7Suma(4,5));
miFuncion8();

let lista = [8, 9, 4, 9];
lista.forEach((z) => console.log(z));

for(let i=0; i<lista.length; i++) {
    console.log(lista[i]);
}

// (04) FUNCION CALLBACK

let imprimir1 = k => console.log(k); //FUNCION FLECHA

function imprimir2(m) { //FUNCION CLASICA
    console.log(m);
}

imprimir1('HOLA 1');
imprimir2('HOLA 2');

function sumar1(op1,op2,funcionCallback) {
    let res = op1 + op2;
    funcionCallback('Suma: ' + res);
}

// PROCESO ASINCRONO (NO HAY UNA SECUENCIA ORDENADA)
sumar1(8,6,imprimir2);
sumar1(9,6,imprimir1);
sumar1(3,4,k => console.log(k));
sumar1(1,2,function imprimir2(m) { //FUNCION CLASICA
    console.log(m);
})

// EJEMPLO APLICAR FUNCION CALLBACK

setTimeout(imprimir1('HOLA4'), 3000);

let reloj = () => {
    let fecha = new Date();
    console.log(fecha.getHours()+':'+fecha.getMinutes()+":"+fecha.getSeconds());
}

setInterval(reloj, 1000);







