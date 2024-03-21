
let btn = document.getElementById('btn')
let div = document.getElementById('res')
let raioInput = document.getElementById('raio')

function calcular() {
    let raio = parseFloat(raioInput.value)
    
    let areaEsfera = 4 * Math.PI * raio ** 2
    let volumeEsfera = (4 * Math.PI * raio ** 3) / 3

    div.innerHTML = `
        A área da esfera é: ${areaEsfera} <br>
        O volume da esferea é: ${volumeEsfera}
    `
}

function limparForm () {

}

btn.addEventListener('click', calcular)