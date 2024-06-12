let numInput = document.querySelector('#num')
let div = document.querySelector('#res')
let btn = document.querySelector('#btn')

let arrNum = []

function calcular () {

    let num = parseFloat(numInput.value)
    arrNum.push(num)

    let metade = num / 2 

    div.innerHTML += `
        <p>${num}</p>
        <p>${metade}</p>
        <hr>
    `


}

btn.addEventListener('click', calcular)