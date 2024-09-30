

window.onload = function(e){ 
    document.getElementById("btnRegistrar").addEventListener("click", Registrar)
}


// var : Permite alojar datos de cualquier tipo a nivel global
// let : Permite alojar datos de cualquier tipo a nivel de bloque
// const : Permite alojar datos de cualquier tipo pero solo de lectura

function  Registrar(){
    try{
        let edad = document.getElementById("txtEdad").value;
        let nombre = document.getElementById("txtNombre").value;
        console.log(edad);
        if(!Number.isInteger(parseInt(edad))){
            throw "El datos ingresado en edad no es un número";
        }

        
        alert("Estamos en la sección final del try");
    }catch(error){
        alert(error);
    }
}