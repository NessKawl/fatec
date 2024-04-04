
let btn = document.getElementById('btn')
let div = document.getElementById('res')

let salarioInput = document.getElementById('salario')

function calcular() {
    let salario = parseFloat(salarioInput.value)

    let aumento = 25 / 100 * salario

    let novoSalario = salario + aumento

    div.innerHTML = `
        O salário é: ${salario} <br>
        Com um aumento de 25% o salário passa a ser de ${novoSalario}
    `
}

function limparForm () {

}

btn.addEventListener('click', calcular)