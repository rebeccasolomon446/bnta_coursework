// event listener - they wait for soemthing to happen( eg user clicking on somn, videos loading)
// when event happens, call a function

// document.addEventListener("DOMContentLoaded", () => {
//     console.log("Loaded from a js file")
// })

console.log("Loaded from a js file")

const paragraphs = document.querySelectorAll(".paragraph");
paragraphs[0].textContent = "The DOM is a hierarchical representation of the HTML elements in your document."
paragraphs[1].textContent = "It provides us with an API which allows us to traverse our HTML document."

const heading = document.querySelector("#main-heading");
heading.textContent ="Cool stuff I've learned about the DOM";

document.querySelector("h2").textContent = "Important Methods and Properties:";

//can create DOM element and add into content
const listItem1 = document.createElement("li");
listItem1.textContent = "querySelector() - select the first element that matches our query."

const listItem2 = document.createElement("li");
listItem2.textContent = "querySelectorAll() - select all elements that matches our query. Returns a nodeList"

const listItem3 = document.createElement("li");
listItem3.textContent = "convertToSpaceMonkey() - use your raygun to turn element into an astronaut monkey."

// append item to mke it its child element
const list = document.querySelector(".list");
list.appendChild(listItem1);
list.appendChild(listItem2);
list.appendChild(listItem3);

//delete a child element
list.removeChild(list.lastChild);
