let btn = document.getElementById('btn')
let div = document.getElementById('res')
let baseTrianguloInput = document.getElementById('baseTriangulo')
let alturaTrianguloInput = document.getElementById('alturaTriangulo')
let alturaPrismaInput = document.getElementById('alturaPrisma')

function calcular() {
    let baseTriangulo = parseFloat(baseTrianguloInput.value)
    let alturaTriangulo = parseFloat(alturaTrianguloInput.value)
    let alturaPrisma = parseFloat(alturaPrismaInput.value)

    let areaBase = (baseTriangulo * alturaTriangulo) / 2

    let volumePrisma = areaBase * alturaPrisma

    div.innerHTML = `
        O volume do prisma é: ${volumePrisma}
    `
}

function limparForm () {

}

btn.addEventListener('click', calcular)