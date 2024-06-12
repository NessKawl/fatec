let numInput = document.querySelector('#num')
let div = document.querySelector('#res')
let btn = document.querySelector('#btn')


function calcular () {

    let num = parseFloat(numInput.value)

    div.innerHTML = ''

    if (num < 10 && num > 0) {
        for (let i = 100; i >= num; i--) {
            div.innerHTML += `
                <p>${i}</p>
            `
        }
    } else {
        div.innerHTML += 'ERRO: DIGITE UM NÚMERO VÁLIDO!!'
    }
}

btn.addEventListener('click', calcular)