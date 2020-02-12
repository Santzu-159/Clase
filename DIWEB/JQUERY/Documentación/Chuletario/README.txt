># Librería de Google:
https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js

># Lista de referencias:
https://www.w3schools.com/jquery/jquery_ref_overview.asp

<-- ! SELECTORES ! -->
<-- # PÁGINAS DE INTERES # -->
https://www.w3schools.com/jquery/jquery_ref_selectors.asp
https://api.jquery.com/category/selectors/
https://www.anerbarrena.com/jquery-selectors-selectores-4768/
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
https://www.w3schools.com/jquery/jquery_ref_html.asp
<-- # ACCESO RÁPIDO # -->
· addClass() --> Agrega uno o más nombres de clase a los elementos seleccionados
· after() --> Inserta contenido después de elementos seleccionados
· append() --> Inserta contenido al final de los elementos seleccionados
· appendTo() --> Inserta elementos HTML al final de los elementos seleccionados
· attr() --> Establece o devuelve atributos / valores de elementos seleccionados
· before() --> Inserta contenido antes de los elementos seleccionados
· clone() --> Hace una copia de los elementos seleccionados
· css() --> Establece o devuelve una o más propiedades de estilo para elementos seleccionados
· detach() --> Elimina elementos seleccionados (mantiene datos y eventos)
· empty() --> Elimina todos los nodos secundarios y el contenido de los elementos seleccionados
· hasClass() --> Comprueba si alguno de los elementos seleccionados tiene un nombre de clase especificado
· height() --> Establece o devuelve la altura de los elementos seleccionados
· html() --> Establece o devuelve el contenido de los elementos seleccionados.
· innerHeight() --> Devuelve la altura de un elemento (incluye relleno, pero no borde)
· innerWidth() --> Devuelve el ancho de un elemento (incluye relleno, pero no borde)
· insertAfter() --> Inserta elementos HTML después de los elementos seleccionados
· insertBefore() --> Inserta elementos HTML antes de los elementos seleccionados
· offset() --> Establece o devuelve las coordenadas de desplazamiento para los elementos seleccionados (en relación con el documento)
· offsetParent() --> Devuelve el primer elemento primario posicionado
· outerHeight() --> Devuelve la altura de un elemento (incluye relleno y borde)
· outerWidth() --> Devuelve el ancho de un elemento (incluye relleno y borde)
· position() --> Devuelve la posición (relativa al elemento padre) de un elemento
· prepend() --> Inserta contenido al comienzo de los elementos seleccionados
· prependTo() --> Inserta elementos HTML al comienzo de los elementos seleccionados
· prop() --> Establece o devuelve propiedades / valores de elementos seleccionados
· remove() --> Elimina los elementos seleccionados (incluidos datos y eventos)
· removeAttr() --> Elimina uno o más atributos de los elementos seleccionados
· removeClass() --> Elimina una o más clases de los elementos seleccionados
· removeProp() --> Elimina una propiedad establecida por el método prop()
· replaceAll() --> Reemplaza los elementos seleccionados con nuevos elementos HTML
· replaceWith() --> Reemplaza los elementos seleccionados con contenido nuevo
· scrollLeft() --> Establece o devuelve la posición horizontal de la barra de desplazamiento de los elementos seleccionados
· scrollTop() --> Establece o devuelve la posición vertical de la barra de desplazamiento de los elementos seleccionados
· text() --> Establece o devuelve el contenido de texto de los elementos seleccionados.
· toggleClass() --> Alterna entre agregar / eliminar una o más clases de elementos seleccionados
· unwrap() --> Elimina el elemento padre de los elementos seleccionados
· val() --> Establece o devuelve el atributo de valor de los elementos seleccionados (para elementos de formulario)
· width() --> Establece o devuelve el ancho de los elementos seleccionados
· wrap() --> Envuelve los elementos HTML alrededor de cada elemento seleccionado
· wrapAll() --> Envuelve los elementos HTML alrededor de todos los elementos seleccionados
· wrapInner() --> Envuelve los elementos HTML alrededor del contenido de cada elemento seleccionado

<--      -->

