let btn = document.querySelector('#btn')
let div = document.querySelector('#res')
let palavraInput = document.querySelector('#palavra')

function validar () {
    let palavra = palavraInput.value

    let vogais = 0
    let consoantes = 0

    let palavraSep = ''
    let vogalSub = ''
    let consoanteSub = ''

    for (let i = 0; i < palavra.length; i++) {
        if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'E' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'I' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'O' || palavra.charAt(i) == 'u' || palavra.charAt(i) == 'U') {
            vogais++
            vogalSub += '@' 
            consoanteSub += palavra[i]
        } else {
            consoantes++
            consoanteSub += '#'
            vogalSub += palavra[i]
        }
        palavraSep += palavra[i] + '-'
    }

    div.innerHTML += `
        <p>Palavra digitada: ${palavra}</p>
        <p>Palavra separada: ${palavraSep}</p>
        <p>Quantidade de caracteres: ${palavra.length}</p>
        <p>Quantidade de vogais: ${vogais}</p>
        <p>Quantidade de consoantes: ${consoantes}</p>
        <p>Substituindo vogais: ${vogalSub}</p>
        <p>Substituindo consoantes: ${consoanteSub}</p>
        <hr>
    `

}

btn.addEventListener('click', validar)