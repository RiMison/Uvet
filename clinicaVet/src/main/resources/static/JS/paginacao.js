const itemsPerPage = 5; // Define a quantidade de itens por página
const purchsecDivs = document.querySelectorAll('.purch-sec');
const totalItems = purchsecDivs.length;
let currentPage = 1;

// Função para mostrar os itens da página atual
function showItemsOnPage(page) {
    purchsecDivs.forEach((div, index) => {
        if (index >= (page - 1) * itemsPerPage && index < page * itemsPerPage) {
            div.style.display = 'block';
        } else {
            div.style.display = 'none';
        }
    });
}

// Função para criar a numeração de páginas
function createPaginationButtons() {
    const paginationContainer = document.getElementById('pagination-container');
    paginationContainer.innerHTML = '';

    const totalPages = Math.ceil(totalItems / itemsPerPage);

    function goToPage(page) {
        if (page >= 1 && page <= totalPages) {
            currentPage = page;
            showItemsOnPage(currentPage);
            createPaginationButtons(); // Atualize a numeração da página ao navegar para outra página
        }
    }

    const numPagesToShow = 3; // Quantidade de números de página a serem mostrados
    let startPage = currentPage - Math.floor(numPagesToShow / 2);
    let endPage = currentPage + Math.floor(numPagesToShow / 2);

    // Limitar o início e o fim das páginas a um intervalo válido
    if (startPage < 1) {
        startPage = 1;
        endPage = numPagesToShow;
    }
    if (endPage > totalPages) {
        endPage = totalPages;
        startPage = Math.max(1, totalPages - numPagesToShow + 1);
    }

    // Modifique a ordem da criação dos botões de seta
    const firstPageButton = document.createElement('button');
    firstPageButton.innerHTML = '«'; // Botão "<<" para ir para a primeira página
    firstPageButton.addEventListener('click', () => {
        goToPage(1);
    });
    paginationContainer.appendChild(firstPageButton);

    const prevButton = document.createElement('button');
    prevButton.innerHTML = '‹'; // Botão "<" para retroceder uma página
    prevButton.addEventListener('click', () => {
        if (currentPage > 1) {
            goToPage(currentPage - 1);
        }
    });
    paginationContainer.appendChild(prevButton);

    for (let i = startPage; i <= endPage; i++) {
        const button = document.createElement('button');
        button.textContent = i;
        button.addEventListener('click', () => {
            goToPage(i);
        });
        paginationContainer.appendChild(button);
    }

    const nextButton = document.createElement('button');
    nextButton.innerHTML = '›'; // Botão ">" para avançar uma página
    nextButton.addEventListener('click', () => {
        if (currentPage < totalPages) {
            goToPage(currentPage + 1);
        }
    });
    paginationContainer.appendChild(nextButton);

    const lastPageButton = document.createElement('button');
    lastPageButton.innerHTML = '»'; // Botão ">>" para ir para a última página
    lastPageButton.addEventListener('click', () => {
        goToPage(totalPages);
    });
    paginationContainer.appendChild(lastPageButton);

    updatePaginationButtons();
}

// Função para atualizar o estado dos botões de paginação
function updatePaginationButtons() {
    const buttons = document.querySelectorAll('#pagination-container button');
    buttons.forEach((button, index) => {
        if (index === 0) {
            button.disabled = currentPage === 1;
        } else if (index === 1) {
            button.disabled = currentPage === 1;
        } else if (index === buttons.length - 2) {
            button.disabled = currentPage === Math.ceil(totalItems / itemsPerPage);
        } else if (index === buttons.length - 1) {
            button.disabled = currentPage === Math.ceil(totalItems / itemsPerPage);
        } else {
            button.disabled = false;
        }

        if (parseInt(button.textContent) === currentPage) {
            button.classList.add('active');
        } else {
            button.classList.remove('active');
        }
    });
}

// Mostrar os itens da primeira página e criar os botões de paginação
showItemsOnPage(currentPage);
createPaginationButtons();
