
let btn = document.getElementById('btn')
let div = document.getElementById('res')
let numInput = document.getElementById('number')

function calcular() {
    num = parseFloat(numInput.value)

    div.innerHTML = `O número digitado foi: ${num} <br>
    Sua raiz cúbica é: ${Math.cbrt(num)} <br>
    Sua raiz quadrada é: ${Math.sqrt(num)}
    `

    limparForm();
}

function limparForm () {
    numInput.value = ''
    numInput.focus()
}

btn.addEventListener('click', calcular)