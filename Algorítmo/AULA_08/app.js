
let btn = document.querySelector('#btn')
let div = document.querySelector('#res')

let arrPessoa = []

function calcular() {

    let pessoa = {
        nome: document.querySelector('#nome').value,
        idade: document.querySelector('#idade').value
    }
    arrPessoa.push(pessoa)
    console.log(pessoa);
    console.log(arrPessoa);

    div.innerHTML = ''
    for(let i = 0; i < arrPessoa.length; i++) {
        div.innerHTML += `
            <p>
                NOME: ${arrPessoa[i].nome} <br>
                IDADE: ${arrPessoa[i].idade} <br>
            </p>
        `
    }

}

function limparForm() {

}

btn.addEventListener('click', calcular)