const contenedor = document.getElementById('id-contenedor');

for(let i=1; i<=20; i++) {
    const cajita = document.createElement('div');
    cajita.setAttribute('class','caja');
    
    const img = document.createElement('img');
    img.src = './imagen/' + i + '.png';
    img.width = 200;
    img.height = 200;

    cajita.appendChild(img);
    contenedor.appendChild(cajita);

}