<-- ! EVENTOS ! -->
<-- # PÁGINAS DE INTERES # -->
https://www.w3schools.com/jquery/jquery_ref_events.asp
https://api.jquery.com/category/events/
https://aprende-web.net/librerias/jquery/jquery_8.php
https://www.arkaitzgarro.com/jquery/capitulo-5.html
<-- # ACCESO RÁPIDO # -->
· blur() --> Adjunta / activa el evento de desenfoque
· change() --> Adjunta / Activa el evento change
· click() --> Adjunta / Activa el evento click
· dblclick() --> Adjunta / Activa el evento de doble clic
· event.currentTarget --> El elemento DOM actual dentro de la fase de burbujeo de eventos
· event.data --> Contiene los datos opcionales pasados ​​a un método de evento cuando el controlador de ejecución actual está vinculado
· event.delegateTarget --> Devuelve el elemento donde se adjuntó el controlador de eventos jQuery actualmente llamado
· event.isDefaultPrevented() --> Devuelve si se llamó event.preventDefault () para el objeto de evento
· event.isImmediatePropagationStopped() --> Devuelve si se llamó event.stopImmediatePropagation () para el objeto de evento
· event.isPropagationStopped() --> Devuelve si se llamó event.stopPropagation () para el objeto de evento
· event.namespace --> Devuelve el espacio de nombres especificado cuando se activó el evento
· event.pageX --> Devuelve la posición del mouse con respecto al borde izquierdo del documento
· event.pageY --> Devuelve la posición del mouse con respecto al borde superior del documento
· event.preventDefault() --> Impide la acción predeterminada del evento
· event.relatedTarget --> Devuelve qué elemento se ingresa o sale del movimiento del mouse
· event.result --> Contiene el último / anterior valor devuelto por un controlador de eventos activado por el evento especificado
· event.stopImmediatePropagation() --> Impide que se llame a otros controladores de eventos
· event.stopPropagation() --> Evita que el evento haga burbujear el árbol DOM, evitando que cualquier controlador principal sea notificado del evento
· event.target --> Devuelve qué elemento DOM activó el evento
· event.timeStamp --> Devuelve el número de milisegundos desde el 1 de enero de 1970, cuando se activa el evento
· event.type --> Devuelve qué tipo de evento se activó
· event.which --> Devuelve qué tecla del teclado o botón del mouse se presionó para el evento
· focus() --> Adjunta / Activa el evento de foco
· focusin() --> Adjunta un controlador de eventos al evento focusin
· focusout() --> Adjunta un controlador de eventos al evento focusout
· hover() --> Adjunta dos controladores de eventos al evento hover
· keydown() --> Adjunta / Activa el evento keydown
· keypress() --> Adjunta / Activa el evento de pulsación de tecla
· keyup() --> Adjunta / Activa el evento keyup
· mousedown() --> Adjunta / Activa el evento mousedown
· mouseenter() --> Adjunta / Activa el evento mouseenter
· mouseleave() --> Adjunta / Activa el evento mouseleave
· mousemove() --> Adjunta / Activa el evento mousemove
· mouseout() --> Adjunta / Activa el evento mouseout
· mouseover() --> Adjunta / activa el evento mouseover
· mouseup() --> Adjunta / Activa el evento mouseup
· off() --> Elimina los controladores de eventos adjuntos con el método on ()
· on() --> Adjunta controladores de eventos a elementos
· one() --> Agrega uno o más controladores de eventos a los elementos seleccionados. Este controlador solo se puede activar una vez por elemento
· $.proxy() --> toma una función existente y devuelve una nueva con un contexto particular
· ready() --> Especifica una función para ejecutar cuando el DOM está completamente cargado
· resize() --> Adjunta / activa el evento de cambio de tamaño
· scroll() --> Adjunta / activa el evento scroll
· select() --> Adjunta / Activa el evento select
· submit() --> Adjunta / activa el evento de envío
· trigger() --> Activa todos los eventos vinculados a los elementos seleccionados
· triggerHandler() --> Activa todas las funciones vinculadas a un evento específico para los elementos seleccionados
//Se han omitido algunos métodos removidos o deprecated

<--      -->

