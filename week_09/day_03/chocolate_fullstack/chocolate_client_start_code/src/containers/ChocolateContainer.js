import { useEffect, useState } from "react";
import ChocolateList from "../components/ChocolateList";
import ChocolateForm from "../components/ChocolateForm";
const SERVER_URL = "http://localhost:8080"

const ChocolateContainer = () => {

    // use states 
    const [chocolates, setChocolates] = useState([]);
    const [error, setError] = useState("");

    // use effects
    useEffect(() => {
        fetch(`${SERVER_URL}/chocolates`)
        .then(response => response.json())
        .then(response => setChocolates(response))
        .catch(err => setError(err.message));

        fetch(`${SERVER_URL}/estates`)
        .then(response => response.json())
        .then(response => setEstates(response))
        .catch(err => setError(err.message));
    }, []);


    const postChocolate = (newChocolate) => {
        // delete from db
        fetch(`${SERVER_URL}/chocolates`, {
            method: "POST",
            headers: {"Content-Type": "application/json" },
            body: JSON.stringify(newChocolate),
        })
        .then((response) => response.json())
        .then((response) => {
            setChocolates([...chocolates, response])
        });
    };

    const deleteChocolate = (id) => {
        // delete from db
        fetch(`${SERVER_URL}/chocolates/${id}`, {
            method: "DELETE",
            headers:{"Content-Type": "application/json" },
        });
        //delete locally
        const newChocolates = chocolates.filter(chocolate => chocolate.id !== id)
        setChocolates(newChocolates)
    }

    if (error !=="") return <p>Error! {error}</p>;
    return (
        <>
            <ChocolateForm estates={estates} postChocolate={postChocolate} />
            <ChocolateList chocolates={chocolates}/>
            deleteChocolate={deleteChocolate}
        </>

    )


    return <p>Hello!</p>;
}

export default ChocolateContainer;