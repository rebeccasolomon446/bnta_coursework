console.log("Hello dogs!");

const fetchDog = async () => {
    console.log("dob button pressed!");

    const responce = await fetch("https://dog.ceo/api/breeds/image/random");
    const jsonData = await Response.json();
    const image = document.querySelector("img");
    image.src = jsonData.message;




    //load in another set of data
    //fetch request to a different endpoint 
    const breedResponse = await fetch("https://dog.ceo/api/breed/corgi/images");
    const breedJsonData = await breedResponse.json();

    //create a div element to attach all images to. useful for flexbox
    const imagesContainer = document.createElement("div");
    //loop through each url in breedJsonData.
    breedJsonData.message.forEeach((dogImageUrl) => {
        //need to create image tag, and set its src to the input, which is a URL of a dog image
        const dogImage = document.createElement("img")
        dogImage.src = dogImageUrl;
        dogImage.alt = "Image of a dog";

        //adds the image to the div element we created
        imagesContainer.appendChild(dogImage);
    })
    //adding the div cotaining all the images to the body tag 
    document.querySelector("body").appendChild(imagesContainer);



    // comes from the fetch API for promised-based requests
    // fetch("https://dog.ceo/api/breeds/image/random")
    // .then((response) => {
    //     return response.json();
    // })
    // // refers to the response of .json(), which is a promise. The result will be a param for the callback func below
    // .then((jsonData) => {
    //     //grab image tag
    //     const image = document.querySelector("img");
    //     //set image src property to be the url in message key
    //     image.src = jsonData.message;
    // })
    // (response) argument in callback is whatever you expect the response to the promise to be
}


// button variable assigned to a query selector selecting the button element
// do this so we can add an EVENT LISTENER to the button
const button = document.querySelector("button");

// EVENT LISTENER that listens for a click on the button. 
// once clicked, the fetchDog function will be called.
button.addEventListener("click", fetchDog);
