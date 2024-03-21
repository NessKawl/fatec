
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let num1Input = document.getElementById('num1')
let num2Input = document.getElementById('num2')
let num3Input = document.getElementById('num3')
let num4Input = document.getElementById('num4')

function calcular() {

    num1 = parseFloat(num1Input.value)
    num2 = parseFloat(num2Input.value)
    num3 = parseFloat(num3Input.value)
    num4 = parseFloat(num4Input.value)

    let mediaPon = ((num1 * 1) + (num2 * 2) + (num3 * 3) + (num4 * 4)) / 10

    div.innerHTML = `
        A média ponderada dos números ${num1}, ${num2}, ${num3} e ${num4}, com pesos respectivamente de 1, 2, 3 e 4 é: ${mediaPon}
    `

    limparForm()
}

function limparForm () {
    num1Input.value = ''
    num2Input.value = ''
    num3Input.value = ''
    num4Input.value = ''

    num1Input.focus()
}

btn.addEventListener('click', calcular)