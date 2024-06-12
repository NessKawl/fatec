let numInput = document.querySelector('#num')
let div = document.querySelector('#res')
let btn = document.querySelector('#btn')

let arrNum = []

function calcular () {

    let num = parseFloat(numInput.value)
    arrNum.push(num)

    let quadrado = num ** 2 

    div.innerHTML += `
        <p>${num}</p>
        <p>${quadrado}</p>
        <hr>
    `


}

btn.addEventListener('click', calcular)