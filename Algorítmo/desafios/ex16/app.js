
let btn = document.getElementById('btn')
let div = document.getElementById('res')
//-----------------------------------
let n1 = document.getElementById('n1')
let n2 = document.getElementById('n2')

function calcular() {
    let numero1 = parseFloat(n1.value)
    let numero2 = parseFloat(n2.value)

    let soma = numero1 + numero2
    let subtracao = numero1 - numero2
    let divisao = numero1 / numero2
    let multiplicacao = numero1 * numero2
    let media = (numero1 + numero2)/2

    div.innerHTML = `
        Os números digitados foram ${numero1} e ${numero2} <br>
        A soma dos números ${numero1} e ${numero2} é ${soma} <br>
        A subtração dos números ${numero1} e ${numero2} é ${subtracao} <br>
        A divisão entre os números ${numero1} e ${numero2} é ${divisao} <br>
        A multiplicação entre os números ${numero1} e ${numero2} é ${multiplicacao} <br>
        A média entre os números ${numero1} e ${numero2} é ${media}
`

limparForm()
}

function limparForm() {
    n1.value = ''
    n2.value = ''

    n1.focus()
}

btn.addEventListener('click', calcular)
