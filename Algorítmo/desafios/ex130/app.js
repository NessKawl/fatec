let numInput = document.querySelector('#num')
let div = document.querySelector('#res')
let btn = document.querySelector('#btn')


function calcular () {

    let num = parseFloat(numInput.value)

    div.innerHTML = ''

    if (num > 10) {
        for (let i = 1; i <= num; i++) {
            div.innerHTML += `${i} - `
        }
    } else {
        div.innerHTML = 'DIGITE UM NÚMERO VÁLIDO!'
    }

}

btn.addEventListener('click', calcular)