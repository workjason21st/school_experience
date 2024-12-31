var mylist=document.querySelectorAll("a");
var myName=document.getElementById("title");
for(i=0;i<mylist.length;i++){
    mylist[i].addEventListener("click",activate);
}
function activate(){
    myName.innerHTML=this.innerHTML;
}