<-- ! EFECTOS ! -->
<-- # PÁGINAS DE INTERES # -->
https://www.w3schools.com/jquery/jquery_ref_effects.asp
https://api.jquery.com/category/effects/
https://www.arkaitzgarro.com/jquery/capitulo-6.html
https://juanda.gitbooks.io/webapps/content/jQuery/efectos.html
<-- # ACCESO RÁPIDO # -->
· animate() --> Ejecuta una animación personalizada en los elementos seleccionados
· clearQueue() --> Elimina todas las funciones en cola restantes de los elementos seleccionados
· delay() --> Establece un retraso para todas las funciones en cola en los elementos seleccionados
· dequeue() --> Elimina la siguiente función de la cola y luego ejecuta la función
· fadeIn() --> Se desvanece en los elementos seleccionados
· fadeOut() --> Desvanece los elementos seleccionados
· fadeTo() --> Desvanece / desvanece los elementos seleccionados a una opacidad dada
· fadeToggle() --> Alterna entre los métodos fadeIn () y fadeOut ()
· finish() --> Detiene, elimina y completa todas las animaciones en cola para los elementos seleccionados.
· hide() --> Oculta los elementos seleccionados
· queue() --> Muestra las funciones en cola en los elementos seleccionados
· show() --> Muestra los elementos seleccionados
· slideDown() --> Desliza hacia abajo (muestra) los elementos seleccionados
· slideToggle() --> Alterna entre los métodos slideUp () y slideDown ()
· slideUp() --> Desliza hacia arriba (oculta) los elementos seleccionados
· stop() --> Detiene la animación que se está ejecutando actualmente para los elementos seleccionados
· toggle() --> Alterna entre los métodos hide () y show ()

<--      -->

<-- ! TRAVERSING/VIAJANDO ! -->
<-- # PÁGINAS DE INTERES # -->
https://www.w3schools.com/jquery/jquery_ref_traversing.asp
https://api.jquery.com/category/traversing/
https://www.geeksforgeeks.org/jquery-traversing/
<-- # ACCESO RÁPIDO # -->
· add () --> Agrega elementos al conjunto de elementos coincidentes
· addBack() --> Agrega el conjunto de elementos anterior al conjunto actual
· children() --> Devuelve todos los hijos directos del elemento seleccionado
· closest() --> Devuelve el primer ancestro del elemento seleccionado
· contents() --> Devuelve todos los elementos secundarios directos del elemento seleccionado (incluidos los nodos de texto y comentario)
· each() --> Ejecuta una función para cada elemento coincidente
· end() --> Finaliza la operación de filtrado más reciente en la cadena actual y devuelve el conjunto de elementos coincidentes a su estado anterior
· eq() --> Devuelve un elemento con un número de índice específico de los elementos seleccionados
· filter() --> Reduce el conjunto de elementos coincidentes a los que coinciden con el selector o pasan la prueba de la función
· find() --> Devuelve elementos descendientes del elemento seleccionado
· first() --> Devuelve el primer elemento de los elementos seleccionados
· has() --> Devuelve todos los elementos que tienen uno o más elementos dentro de ellos
· is() --> Comprueba el conjunto de elementos coincidentes con un objeto selector / element / jQuery, y devuelve verdadero si al menos uno de estos elementos coincide con los argumentos dados
· last() --> Devuelve el último elemento de los elementos seleccionados
· map() --> Pasa cada elemento del conjunto coincidente a través de una función, produciendo un nuevo objeto jQuery que contiene los valores de retorno
· next() --> Devuelve el siguiente elemento hermano del elemento seleccionado
· nextAll() --> Devuelve todos los siguientes elementos hermanos del elemento seleccionado
· nextUntil() --> Devuelve todos los siguientes elementos hermanos entre dos argumentos dados
· not() --> Devuelve elementos que no coinciden con ciertos criterios
· offsetParent() --> Devuelve el primer elemento padre posicionado
· parent() --> Devuelve el elemento primario directo del elemento seleccionado
· parents() --> Devuelve todos los elementos ancestros del elemento seleccionado
· parentsUntil() --> Devuelve todos los elementos ancestros entre dos argumentos dados
· prev() --> Devuelve el elemento hermano anterior del elemento seleccionado
· prevAll() --> Devuelve todos los elementos hermanos anteriores del elemento seleccionado
· prevUntil() --> Devuelve todos los elementos hermanos anteriores entre dos argumentos dados
· siblings() --> Devuelve todos los elementos hermanos del elemento seleccionado
· slice() --> Reduce el conjunto de elementos coincidentes a un subconjunto especificado por un rango de índices
//Se han omitido algunos métodos removidos o deprecated

