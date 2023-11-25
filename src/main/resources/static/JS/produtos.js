let colDisplayed = 16;
let totalCols = document.querySelectorAll('.col-4').length;
function showMoreCols() {
    const colsToDisplay = Math.min(totalCols, colDisplayed + 16);
    for (let i = colDisplayed; i < colsToDisplay; i++) {
        document.querySelectorAll('.col-4')[i].style.display = 'block';
    }
    colDisplayed = colsToDisplay;
    if (colDisplayed >= totalCols) {
        document.getElementById('load-more').style.display = 'none';
    }
}
if (totalCols <= colDisplayed) {
    document.getElementById('load-more').style.display = 'none';
}
document.getElementById('load-more').addEventListener('click', showMoreCols);
for (let i = 16; i < totalCols; i++) {
    document.querySelectorAll('.col-4')[i].style.display = 'none';
}
