var newItemCounter=5;
var mylist=document.querySelector("#list");
var mybutton=document.getElementById("button");

mybutton.addEventListener("click",create);
function create(){
    mylist.innerHTML+="<li>new Item"+newItemCounter+"</li>";
    newItemCounter++;
}