console.log('Olá mundo!!!!') /* IMPRIME MSG NO CONSOLE */

/*alert('Olá mundo!!!!') /* IMPRIME A MSG EM UMA CAIXA DE ALERTA */

// innerText -- NÃO RECONHECE TAGS HTML
// textContent -- NÃO RECONHECE TAGS HTML
// innerHTML -- RECONHECE AS TAGS HTML

document.getElementById('msg').innerText = 'Exemplo com <strong>innerText</strong>' /* PEGA UM ELEMENTO PELO ID E ALTERA CONTEUDO COM innerText */

document.getElementById('msg2').textContent = 'Exemplo com <strong>textContent</strong>'

document.getElementById('msg3').innerHTML = 'Exemplo com <strong>innerHTML</strong>'

// VARIÁVEIS

// let CRIA VARIÁVEL 

let n1 = prompt('Digite seu nome')

document.getElementById('msg4').innerText = n1