<--      -->

<-- ! MISC ! -->
<-- # PÁGINAS DE INTERES # -->
https://www.w3schools.com/jquery/jquery_ref_misc.asp
https://api.jquery.com/category/miscellaneous/
<-- # ACCESO RÁPIDO # -->
· data() --> Adjunta datos u obtiene datos de elementos seleccionados
· each() --> Ejecuta una función para cada elemento coincidente
· get() --> Obtiene los elementos DOM que coinciden con el selector
· index() --> Busca un elemento dado entre los elementos coincidentes
· $.noConflict() --> Libera el control de jQuery de la variable $
· $.param() --> Crea una representación serializada de una matriz u objeto (puede usarse como cadena de consulta de URL para solicitudes AJAX)
· removeData() --> Elimina un dato previamente almacenado
· toArray() --> Recupera todos los elementos DOM contenidos en el conjunto jQuery, como una matriz
//Se han omitido algunos métodos removidos o deprecated

<--      -->

<-- ! AJAX ! -->
<-- # PÁGINAS DE INTERES # -->
https://www.w3schools.com/jquery/jquery_ref_ajax.asp
https://api.jquery.com/jQuery.ajax/#jQuery-ajax-url-settings
https://uniwebsidad.com/libros/fundamentos-jquery/capitulo-7/metodos-ajax-de-jquery
https://www.arkaitzgarro.com/jquery/capitulo-7.html
<-- # ACCESO RÁPIDO # -->
· $.ajax() --> Realiza una solicitud asíncrona AJAX
· $.ajaxPrefilter() --> Maneja las opciones personalizadas de Ajax o modifica las opciones existentes antes de enviar cada solicitud y antes de que sean procesadas por $ .ajax ()
· $.ajaxSetup() --> Establece los valores predeterminados para futuras solicitudes AJAX
· $.ajaxTransport() --> Crea un objeto que maneja la transmisión real de datos Ajax
· $.get() --> Carga datos de un servidor utilizando una solicitud AJAX HTTP GET
· $.getJSON() --> Carga datos codificados en JSON desde un servidor utilizando una solicitud HTTP GET
· $.getScript() --> Carga (y ejecuta) un JavaScript desde un servidor utilizando una solicitud AJAX HTTP GET
· $.param() --> Crea una representación serializada de una matriz u objeto (puede usarse como cadena de consulta de URL para solicitudes AJAX)
· $.post() --> Carga datos de un servidor utilizando una solicitud POST HTTP AJAX
· ajaxComplete() --> Especifica una función que se ejecutará cuando se complete la solicitud AJAX
· ajaxError() --> Especifica una función para ejecutar cuando la solicitud AJAX se completa con un error
· ajaxSend() --> Especifica una función para ejecutar antes de que se envíe la solicitud AJAX
· ajaxStart() --> Especifica una función para ejecutar cuando comienza la primera solicitud AJAX
· ajaxStop() --> Especifica una función para ejecutar cuando se hayan completado todas las solicitudes de AJAX
· ajaxSuccess() --> Especifica una función para ejecutar cuando una solicitud AJAX se completa con éxito
· load() --> Carga datos de un servidor y coloca los datos devueltos en el elemento seleccionado
· serialize() --> Codifica un conjunto de elementos de formulario como una cadena para enviar
· serializeArray() --> Codifica un conjunto de elementos de formulario como una matriz de nombres y valores
//Se han omitido algunos métodos removidos o deprecated

<--      -->

//Propiedades no se incluye en este chuletario, si quiere saber sobre ellas acceda al siguiente link:
https://www.w3schools.com/jquery/jquery_ref_prop.asp