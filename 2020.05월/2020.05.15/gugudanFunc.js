function gugudan(x) {
    document.write('<td>')
    for (var i=1; i<=9; i++) {
        document.write(x + 'X' + i + '=' + x * i + '<br>');
    }
    document.write('</td>')
}

var numdan = 1;
var dan = 1;
document.write('<table>');
for (var i = 1; i <= 3; i++) {
    document.write('<table>');
    document.write('<tr>');
    for (var j = 1; j <= 3; j++) {
        document.write('<td>' + numdan + '단' + '</td>');
        numdan++;
    }
    document.write('</tr><tr>')
    for (var j = 1; j <= 3; j++) {
        gugudan(dan);
        dan++;
    }
    document.write('</tr></table>');
}
document.write('</table>');