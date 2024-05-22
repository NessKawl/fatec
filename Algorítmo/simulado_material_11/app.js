let btn = document.querySelector('#btn')
let div = document.querySelector('#res')
let palavraInput = document.querySelector('#palavra')

function validar () {
    let palavra = palavraInput.value

    for (let i = 0; i < palavra.length; i++) {
        if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'E' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'I' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'O' || palavra.charAt(i) == 'u' || palavra.charAt(i) == 'U') {
            div.innerHTML += palavra[i]
        } else {
            div.innerHTML += '#'
        }
    }
}

btn.addEventListener('click', validar)