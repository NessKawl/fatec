let btn = document.getElementById('btn')
let div = document.getElementById('res')
let n1 = document.getElementById('n1')

let arrNumero = []

function inserirValor () {
    arrNumero.push(n1.value)

    div.innerHTML = ''

    for (let i = 0; i < arrNumero.length; i++) {

        if (arrNumero[i] % 2 == 0) {
            div.innerHTML += `<span class="verde"> ${arrNumero[i]} </span>`
        } else {
            div.innerHTML += `<span class="red"> ${arrNumero[i]} </span>`
        }

    }

    limpar()

}

function limpar () {
    n1.value = ''

    n1.focus()
}


btn.addEventListener('click', inserirValor)