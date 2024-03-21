let btn = document.getElementById('btn')
let div = document.getElementById('res')
let numInput = document.getElementById('number')

function calcular() {
    num = parseFloat(numInput.value)

    div.innerHTML = `O número ${num} elevado a 2 é: ${num ** 2} <br>
    O número ${num} elevado a 3 é: ${num ** 3} <br>
    O número ${num} elevado a 4 é: ${num ** 4} <br>
    O número ${num} elevado a 5 é: ${num ** 5} <br>
    `

    limparForm()
}

function limparForm () {
    numInput.value = ''
    numInput.focus()
}

btn.addEventListener('click', calcular)