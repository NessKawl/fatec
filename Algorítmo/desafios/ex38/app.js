let btn = document.getElementById('btn')
let div = document.getElementById('res')

let aInput = document.getElementById('A')
let bInput = document.getElementById('B')
let cInput = document.getElementById('C')


function calcular() {
    let a = parseFloat(aInput.value)
    let b = parseFloat(bInput.value)
    let c = parseFloat(cInput.value)

    let volume = a*b*c

    div.innerHTML = `
        O <strong>volume</strong> do paralelepípedo com lados <strong>A:</strong> ${a}, <strong>B:</strong> ${b}, <strong>C:</strong> ${c} é ${volume}
    `
}

function limparForm () {
    aInput.value = ''
    bInput.value = ''
    cInput.value = ''

    aInput.focus()
}

btn.addEventListener('click', calcular)