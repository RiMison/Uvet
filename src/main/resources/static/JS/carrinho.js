          // Função para adicionar produto ao carrinho
            function incrementQuantity(button) {
                const inputElement = button.parentElement.querySelector(".product-qtd-input");
                const currentQuantity = parseInt(inputElement.value, 10);
                if (currentQuantity < 200) {
                    inputElement.value = currentQuantity + 1;
                    updateCart();
                }
            }

            // Função para remover produto do carrinho
            function decrementQuantity(button) {
                const inputElement = button.parentElement.querySelector(".product-qtd-input");
                const currentQuantity = parseInt(inputElement.value, 10);
                if (currentQuantity > 0) {
                    inputElement.value = currentQuantity - 1;
                    updateCart();
                }
            }

            // Função para atualizar o carrinho e o total
            function updateCart() {
                const products = document.querySelectorAll(".produto1");
                let total = 0;
                const cartList = [];

                products.forEach((product) => {
                    const quantity = parseInt(product.querySelector(".product-qtd-input").value, 10);
                    const price = parseFloat(product.querySelector(".cart-produto").textContent.replace("R$", "").replace(",", "."));
                    const subtotal = quantity * price;
                    total += subtotal;

                    if (quantity > 0) {
                        cartList.push(`${product.querySelector(".nome-produto").textContent} x ${quantity}`);
                    }
                });

                const cartListElement = document.getElementById("lista-de-compras");
                cartListElement.innerHTML = "";
                cartList.forEach((item) => {
                    const li = document.createElement("li");
                    li.textContent = item;
                    cartListElement.appendChild(li);
                });

                const totalCarrinho = document.getElementById("total-carrinho");
                totalCarrinho.textContent = `R$ ${total.toFixed(2)}`;
            }

            // Inicializar o carrinho
            updateCart();

            document.getElementById('open-cart').addEventListener('click', function () {
                var main = document.querySelector('.overlay');
                var menuHamburguer = document.querySelector('.menu-hamburguer');
    
                if (main.style.display === 'block') {
                    main.style.display = 'none';
                    menuHamburguer.style.left = '-250px'; // Esconde o menu de hambúrguer
                } else {
                    main.style.display = 'block';
                    menuHamburguer.style.left = '0'; // Mostra o menu de hambúrguer
                }
            });
    
            document.getElementById('close-cart').addEventListener('click', function () {
                var main = document.querySelector('.overlay');
                var menuHamburguer = document.querySelector('.menu-hamburguer');
    
                main.style.display = 'none';
                menuHamburguer.style.left = '-250px'; // Esconde o menu de hambúrguer
            });