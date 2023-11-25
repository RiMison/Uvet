// Função para fechar o menu
function closeMenu() {
    menu.classList.remove('bx-x');
    navbar.classList.remove('open');
}

let menu = document.querySelector('#menu-icon');
let navbar = document.querySelector('.navbar');

menu.onclick = () => {
    menu.classList.toggle('bx-x');
    navbar.classList.toggle('open');
};

// Adicionar evento de clique a cada link no menu
let menuLinks = document.querySelectorAll('.navbar a');

menuLinks.forEach(link => {
    link.addEventListener('click', () => {
        closeMenu(); // Fecha o menu ao clicar em um link
    });
});