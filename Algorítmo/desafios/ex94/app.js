let nomeAlunoInput = document.querySelector('#nomeAluno')
let nota1Input = document.querySelector('#nota1')
let nota2Input = document.querySelector('#nota2')

let btn = document.querySelector('#btn')
let div = document.querySelector('#res')

let arrAluno = []

function calcular () {

    let nome = nomeAlunoInput.value
    let nota1 = parseFloat(nota1Input.value)
    let nota2 = parseFloat(nota2Input.value)

    let aluno = {
        nome: nome,
        nota1: nota1,
        nota2: nota2,
    }


    arrAluno.push(aluno)

    div.innerHTML = ''

    let numAluno = 0

    for (let i = 0; i < arrAluno.length; i++) {
        numAluno++

        media = (arrAluno[i].nota1 + arrAluno[i].nota2)/2

        div.innerHTML += `
            <div class="col-lg-3 mb-5 border m-3">
                <div class="p-3">
                    <p><strong>Aluno ${numAluno}</strong></p>
                    <p><strong>Nome:</strong> ${arrAluno[i].nome}</p>
                    <p><strong>Media:</strong> ${media}</p>
                </div>
            </div>
        `
    }
    console.log(arrAluno);

    clear()
    aprovadoReprovado()
}

function aprovadoReprovado () {
     
    let aprovado = 0
    let reprovado = 0

    for (let i = 0; i < arrAluno.length; i++) {
        if (media = (arrAluno[i].nota1 + arrAluno[i].nota2)/2 >= 7) {
            aprovado++
        } else {
            reprovado++
        }
    }

    div.innerHTML += `
        <p class="text-success">Alunos aprovados: ${aprovado}</p>
        <p class="text-danger">Alunos reprovados: ${reprovado}</p>
    `
    
}

function clear () {
    nomeAlunoInput.value = ''
    nota1Input.value = ''
    nota2Input.value = ''

    nomeAlunoInput.focus()
}

btn.addEventListener('click', calcular)