/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function cargarDatos(elemento){
    var tabla = document.getElementById("tabla");
    var filas = tabla.getElementsByTagName("tr");
    var ob;
    
    var el = document.getElementById(elemento);
    
    for(var i =0;i<filas.length;i++){
        fila = filas[i];
        alert(fila.rows[3].innerHTML);
        if(fila.rows[3].innerHTML == el.value){
            ob=fila;
        }
    }
    document.getElementById("e1").value = ob.rows[0].innerHTML;
    document.getElementById("e2").value = ob.rows[1].innerHTML;
    document.getElementById("e3").value = ob.rows[2].innerHTML;
    
}
function CargaModificar(url, id,elemento)
     {
         //Creamos un objeto dependiendo del navegador
         var objeto;
         if (window.XMLHttpRequest)
         {
             //Mozilla, Safari, etc
             objeto = new XMLHttpRequest();
         }
         else if (window.ActiveXObject)
         {
             //Nuestro querido IE
             try {
                 objeto = new ActiveXObject("Msxml2.XMLHTTP");
             } catch (e) {
                 try { //Version mas antigua
                     objeto = new ActiveXObject("Microsoft.XMLHTTP");
                 } catch (e) {
                 }
             }
         }
         if (!objeto)
         {
             alert("No ha sido posible crear un objeto de XMLHttpRequest");
         }
         //Cuando XMLHttpRequest cambie de estado, ejecutamos esta funcion
         objeto.onreadystatechange = function()
         {
             cargarObjeto(objeto, id);
         };
         objeto.open('GET', url, true); // indicamos con el método open la url a cargar de manera asíncrona
         objeto.send(null); // Enviamos los datos con el metodo send
         cargarDatos(elemento);
     }
     function cargarObjeto(objeto, id)
     {
         if (objeto.readyState === 4) //si se ha cargado completamente
             document.getElementById(id).innerHTML = objeto.responseText;
         else //en caso contrario, mostramos un gif simulando una precarga
             document.getElementById(id).innerHTML = "CARGANDO...";
     }
