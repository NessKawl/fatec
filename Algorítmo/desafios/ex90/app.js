let numInput = document.querySelector('#numero')
let btn = document.querySelector('#btn')
let div = document.querySelector('#res')

let arrNumero = []

btn.addEventListener('click', ()=>{

    let num = parseFloat(numInput.value)

    arrNumero.push(num)


    let todosNumeros = ''
    let soma = 0
    let quantPar = 0
    let somaPar = 0

    for (let i = 0; i < arrNumero.length; i++) {
       
        // Todos os números
        todosNumeros += `${arrNumero[i]} `
        
        // Soma de todos os números 
        soma += arrNumero[i]
        
        // Números pares
        if (arrNumero[i] % 2 === 0) {
            quantPar++
            somaPar += arrNumero[i]
        }

    }

    let media = soma / arrNumero.length

    let mediaPar = somaPar / quantPar

    div.innerHTML = `
        <p>Números: ${todosNumeros}</p>
        <p>Soma dos números: ${soma}</p>
        <p>Quantidade de números: ${arrNumero.length}</p>
        <p>A média dos números é: ${media}</p>
        <p>A média dos números é: ${mediaPar}</p>
    `
    clear()
})

function clear () {
    numInput.value = ''
    numInput.focus()
}