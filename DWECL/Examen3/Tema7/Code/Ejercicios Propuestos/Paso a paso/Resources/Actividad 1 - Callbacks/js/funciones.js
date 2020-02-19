function alerta(){
    alert("Hola mundo");
}

function msnConsole(){
    console.log("Has descubierto un mensaje secreto");
    
}

function verON(){
    document.getElementById('cajaRoja').style.display='block';
    document.getElementById('mostrar').style.display='none';
    document.getElementById('ocultar').style.display='initial';
}

function verOFF(){
    document.getElementById('cajaRoja').style.display='none';
    document.getElementById('mostrar').style.display='initial';
    document.getElementById('ocultar').style.display='none';
}