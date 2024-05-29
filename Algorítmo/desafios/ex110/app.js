let btn = document.querySelector('#btn')
let div = document.querySelector('#res')
let numInput = document.querySelector('#numero')

let arrNumero = []

function validar() {
    let numero = parseFloat(numInput.value)

    arrNumero.push(numero)
    
    let maiorNumero = numero

    div.innerHTML = ''

    let todosNumeros = ''

    for(let i = 0; i < arrNumero.length; i++){
        if (arrNumero[i] > maiorNumero) {
            maiorNumero = arrNumero[i]
        }
        todosNumeros += arrNumero[i] + ', '
    }

    div.innerHTML += `
        <p>Os números digitados são: ${todosNumeros}</p>
        <p>O maior número digitado foi: ${maiorNumero}</p>
    `

}

btn.addEventListener('click', validar)