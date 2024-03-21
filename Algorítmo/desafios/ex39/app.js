let btn = document.querySelector('#btn')
let div = document.querySelector('#res')
let baseMenorInput = document.querySelector('#baseMenor')
let baseMaiorInput = document.querySelector('#baseMaior')
let alturaInput = document.querySelector('#altura')

function calcular() {
    let baseMenor = parseFloat(baseMenorInput.value)
    let baseMaior = parseFloat(baseMaiorInput.value)
    let alutra = parseFloat(alturaInput.value)
    
    let area = ((baseMenor + baseMaior) * alutra ) / 2

    div.innerHTML = `
        A área do trapézio com b: ${baseMenor}, B: ${baseMaior} e h: ${alutra} é ${area}
    `

    limparForm()
}

function limparForm () {
    baseMaiorInput.value = ''
    baseMenorInput.value = ''
    alturaInput.value = ''
    
    baseMenorInput.focus()
}

btn.addEventListener('click', calcular)