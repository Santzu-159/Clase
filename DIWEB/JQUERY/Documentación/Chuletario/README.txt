># Librería de Google:
https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js

># Lista de referencias:
https://www.w3schools.com/jquery/jquery_ref_overview.asp

<-- ! SELECTORES ! -->
<-- # PÁGINAS DE INTERES # -->
https://www.anerbarrena.com/jquery-selectors-selectores-4768/
https://www.w3schools.com/jquery/jquery_ref_selectors.asp
https://api.jquery.com/category/selectors/
<-- # ACCESO RÁPIDO # -->
># Para seleccionar un elemento de la página utilizaremos los mismos selectores que en CSS,
dentro de la etiqueta de DOM de JQuery $("elemento"). //Debemos poner el selector entre !comillas! dentro de los paréntesis.
># Selectores a destacar:
//Básicos no incluidos en este chuletario
<-- @ POSICIÓN @ -->
· :first --> $("p:first") --> El primero elemento <p>
· :last --> $("p:last") --> El último elemento <p>
· :even --> $("tr:even") --> Todos los elementos <tr> pares
· :odd --> $("tr:odd") --> Todos los elementos <tr> impares
<-- @ HIJOS @ -->
· :first-child --> $("p:first-child") --> Todos los elementos <p> que son el primer hijo de su padre
· :first-of-type --> $("p:first-of-type") --> Todos los elementos <p> que son el primer elemento <p> de su padre
· :last-child --> $("p:last-child") --> Todos los elementos <p> que son el último hijo de su padre
· :last-of-type --> $("p:last-of-type") --> Todos los elementos <p> que son el último elemento <p> de su padre
· :nth-child(n) --> $("p:nth-child(2)") --> Todos los elementos <p> que son el segundo hijo de su padre
· :nth-last-child(n) --> $("p:nth-last-child(2)") --> Todos los elementos <p> que son el segundo hijo de su padre, contando desde el último hijo
· :nth-of-type(n) --> $("p:nth-of-type(2)") --> Todos los elementos <p> que son el segundo elemento <p> de su padre
· :nth-last-of-type(n) --> $("p:nth-last-of-type(2)") --> Todos los elementos <p> que son el segundo elemento <p> de su padre, contando desde el último hijo
· :only-child --> $("p:only-child") --> Todos los elementos <p> que son el único hijo de su padre
· :only-of-type --> $("p:only-of-type") --> Todos los elementos <p> que son el único hijo, de su tipo, de su padre
//descendientes y hermanos no incluidos en este chuletario
<-- @ POR ÍNDICE Y EL NOT @ -->
· :eq(index) --> $("ul li:eq(3)") --> El cuarto elemento en una lista (el índice comienza por 0)
· :gt(no) --> $("ul li:gt(3)") --> Enumerar elementos con un índice mayor que 3
· :lt(no) --> $("ul li:lt(3)") --> Lista de elementos con un índice inferior a 3
· :not(selector) --> $("input:not(:empty)") --> Todos los elementos de entrada que no están vacíos
<-- @ MISC || OTROS @ -->
· :header --> $(":header") --> Todos los elementos de encabezado (<h1>,<h2>,..)
· :animated --> $(":animated") --> Todos los elementos animados
· :focus --> $(":focus") --> El elemento que actualmente tiene el foco
· :contains(text) --> $(":contains('Hello')") --> Todos los elementos que contengan el texto "Hola"
· :has(selector) --> $("div:has(p)") --> Todos los elementos <div> que tienen un elemento <p>
· :empty --> $(":empty") --> Todos los elementos que están vacíos
· :parent --> $(":parent") --> Todos los elementos que son padres de otro elemento.
· :hidden --> $("p:hidden") --> Todos los elementos <p> ocultos
· :visible --> $("table:visible") --> Todos las tablas visibles
· :root --> $(":root") --> El elemento raíz del documento
· :lang(language) --> $("p:lang(de)") --> Todos los elementos <p> con un valor de atributo lang que comienza con "de"
//Atributos no incluidos en este chuletario
<-- @ FORMULARIOS @ -->
· :input --> $(":input") --> Todos los elementos input (de entrada)
· :text --> $(":text") --> Todos los input de tipo = "text"
· :password --> $(":password") --> Todos los input de tipo = "password"
· :radio --> $(":radio") --> Todos los input de tipo = "radio"
· :checkbox --> $(":checkbox") --> Todos los input de tipo = "checkbox"
· :submit --> $(":submit") --> Todos los input de tipo = "submit"
· :reset --> $(":reset") --> Todos los input de tipo = "reset"
· :button --> $(":button") --> Todos los input de tipo = "button"
· :image --> $(":image") --> Todos los input de tipo = "image"
· :file --> $(":file") --> Todos los input de tipo = "file"
· :enabled --> $(":enabled") --> Todos los input habilitados
· :disabled --> $(":disabled") --> Todos los input deshabilitados
· :selected --> $(":selected") --> Todos los input seleccionados
· :checked --> $(":checked") --> Todos los input marcados

<--      -->

<-- ! HTML/CSS ! -->
<-- # PÁGINAS DE INTERES # -->

<-- # ACCESO RÁPIDO # -->

<--      -->

<-- ! EVENTOS ! -->
<-- # PÁGINAS DE INTERES # -->

<-- # ACCESO RÁPIDO # -->

<--      -->

<-- ! EFECTOS ! -->
<-- # PÁGINAS DE INTERES # -->

<-- # ACCESO RÁPIDO # -->

<--      -->

<-- ! TRAVERSING/VIAJANDO ! -->
<-- # PÁGINAS DE INTERES # -->

<-- # ACCESO RÁPIDO # -->

<--      -->

<-- ! MISC ! -->
<-- # PÁGINAS DE INTERES # -->

<-- # ACCESO RÁPIDO # -->

<--      -->

<-- ! AJAX ! -->
<-- # PÁGINAS DE INTERES # -->

<-- # ACCESO RÁPIDO # -->

<--      -->