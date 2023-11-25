  //função que recebe parâmetro de botão cadastro no header
  const urlParams = new URLSearchParams(window.location.search);
  const autoCheck = urlParams.get('auto_check');
  if (autoCheck === "true") {
      const check = document.getElementById("check");
      check.checked = true;
  };
