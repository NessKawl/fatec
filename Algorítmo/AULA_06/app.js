
// (cond) ? [true] : [false]

let a = 10
let b = '10'
let c = 11

console.log(a == b ? "A é igual B" : "A é diferente de B")

let aux = (a === b) ? "A é idêntico a B" : "A não é idêntico a B"

console.log(aux)

aux = (a > c) ? "A é maior" : "C é maior"

console.log(aux)

aux = (a === b || a == b) ? "True" : "False"

console.log(aux);
console.log(typeof aux);

aux = (a < c && a == b) ? true : false

console.log(aux)
console.log(typeof aux);

console.log(a === b);
console.log('----------------------');

console.log(a > b);
console.log(a == b && a < c);
console.log(a < b || a === b || c < a || a == b);
console.log('----------------------');

let x 
console.log(x);

let div = 'a'/2
console.log(div);
console.log('----------------------');

if (a == b) {
    console.log("Bloco true");
}

aux = c

if (aux % 2 == 0) {
    console.log(`${aux} é PAR`);
} else {
    console.log(`${aux} é IMPAR`);
}

let diaSemana = 0

if (diaSemana == 0) {
    console.log("Domingo");
}else if(diaSemana == 1) {
    console.log("Segunda");
}else if(diaSemana == 2) {
    console.log("Terça");
}else if(diaSemana == 3) {
    console.log("Quarta");
}else if(diaSemana == 4) {
    console.log("Quinta");
}else if(diaSemana == 5) {
    console.log("Sexta");
}else if(diaSemana == 6) {
    console.log("Sábado");
}else {
    console.log("Ops!!!!");
}