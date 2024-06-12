let numInput = document.querySelector('#num')
let div = document.querySelector('#res')
let btn = document.querySelector('#btn')

let arrNum = []

function calcular() {

    let num = parseFloat(numInput.value)
    arrNum.push(num)
    div.innerHTML = ''

    if (arrNum.length >= 2) {
        btn.classList.add('d-none')
    }

    if (arrNum[0] != arrNum[1] && arrNum[0] > 0 && arrNum[1] > 0) {
        for (let i = arrNum[0]; i < arrNum[1]; i++) {
            if (arrNum[i] % 5 == 0) {
                div.innerHTML += arrNum[i]
            }
        } 
    } else {
        div.innerHTML += 'ERRO'
    }
    
}

btn.addEventListener('click', calcular)