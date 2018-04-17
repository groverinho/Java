var n = parseInt(readline());
var vivos=0;
var array2 = readline().split(' ');
for(var i = 0; i < n ; i++){
	array2[i]= parseInt(array2[i]);
}
var ultimo=n-1;
for(var i = n-1; i >=0  ;i--){
	 if (i === ultimo) {
        vivos++;
    }
    ultimo = Math.min(ultimo, i - array2[i] - 1);
}
print(vivos);
