/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    var e1;
    var e2;
    var e3;
    function cargaModificables(){
        
        document.getElementById("e1").value = e1;
        document.getElementById("e2").value = e2;
        document.getElementById("e3").value = e3;
    }
function cargarDatos(elemento){
    var tabla = document.getElementById("tabla");
    var filas = tabla.getElementsByTagName("tr");
    var ob = 0;
    var el = elemento+1
    document.getElementById("e1").value = tabla.rows[el].cells[0].innerHTML;
    document.getElementById("e2").value = tabla.rows[el].cells[1].innerHTML;
    document.getElementById("e3").value = tabla.rows[el].cells[2].innerHTML;
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
             cargarObjeto(objeto, id,elemento);
             if (objeto.readyState === 4)
                cargarDatos(elemento);
             
         };
         objeto.open('GET', url, true); // indicamos con el método open la url a cargar de manera asíncrona
         objeto.send(null); // Enviamos los datos con el metodo send
         
     }
     function cargarObjeto(objeto, id,elemento)
     {
         if (objeto.readyState === 4){ //si se ha cargado completamente
             document.getElementById(id).innerHTML = objeto.responseText;
             }
         else //en caso contrario, mostramos un gif simulando una precarga
             document.getElementById(id).innerHTML = "CARGANDO...";
     }
