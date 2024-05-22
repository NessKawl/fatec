let texto = "  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima illum quidem repellat nihil adipisci vitae consectetur! Quidem ducimus ullam eum sint repellendus, veritatis molestiae nemo optio illum dignissimos ad rem!"

console.log(texto);
console.log(texto.toUpperCase());
console.log(texto);
console.log(texto.toLowerCase());
console.log(texto);
console.log(texto.length);
console.log('------------------');
console.log(texto);
console.log(texto.trim());
console.log(texto.length);
console.log(texto.trim().length);
console.log('-------------------');
console.log(texto[0]);
console.log(texto[3]);
console.log(texto[5]);
console.log('-------------------');
console.log(' '.length);
console.log(''.length);
console.log('     '.length);

let qtdVazio = 0
let texto2 = ''

for (let i = 0; i < texto.length;i++) {
    // if (texto[i] == ' ') {
    //     console.log(++qtdVazio);
    // }
    if (texto[i] == ' ') {
        texto2 += ''
        qtdVazio++
    } else { 
        texto2 += texto[i]
    }
    
}

console.log(texto2);
console.log('Quantidade de espaços removidos: ' + qtdVazio);