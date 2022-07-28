function Ejercicio1() {
    var clima = window.prompt("como esta el clima del dia de hoy");
    window.alert(`El clima esta ${clima}`);
}

function Ejercicio2() {
    var radio = window.prompt("ingrese el radio de la circunferencia");
    area = 3.14 * radio ** 2;
    perimetro = 2 * 3.14 * radio;
    window.alert(`El Area es: ${area}, y el perimetro es : ${perimetro}`);
}

let Ejercicio10 = (palabra) => palabra.split("").reverse().join("");

let Ejercicio12 = (variable) => typeof variable;




//Ejercicio 14

function libro(isbn, titulo, autor, numPaginas) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
}

function crearLibro() {
    var isbn = window.prompt("ingrese el isbn");
    var titulo = window.prompt("ingrese el titulo");
    var autor = window.prompt("ingrese el autor");
    var numPaginas = window.prompt("ingrese el numero de paginas");
    var librito = new libro(isbn, titulo, autor, numPaginas);
    return librito
}

function mostrarLibro(libro) {
    window.alert(`El ISBN es: ${libro.isbn}, el titulo es : ${libro.titulo}
    , el autor es : ${libro.autor} y el numero de paginas es : ${libro.numPaginas}`);
}

// var librito = new crearLibro();
// mostrarLibro(librito);

var valores = [true, 5, false, "hola", "adios", 2]
function ejercicio18(valores) {
    if (valores[3] > valores[4]) {
        max = valores[3]
    } else {
        max = valores[4]
    }

    window.alert(`a) El mayor es: ${max}`);
}
//ejercicio18(valores);


//Ejercicio23
//window.onload = ejercicio23;

function ejercicio23() {
    const texto = document.getElementById("parrafo").textContent;
    var palabras = texto.split(" ");
    var parrafoFinal = [];
    for (let palabra of palabras){
        if (palabra.length > 8) {
            console.log("mayor a 8")
            palabra = "<mark>" + palabra + "</mark>";
        }
        parrafoFinal.push(palabra)
    }
    const p = document.getElementById("parrafo")
    p.innerHTML = parrafoFinal.join(" ");
}



//Ejercicio24
window.onload = function(){
    document.getElementById("calcular").onclick = function (){
        let radio = document.getElementById("radio").value;
        
        area = 3.14 * radio ** 2;
        perimetro = 2 * 3.14 * radio;
        //window.alert(radio);
        let a = document.getElementById("area");
        let p = document.getElementById("perimetro");
        a.textContent = `Area: ${area}`;
        p.textContent = `Perimetro: ${perimetro}`; 
    };
};
