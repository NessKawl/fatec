let n1 = parseFloat(prompt('Digite um número'))
let n2 = parseFloat(prompt('Digite mais um número'))
let n3 = parseFloat(prompt('Digite mais um número'))
let n4 = parseFloat(prompt('Digite mais um número')) 
let n5 = parseFloat(prompt('Digite mias um número'))

let soma = n1 + n2 + n3 + n4 + n5

console.log(`Os números digitados foram ${n1}, ${n2}, ${n3}, ${n4}, ${n5} e sua soma é ${soma}`);

document.getElementById('res').innerHTML = `Os números digitados foram ${n1}, ${n2}, ${n3}, ${n4}, ${n5} e sua soma é ${soma}`