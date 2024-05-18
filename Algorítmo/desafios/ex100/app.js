let numeroInput = document.querySelector('#numero')

let btn = document.querySelector('#btn')
let div = document.querySelector('#res')

let arrNumero = []

function calcular() {
    let numero = parseFloat(numeroInput.value)

    arrNumero.push(numero)

    if (arrNumero.length >= 2) {
        numeroInput.classList.add('d-none')
        btn.classList.add('d-none')
    }

    let soma = 0
    div.innerHTML=''

    if (arrNumero[0] < arrNumero[1]) {
        for (let i = arrNumero[0]; i < arrNumero[1]; i++) {
            if (i > arrNumero[0] && i % 2 === 0) {
                soma += i
                div.innerHTML = `
                    <p>A soma dos números pares entre ${arrNumero[0]} e ${arrNumero[1]} é: ${soma}
                `
            }
        }     
    } else {
        for (let i = arrNumero[1]; i < arrNumero[0]; i++) {
            if (i > arrNumero[1] && i % 2 === 0) {
                soma += i
                div.innerHTML += `
                    <p>A soma dos números pares entre ${arrNumero[0]} e ${arrNumero[1]} é: ${soma}
                `
            }
        }
    }
    
    clear()
}

function clear() {
    numeroInput.value = ''
    numero.focus()
}

btn.addEventListener('click', calcular)
