
let btn = document.getElementById('btn')
let div = document.getElementById('res')
let numberInput = document.getElementById('number')

function calcular() {
    number = parseFloat(numberInput.value) 

    div.innerHTML =`A raiz quadrada de ${number} é ${Math.sqrt(number)}`
}

function limparForm () {
    numberInput.value = ''
    numberInput.focus()
}

btn.addEventListener('click', calcular)