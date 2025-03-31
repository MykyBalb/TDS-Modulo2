function getProdutcs() {
  let pBanco = document.querySelector('#produtos-banco');
  fetch('http://localhost:8080/produto')
    .then((response) => response.json())
    .then((data) => formataComoTabela(data))
    .catch((error) => console.error('Erro:', error));
}

function formataComoTabela(data) {
  let tabelaProdutos = document.getElementById('tabela-produtos');
  for (let i = 0; i < data.length; i++) {
    let paraInserir =
      '<td>' +
      data[i].id +
      '</td>' +
      '<td>' +
      data[i].nome +
      '</td>' +
      '<td>' +
      data[i].descricao +
      '</td>' +
      '<td>' +
      data[i].quantidade +
      '</td>';
    tabelaProdutos.innerHTML += paraInserir;
  }
}

