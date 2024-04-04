
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let num1Input = document.getElementById('num1')
let num2Input = document.getElementById('num2')

function calcular() {
    
    let num1 = num1Input.value //salário
    let num2 = num2Input.value //quantidade de Kw

    let valorKw = (num1 / 7) / 100
    let valorTotal = valorKw * num2
    let desconto = 10 / 100
    let valorDesc = valorTotal - desconto

    div.innerHTML = `
        O valor paga em cada Quilowatts é: ${valorKw} <br>
        O valor total pago será: ${valorTotal} <br>
        O valor total a ser pago com 10% de desconto é de: ${valorDesc} <br>
    `
}

function limparForm () {

}

btn.addEventListener('click', calcular)